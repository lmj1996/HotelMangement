<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="en">
	<head>
		
		
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<meta name="description" content="">
		<meta name="author" content="templatemo">
		
		
		<script type="text/javascript">
			function removeClass(){
				var f = document.getElementsByClassName("c");
				$.each(f,function(){
					f.removeClass();					
				})
			}
			
			alert(${sessionScope.session.choice});
			if("1" == ${sessionScope.session.choice}){
				function addClass1(e){
					$(e).addClass("active");
				}
			}
			if("2" == ${sessionScope.session.choice}){
				function addClass2(e){
					$(e).addClass("active");
				}
			}
			
			if("3" == ${sessionScope.session.choice}){
				function addClass3(e){
					$(e).addClass("active");
				}
			}
			if("4" == ${sessionScope.session.choice}){
				function addClass4(e){
					$(e).addClass("active");
				}
			}
			
		</script>
	</head>
	<body>
			<div class="templatemo-sidebar">
				<header class="templatemo-site-header">
					<h1>龙腾酒店管理系统</h1>
				</header>
				<div class="profile-photo-container">
					<img src="${pageContext.request.contextPath}/images/banner3.jpg" alt="Profile Photo" class="img-responsive" style="width: auto;height: auto;">
					<div class="profile-photo-overlay"></div>
				</div>
				
				<div class="mobile-menu-icon">
					<i class="fa fa-bars"></i>
				</div>
				<nav class="templatemo-left-nav">
					<ul>
						<li>
							<a class="c" onclick="addClass1(this)" href="${pageContext.request.contextPath}/jump/jumpToHome.do" ><i class="fa fa-area-chart fa-fw"></i>首页</a>
						</li>
						<li>
							<a class="c" onclick="addClass2(this)" href="${pageContext.request.contextPath}/hotel/getAllRoom.do?page=1" ><i class="fa fa-home fa-fw"></i>房间</a>
						</li>
						<li>
							<a class="c" onclick="addClass3(this)" href="#" ><i class="fa fa-users fa-fw"></i>员工</a>
						</li>
						<li>
							<a class="c" onclick="addClass4(this)" href="#" ><i class="fa fa-database fa-fw"></i>库存</a>
						</li>
					</ul>
				</nav>
			</div>
			
			
		<!-- Google Chart -->
		<script>
			/* Google Chart 
						      -------------------------------------------------------------------*/
			// Load the Visualization API and the piechart package.
			google.load('visualization', '1.0', {
				'packages': ['corechart']
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
				data.addRows([
					['Mushrooms', 3],
					['Onions', 1],
					['Olives', 1],
					['Zucchini', 1],
					['Pepperoni', 2]
				]);

				// Set chart options
				var options = {
					'title': 'How Much Pizza I Ate Last Night'
				};

				// Instantiate and draw our chart, passing in some options.
				var pieChart = new google.visualization.PieChart(document.getElementById('pie_chart_div'));
				pieChart.draw(data, options);

				var barChart = new google.visualization.BarChart(document.getElementById('bar_chart_div'));
				barChart.draw(data, options);
			}

			$(document).ready(function() {
				if($.browser.mozilla) {
					//refresh page on browser resize
					// http://www.sitepoint.com/jquery-refresh-page-browser-resize/
					$(window).bind('resize', function(e) {
						if(window.RT) clearTimeout(window.RT);
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
