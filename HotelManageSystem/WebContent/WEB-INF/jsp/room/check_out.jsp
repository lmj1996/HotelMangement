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

<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
<script
	src="${pageContext.request.contextPath}/js/bootstrap-3.37.min.js"></script>
	

	
	
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
								href="${pageContext.request.contextPath}/jump/jumpToRoomList.do">查看房间</a></li>

							<li><a
								href="${pageContext.request.contextPath}/jump/jumpToChargeWay.do">房间计费规则</a></li>
						</ul>
					</nav>
				</div>

			</div>
			<div class="templatemo-content-container">
				<div
					style="border: 1px solid rgba(155, 155, 200, 0.5);width:50%;margin-left: 25%">
					<form action="${pageContext.request.contextPath}/hotel/checkOut.do"
						method="post">
						<input type="hidden" id="roomId_hide" name="roomId" value="${requestScope.roomId }" /> 
						<table class="table table-hover" style="text-align: center;">
							<tr>
								<td><label>客户名：</label></td>
								<td><input type="text"   id="customerName" name="customerName" /></td>
							</tr>
							<tr>
								<td><label>身份证号：</label></td>
								<td><input type="text"   id="customerCustomerid" name="customerCustomerid" /></td>
							</tr>
							<tr>
								<td><label>当前消费总金额：</label></td>
								<td><input type="text"   id="hotelRegisterTotalprice" name="hotelRegisterTotalprice" /></td>
							</tr>
							<tr>
								<td><label>押金：</label></td>
								<td><input type="text"   id="hotelRegisterSecurity" name="hotelRegisterSecurity" /></td>
							</tr>
							<tr>
								<td><label>结算金额:</label></td>
								<td><input type="text" id="settleMoney" /></td>
							</tr>
							
						</table>
						<div>
							<input type="submit" name="" value="结账" class="form-control"
								style="border-radius: 15px; background-color: #23527C; color: #FFFFFF; font-family: '宋体'; width: 40%;margin-left: 30%;" />
						</div>
					</form>


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
	
	<script>
		getInfo();
	
		function getInfo(){
			
			$.post("${pageContext.request.contextPath}/hotel/getCheckOutInfo.do",{
				"roomId" : $("#roomId_hide").val()
			},function(data){
				console.log(data)
				if(null == data)
					return
				$("#customerName").val(data.customer.customerName);
				$("#customerCustomerid").val(data.customer.customerCustomerid);
				$("#hotelRegisterTotalprice").val(data.hotelRegister.hotelRegisterTotalprice);
				$("#hotelRegisterSecurity").val(data.hotelRegister.hotelRegisterSecurity);
				$("#settleMoney").val(data.settleMoney);
			},"json");
		}
	
	</script>
	
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>
</body>
</html>