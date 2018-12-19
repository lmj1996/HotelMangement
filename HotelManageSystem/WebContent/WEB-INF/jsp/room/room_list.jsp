<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>
<meta name="description" content="">
<meta name="author" content="templatemo">

<link href="${pageContext.request.contextPath}/css/css_google.css"
	rel='stylesheet' type='text/css'>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">

<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
<script
	src="${pageContext.request.contextPath}/js/bootstrap-3.37.min.js"></script>
<script src="${pageContext.request.contextPath}/js/toastr.js"></script>
<link href="${pageContext.request.contextPath}/css/toastr.css"
	rel="stylesheet">
<script>
	function clearTable(){
		$("#roomList").children().remove();
		$("#paging").children().remove();
	}

	flush(1);
	
	function flush(page) {
		$.post("${pageContext.request.contextPath}/hotel/getAllRoom.do", {
			"page" : page,
			"state" : $("#state").val(),
			"floor" : $("#floor").val(),
			"type" : $("#type").val(),
			"search" : $("#search").val()
			
		}, function(data) {
			//清空
			clearTable();
			
			if(null == data)
				return
			$.each(data.listRoomDTO, function() {
				var k = '<tr>' + '<td>' + this.room.roomNum + '</td>' + '<td>' + this.room.roomState + '</td>' + '<td>' + this.room.roomFloor + '</td>' + '<td>' + this.room.roomType + '</td>' + '<td>' +this.room.roomPrice + '元/天</td>';
				k = k + '<td><div class=\"dropdown\"><button type=\"button\" class=\"btn dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">操作 <span class=\"caret\"></span></button><ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">';
				if("空闲" == this.room.roomState)	{
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" href=\"${pageContext.request.contextPath }/jump/jumpToStayRegister.do?roomId='+this.room.roomId+'\">住宿登记</a></li>';
				}
				if("已入住" == this.room.roomState){
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" href=\"${pageContext.request.contextPath }/jump/jumpToCheckOut.do?roomId='+this.room.roomId+'\">结账</a></li>';
				}
				if("清扫中" == this.room.roomState){
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" data-toggle=\"modal\" data-target=\"#myModal_clean\" style=\"cursor: pointer;\" id=\"'+this.room.roomId+'\" onclick=\"sendIdToRoomClean(this.id)\">完成清扫</a></li>';
				}
				k = k + "</ul></div></td></tr>";
				$("#roomList").append(k);
			});
			var paging = '<tr>'+'<td colspan="4">';
			if(1 == data.pageIndex){
				paging = paging + '第一页\&nbsp;\&nbsp;\&nbsp;\&nbsp;上一页\&nbsp;\&nbsp;\&nbsp;\&nbsp;';
			}else{
				paging = paging + '<a href=\"javascript:void(0);\" onclick=\"flush('+1+')\">'+'第一页\&nbsp;\&nbsp;\&nbsp;\&nbsp;'+'</a>'
				+ '<a href=\"javascript:void(0);\" onclick=\"flush('+parseInt(data.pageIndex-1)+')\">'+'上一页\&nbsp;\&nbsp;\&nbsp;\&nbsp;'+'</a>'
			}
			paging = paging + '</td>'+'<td>' + '共 '+data.totalPages+' 页'+'</td>'
			+'<td>'+'共 '+data.totalRecords+' 条记录'+'</td>'
			+'<td>'+'当前第 '+data.pageIndex+' 页'+'</td>'
			+'<td>';
			if(data.pageIndex != data.totalPages){
				
				paging = paging + '<a href=\"javascript:void(0);\" onclick=\"flush('+parseInt(data.pageIndex+1)+')\">'+'下一页\&nbsp;\&nbsp;\&nbsp;\&nbsp;'+'</a>'
				+'<a href=\"javascript:void(0);\" onclick=\"flush('+data.totalPages+')\">'+'最后一页'+'</a>';
			}else{
				paging = paging + '下一页\&nbsp;\&nbsp;\&nbsp;\&nbsp; 最后一页';
			}
			paging = paging + '</td>'+'</tr>';
			$("#paging").append(paging);
		}, "json");
		
		
		
	}
	
	function sendIdToRoomClean(id){
		$("#roomId_clean").val(id);
	}
</script>



</head>

