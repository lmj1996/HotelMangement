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

<meta name="description" content="">
<meta name="author" content="templatemo">



</head>
<body>
	<div class="templatemo-sidebar">
		<header class="templatemo-site-header">
			<h1>龙腾酒店管理系统</h1>
		</header>
		<div class="profile-photo-container">
			<img src="${pageContext.request.contextPath}/images/banner3.jpg"
				alt="Profile Photo" class="img-responsive"
				style="width: auto; height: auto;">
			<div class="profile-photo-overlay"></div>
		</div>

		<div class="mobile-menu-icon">
			<i class="fa fa-bars"></i>
		</div>
		<nav class="templatemo-left-nav">
			<ul>

				<%-- 	<li><a class="active"
						href="${pageContext.request.contextPath}/jump/jumpToHome.do">
							<i class="fa fa-area-chart fa-fw"></i>首页
					</a></li>
					<shiro:hasAnyRoles name="room-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"><i
								class="fa fa-home fa-fw"></i>房间</a></li>
					</shiro:hasAnyRoles>

					<shiro:hasAnyRoles name="staff-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffList.do"><i
								class="fa fa-users fa-fw"></i>员工</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="stock-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStockList.do"><i
								class="fa fa-database fa-fw"></i>库存</a></li>
					</shiro:hasAnyRoles> --%>

				<c:if test="${requestScope.sc.choice == 1 }">

					<li><a class="active"
						href="${pageContext.request.contextPath}/jump/jumpToHome.do">
							<i class="fa fa-area-chart fa-fw"></i>首页
					</a></li>
					<shiro:hasAnyRoles name="room-manager,s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"><i
								class="fa fa-home fa-fw"></i>房间</a></li>
					</shiro:hasAnyRoles>

					<shiro:hasAnyRoles name="staff-manager,s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffList.do"><i
								class="fa fa-users fa-fw"></i>员工</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="stock-manager,s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStockList.do"><i
								class="fa fa-database fa-fw"></i>库存</a></li>
					</shiro:hasAnyRoles>
					
					<shiro:hasAnyRoles name="index-checker,s-administrator,total-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><i
								class="fa fa-building fa-fw"></i>员工操作页面</a></li>
					</shiro:hasAnyRoles>
					
					<li><a
						href="${pageContext.request.contextPath}/staff/logout.do"><i
							class="fa fa-power-off fa-fw"></i>注销</a></li>

				</c:if>

				<c:if test="${sessionScope.sc.choice == 2 }">

					<li><a
						href="${pageContext.request.contextPath}/jump/jumpToHome.do">
							<i class="fa fa-area-chart fa-fw"></i>首页
					</a></li>
					<shiro:hasAnyRoles name="room-manager, s-administrator">
						<li><a class="active"
							href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"><i
								class="fa fa-home fa-fw"></i>房间</a></li>
					</shiro:hasAnyRoles>

					<shiro:hasAnyRoles name="staff-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffList.do"><i
								class="fa fa-users fa-fw"></i>员工</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="stock-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStockList.do"><i
								class="fa fa-database fa-fw"></i>库存</a></li>
					</shiro:hasAnyRoles>
					
					<shiro:hasAnyRoles name="index-checker,s-administrator,total-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><i
								class="fa fa-building fa-fw"></i>员工操作页面</a></li>
					</shiro:hasAnyRoles>

					<li><a
						href="${pageContext.request.contextPath}/staff/logout.do"><i
							class="fa fa-power-off fa-fw"></i>注销</a></li>
				</c:if>

				<c:if test="${sessionScope.sc.choice == 3 }">

					<li><a
						href="${pageContext.request.contextPath}/jump/jumpToHome.do">
							<i class="fa fa-area-chart fa-fw"></i>首页
					</a></li>
					<shiro:hasAnyRoles name="room-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"><i
								class="fa fa-home fa-fw"></i>房间</a></li>
					</shiro:hasAnyRoles>

					<shiro:hasAnyRoles name="staff-manager, s-administrator">
						<li><a class="active"
							href="${pageContext.request.contextPath}/jump/jumpToStaffList.do"><i
								class="fa fa-users fa-fw"></i>员工</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="stock-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStockList.do"><i
								class="fa fa-database fa-fw"></i>库存</a></li>
					</shiro:hasAnyRoles>
					
					<shiro:hasAnyRoles name="index-checker,s-administrator,total-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><i
								class="fa fa-building fa-fw"></i>员工操作页面</a></li>
					</shiro:hasAnyRoles>

					<li><a
						href="${pageContext.request.contextPath}/staff/logout.do"><i
							class="fa fa-power-off fa-fw"></i>注销</a></li>
				</c:if>

				<c:if test="${sessionScope.sc.choice == 4 }">

					<li><a
						href="${pageContext.request.contextPath}/jump/jumpToHome.do">
							<i class="fa fa-area-chart fa-fw"></i>首页
					</a></li>
					<shiro:hasAnyRoles name="room-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToRoomList.do"><i
								class="fa fa-home fa-fw"></i>房间</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="staff-manager, s-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffList.do"><i
								class="fa fa-users fa-fw"></i>员工</a></li>
					</shiro:hasAnyRoles>
					<shiro:hasAnyRoles name="stock-manager, s-administrator">
						<li><a class="active"
							href="${pageContext.request.contextPath}/jump/jumpToStockList.do"><i
								class="fa fa-database fa-fw"></i>库存</a></li>
					</shiro:hasAnyRoles>
					
					<shiro:hasAnyRoles name="index-checker,s-administrator,total-administrator">
						<li><a
							href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><i
								class="fa fa-building fa-fw"></i>员工操作页面</a></li>
					</shiro:hasAnyRoles>

					<li><a
						href="${pageContext.request.contextPath}/staff/logout.do"><i
							class="fa fa-power-off fa-fw"></i>注销</a></li>
				</c:if>

			</ul>
		</nav>
	</div>


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
	<!-- Templatemo Script -->
</body>
</html>
