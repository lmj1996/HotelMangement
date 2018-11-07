<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<link rel="stylesheet"
	href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
<script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<link rel="stylesheet" href="jqueryui/style.css">


<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-3.37.min.js"></script>



<script>
	function clearTable(){
		$("#roomList").children().remove();
		$("#paging").children().remove();
	}

	function flush() {
		alert("ds:"+$("#search"))
		alert($("#search").val());
		
		$.post("${pageContext.request.contextPath}/hotel/getAllRoom2.do", {
			"page" : 1,
			"state" : $("#state").val(),
			"floor" : $("#floor").val(),
			"type" : $("#type").val()
			
		}, function(data) {
			//清空
			clearTable();
			if(null == data)
				return
			$.each(data.listRoomDTO, function() {
				var k = '<tr>' + '<td>' + this.room.roomNum + '</td>' + '<td>' + this.room.roomState + '</td>' + '<td>' + this.room.roomFloor + '</td>' + '<td>' + this.room.roomType + '</td>' + '<td>' +this.room.roomPrice + '/天</td>';
				k = k + '<td><div class=\"dropdown\"><button type=\"button\" class=\"btn dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">操作 <span class=\"caret\"></span></button><ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">';
				if("空闲" == this.room.roomState)	{
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" data-toggle=\"modal\" data-target=\"#myModal_stay_register\" style=\"cursor: pointer;\">住宿登记</a></li>';
				}
				if("已租出" == this.room.roomState){
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" data-toggle=\"modal\" data-target=\"#myModal_stay_register\" style=\"cursor: pointer;\">换房</a></li>';
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" data-toggle=\"modal\" data-target=\"#myModal_stay_register\" style=\"cursor: pointer;\">结账</a></li>';
				}
				if("清扫中" == this.room.roomState){
					k = k + '<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" data-toggle=\"modal\" data-target=\"#myModal_stay_register\" style=\"cursor: pointer;\">完成清扫</a></li>';
				}
				k = k + "</ul></div></td></tr>";
				$("#roomList").append(k);
			});
			var paging = '<tr>'+'<td colspan="4">';
			if(1 == this.pageIndex){
				paging = paging + '第一页&nbsp;&nbsp;&nbsp;&nbsp;上一页&nbsp;&nbsp;&nbsp;&nbsp;';
			}else{
				paging = paging + '<a href=\"${pageContext.request.contextPath }/hotel/getAllRoom2.do?page=1\">'+'第一页&nbsp;&nbsp;&nbsp;&nbsp;'+'</a>'
				+ '<a href=\"${pageContext.request.contextPath }/hotel/getAllRoom2.do?page='+this.pageIndex-1+'\">'+'上一页&nbsp;&nbsp;&nbsp;&nbsp;'+'</a>'
			}
			paging = paging + '</td>'+'<td>' + '共'+this.totalPages+'页'+'</td>'
			+'<td>'+'共'+this.totalRecords+'条记录'+'</td>'
			+'<td>'+'当前第'+this.pageIndex+'页'+'</td>'
			+'<td>';
			if(this.pageIndex != this.totalPages){
				paging = paging + '<a href=\"${pageContext.request.contextPath }/hotel/getAllRoom2.do?page='+this.pageIndex+1+'\">'+'下一页&nbsp;&nbsp;&nbsp;&nbsp;'+'</a>'
				+'<a href=\"${pageContext.request.contextPath }/hotel/getAllRoom2.do?page='+this.totalPages+'\">'+'最后一页'+'</a>';
			}else{
				paging = paging + '下一页&nbsp;&nbsp;&nbsp;&nbsp; 最后一页';
			}
			paging = paging + '</td>'+'</tr>';
			$("#paging").append(paging);
		}, "json");
		
		
		
	}
</script>
</head>