<body>
	<div class="templatemo-flex-row">

		<jsp:include page="/WEB-INF/jsp/left_nav.jsp"></jsp:include>


		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<ul class="text-uppercase">
							<li><a
								href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"
								class="active">查看房间</a></li>

							<%-- <li><a
								href="${pageContext.request.contextPath}/jump/jumpToChargeWay.do">房间计费规则</a></li> --%>
						</ul>
					</nav>
				</div>

			</div>
			<div class="templatemo-content-container">

				<shiro:hasPermission name="room-manager:add">
					<div>
						<a href="${pageContext.request.contextPath }/jump/jumpToRoomAdd.do">
							<input type="button" value="添加" class="form-control"
							style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 15%;" />
						</a>
					</div>
				</shiro:hasPermission>

				<div
					style="width: 30%; margin-left: 72%; margin-top: -9%; position: relative;">
					<div class="templatemo-search-form" role="search">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="搜索房间编号"
								name="search" id="search" onkeyup="flush('1')">
						</div>
					</div>
				</div>


				<div
					style="border: 1px solid rgba(155, 155, 200, 0.5); margin-top: -3%">
					<table class="table table-hover" style="text-align: center;">
						<thead>
							<tr>
								<td>编号</td>

								<td><select id="state" onchange="flush('1')"
									class="form-control" style="text-align: center;" name="state">
										<option value="">所有</option>
										<option value="空闲">空闲</option>
										<option value="已入住">已入住</option>
										<option value="清洁中">清洁中</option>
								</select></td>

								<td><select id="floor" onchange="flush('1')"
									class="form-control" style="text-align: center;" name="floor">
										<option value="">所有</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
										<option value="6">6</option>
										<option value="7">7</option>
								</select></td>

								<td><select id="type" onchange="flush('1')"
									class="form-control" style="text-align: center;" name="type">
										<option value="">所有</option>
										<option value="单人间">单人间</option>
										<option value="双人间">双人间</option>
										<option value="普通套房">普通套房</option>
										<option value="高级套房">高级套房</option>
										<option value="商务间">商务间</option>
										<option value="公寓间">公寓间</option>
										<option value="总统套房">总统套房</option>
								</select></td>

								<td>价格</td>

								<td>操作</td>

							</tr>
						</thead>

						<tbody id="roomList">

						</tbody>

					</table>

					<table class="table  table-striped table-hover table-main"
						style="text-align: center;" id="paging">

					</table>

				</div>




				<!--
			    	作者：LMJ
			    	时间：2018-11-02
			    	描述：完成清扫模态框
			    -->
				<div class="modal fade" id="myModal_clean" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">清扫完成确认</h4>
							</div>
							<form
								action="${pageContext.request.contextPath}/hotel/updateRoom.do"
								method="post">
								<input type="hidden" id="roomId_clean" name="roomId" />
								<div class="modal-body" style="text-align: center;">是否清扫完成？</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">关闭</button>
									<button type="submit" class="btn btn-primary">确认清扫完成</button>
								</div>

							</form>

						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>


			</div>
		</div>
	</div>

	<!-- JS -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
	<!--  jQuery Migrate Plugin -->
	<!-- <script src="https://www.google.com/jsapi"></script> -->
	<!-- Google Chart -->
	<script>
		/* Google Chart 
					      -------------------------------------------------------------------*/
		// Load the Visualization API and the piechart package.
		google.load('visualization', '1.0', {
			'packages' : [ 'corechart' ]
		});

		// Set a callback to run when the Google Visualization API is loaded.
		google.setOnLoadCallback(drawChart);

		// Callback that creates and populates a data table,
		// instantiates the pie chart, passes in the data and
		// draws it.
		function drawChart() {

			// Create the data table.
			var data = new google.visualization.DataTable();
			data.addColumn('string', 'Topping');
			data.addColumn('number', 'Slices');
			data.addRows([ [ 'Mushrooms', 3 ], [ 'Onions', 1 ],
					[ 'Olives', 1 ], [ 'Zucchini', 1 ], [ 'Pepperoni', 2 ] ]);

			// Set chart options
			var options = {
				'title' : 'How Much Pizza I Ate Last Night'
			};

			// Instantiate and draw our chart, passing in some options.
			var pieChart = new google.visualization.PieChart(document
					.getElementById('pie_chart_div'));
			pieChart.draw(data, options);

			var barChart = new google.visualization.BarChart(document
					.getElementById('bar_chart_div'));
			barChart.draw(data, options);
		}

		$(document).ready(function() {
			if ($.browser.mozilla) {
				//refresh page on browser resize
				// http://www.sitepoint.com/jquery-refresh-page-browser-resize/
				$(window).bind('resize', function(e) {
					if (window.RT)
						clearTimeout(window.RT);
					window.RT = setTimeout(function() {
						this.location.reload(false); /* false to get page from cache */
					}, 200);
				});
			} else {
				$(window).resize(function() {
					drawChart();
				});
			}
		});
	</script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	
	<script type="text/javascript">
		;
		(function toastrSuccess() {
			var s = '${requestScope.state}';
			if (s == "addRoom") {
				toastr.success("添加房间成功!")
			}
			if (s == "updateRoom") {
				toastr.success("更新房间成功!")
			}
			if (s == "stayOverNight") {
				toastr.success("住宿登记成功!")
			}
			if (s == "checkSuccess") {
				toastr.success("结账成功!")
			}
		})();
	</script>

</body>

</html>