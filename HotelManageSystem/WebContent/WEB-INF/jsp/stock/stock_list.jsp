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
		$.post("${pageContext.request.contextPath}/stock/getStockList.do", {
			"page" : page,
			"type" : $("#type").val(),
			"search" : $("#search").val()
			
		}, function(data) {
			//清空
			clearTable();
			
			if(null == data.listStockDTO||'' == data.listStockDTO){
				var x = '<tr><td colspan=\"7\">暂无数据</td></tr>';
				return $("#roomList").append(x);
			}
				
			$.each(data.listStockDTO, function() {
				var k = '<tr>' + '<td>' + this.stock.stockNum + '</td>' + '<td>' + this.stock.stockName + '</td>' + '<td>' + this.stockType.stockTypeName + '</td>' + '<td>' + this.stock.stockRetailprice + '</td>' + '<td>' +this.stock.stockNumber + '</td>';
				k = k + '<td><div class=\"dropdown\"><button type=\"button\" class=\"btn dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\">操作 <span class=\"caret\"></span></button><ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">';
				
				k = k + '<li role=\"presentation\"><a role=\"menuitem\" href=\"${pageContext.request.contextPath }/jump/jumpToStockDetail.do?stockId='+this.stock.stockId+'\">查看详情</a></li>';
				k = k + '<li role=\"presentation\"><a role=\"menuitem\" href=\"${pageContext.request.contextPath }/stock/deleteStock.do?stockId='+this.stock.stockId+'\">删除该库存</a></li>';
				
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
								href="${pageContext.request.contextPath}/jump/jumpToStockList.do"
								class="active">查看库存</a></li>
						</ul>
					</nav>
				</div>

			</div>
			<div class="templatemo-content-container">

				<div>
					<a href="${pageContext.request.contextPath }/jump/jumpToStockAdd.do">
						<input type="button" value="添加" class="form-control"
						style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 15%;" />
					</a>
				</div>

				<div
					style="width: 30%; margin-left: 72%; margin-top: -9%; position: relative;">
					<div class="templatemo-search-form" role="search">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="搜索库存名称/编号"
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

								<td>名称</td>

								<td><select id="type" onchange="flush('1')"
									class="form-control" style="text-align: center;">
										<option value="">种类</option>
										<option value="s001">小吃</option>
										<option value="s002">饮料</option>
										<option value="s003">熟食</option>
										<option value="s004">食材</option>
										<option value="s005">清洁道具</option>
								</select></td>

								<td>单价(元)</td>

								<td>剩余数量</td>
								
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
			if (s == "addStock") {
				toastr.success("添加库存成功!")
			}
			if (s == "delete") {
				toastr.success("删除库存成功!")
			}
			if (s == "updateStock") {
				toastr.success("更改库存成功!")
			}
		})();
	</script>

</body>

</html>