<body>
	<!-- Left column -->
	<div class="templatemo-flex-row">

		<jsp:include page="/WEB-INF/jsp/left_nav.jsp"></jsp:include>

		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-top-nav-container">
				<div class="row">
					<nav class="templatemo-top-nav col-lg-12 col-md-12">
						<ul class="text-uppercase">
							<li><a
								href="${pageContext.request.contextPath}/hotel/getAllRoom.do?page=1"
								class="active">查看房间</a></li>

							<li><a href="room_charge.html">房间计费规则</a></li>
						</ul>
					</nav>
				</div>

			</div>
			<div class="templatemo-content-container">

				<div>
					<input type="button" data-toggle="modal"
						data-target="#myModal_addroom" name="" value="添加"
						class="form-control"
						style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 15%;" />


				</div>

				<div
					style="width: 30%; margin-left: 72%; margin-top: -9%; position: relative;">
					<form class="templatemo-search-form" role="search" method="post"
						action="#">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="Search"
								name="search" id="search">
						</div>
					</form>
				</div>


				<div
					style="border: 1px solid rgba(155, 155, 200, 0.5); margin-top: -3%">
					<table class="table table-hover" style="text-align: center;">
						<thead>
							<tr>
								<td>编号</td>

								<td><select id="state" onchange="flush(this)"
									class="form-control" style="text-align: center;" name="state">
										<option value="">所有</option>
										<option value="空闲">空闲</option>
										<option value="已租出">已租出</option>
										<option value="清洁中">清洁中</option>
								</select></td>

								<td><select id="floor" onchange="flush()"
									class="form-control" style="text-align: center;" name="floor">
										<option value="">所有</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
								</select></td>

								<td><select id="type" onchange="flush()"
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
							<c:forEach items="${requestScope.getRoomVO.listRoomDTO }"
								var="listDTO">
								<tr>
									<td>${listDTO.room.roomNum }</td>
									<td>${listDTO.room.roomState }</td>
									<td>${listDTO.room.roomFloor }</td>
									<td>${listDTO.room.roomType }</td>
									<td>${listDTO.room.roomPrice }/天</td>
									<td>
										<div class="dropdown">
											<button type="button" class="btn dropdown-toggle"
												id="dropdownMenu1" data-toggle="dropdown">
												操作 <span class="caret"></span>
											</button>
											<ul class="dropdown-menu" role="menu"
												aria-labelledby="dropdownMenu1">
												<c:if test="${listDTO.room.roomState =='空闲' }">
													<li role="presentation"><a role="menuitem"
														tabindex="-1" data-toggle="modal"
														data-target="#myModal_stay_register"
														style="cursor: pointer;">住宿登记</a></li>
												</c:if>
												<c:if test="${listDTO.room.roomState =='已租出' }">
													<li role="presentation"><a role="menuitem"
														tabindex="-1" data-toggle="modal"
														data-target="#myModal_stay_checkout"
														style="cursor: pointer;">住宿结账</a></li>
												</c:if>
												<c:if test="${listDTO.room.roomState =='已租出' }">
													<li role="presentation"><a role="menuitem"
														tabindex="-1" data-toggle="modal"
														data-target="#myModal_stay_changeroom"
														style="cursor: pointer;">住宿换房</a></li>
												</c:if>
												<c:if test="${listDTO.room.roomState =='清扫中' }">
													<li role="presentation"><a role="menuitem"
														tabindex="-1" href="#" style="cursor: pointer;">完成清扫</a></li>
												</c:if>
											</ul>
										</div>
									</td>
								</tr>
							</c:forEach>

						</tbody>

					</table>

					<table class="table  table-striped table-hover table-main"
						style="text-align: center;" id="paging">
						<tr>
							<td colspan="4"><c:if
									test="${requestScope.roomVO.pageIndex == 1}">第一页&nbsp;&nbsp;&nbsp;&nbsp;上一页&nbsp;&nbsp;&nbsp;&nbsp;</c:if>
								<c:if test="${requestScope.roomVO.pageIndex != 1}">
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=1">第一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.pageIndex-1}">上一页&nbsp;&nbsp;&nbsp;&nbsp;</a>

								</c:if></td>
							<td>共 ${requestScope.roomVO.totalPages } 页</td>
							<td>共 ${requestScope.roomVO.totalRecords } 条记录</td>
							<td>当前第${requestScope.roomVO.pageIndex } 页</td>

							<td><c:if
									test="${requestScope.roomVO.pageIndex != requestScope.roomVO.totalPages}">
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.pageIndex+1}">下一页&nbsp;&nbsp;&nbsp;&nbsp;</a>
									<a
										href="${pageContext.request.contextPath }/hotel/getAllRoom.do?page=${requestScope.roomVO.totalPages}">最后一页</a>
								</c:if> <c:if
									test="${requestScope.roomVO.pageIndex == requestScope.roomVO.totalPages}">下一页&nbsp;&nbsp;&nbsp;&nbsp; 最后一页</c:if></td>
						</tr>

					</table>

				</div>



				<!--
			    	作者：LMJ
			    	时间：2018-11-02
			    	描述：添加模态框
			    -->
				<div class="modal fade" id="myModal_addroom" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">添加房间</h4>
							</div>
							<form
								action="${pageContext.request.contextPath}/hotel/addRoom.do"
								method="post">
								<table class="table">

									<tr>
										<td><label>房间类型</label></td>
										<td><select class="form-control" name="roomType">
												<option>单人间</option>
												<option>双人间</option>
												<option>普通套房</option>
												<option>豪华套房</option>
												<option>商务间</option>
												<option>公寓间</option>
												<option>总统套房</option>
										</select></td>
									</tr>

									<tr>
										<td><label>房间价格</label></td>
										<td><input type="text" class="form-control"
											name="roomPrice" placeholder="房价" /></td>
									</tr>

									<tr>
										<td><label>所在楼层</label></td>
										<td><select class="form-control" name="roomFloor">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
												<option>5</option>
												<option>6</option>
										</select></td>
									</tr>



								</table>
								<div>
									<input type="submit" name="" value="添加" class="form-control"
										style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';" />
								</div>
							</form>

						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>

				<!--
			    	作者：LMJ
			    	时间：2018-11-02
			    	描述：住宿登记模态框
			    -->
				<div class="modal fade" id="myModal_stay_register" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h4 class="modal-title" id="myModalLabel">住宿登记</h4>
							</div>
							<form
								action="${pageContext.request.contextPath}/hotel/addRoom.do"
								method="post">
								<table class="table">

									<tr>
										<td><label>用户名</label></td>
										<td><input type="text" class="form-control"
											name="customerName" placeholder="用户名" /></td>
									</tr>

									<tr>
										<td><label>身份证</label></td>
										<td><input type="text" class="form-control"
											name="customerCustomerid" placeholder="身份证" /></td>
									</tr>

									<tr>
										<td><label>联系电话</label></td>
										<td><input type="text" class="form-control"
											name="customerPhone" placeholder="联系电话" /></td>
									</tr>

									<tr>
										<td><label>押金</label></td>
										<td><input type="text" class="form-control"
											name="hotelRegisterSecurity" placeholder="押金" /></td>
									</tr>

									<tr>
										<td><label>预计离开时间</label></td>
										<td><input type="text" class="form-control"
											name="hotelRegisterEndtime" id="datepicker" /></td>
									</tr>

									<tr>
										<td><label>计费类型</label></td>
										<td><select class="form-control"
											name="hotelRegisterChargingway">
												<option>普通天房</option>
												<option>午夜房</option>
												<option>钟点房</option>

										</select></td>
									</tr>

									<tr>
										<td><label>充值金额</label></td>
										<td><input type="text" class="form-control"
											name="rechargeMoney" /></td>
									</tr>


								</table>
								<div>
									<input type="submit" name="" value="添加" class="form-control"
										style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体';" />
								</div>
							</form>
							<script>
								$(function() {
									$("#datepicker").datepicker({
										changeMonth : true,
										changeYear : true
									});
								});
							</script>
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
	<script src="https://www.google.com/jsapi"></script>
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

</body>

</html>