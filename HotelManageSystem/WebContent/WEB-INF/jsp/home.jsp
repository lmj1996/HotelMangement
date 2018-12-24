<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<link href="${pageContext.request.contextPath}/css/bootstrap_s.css"
	rel="stylesheet" type="text/css" media="all">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<link href="${pageContext.request.contextPath}/css/style2.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="${pageContext.request.contextPath}/css/style1.css"
	rel="stylesheet" type="text/css" media="all" />

<link href="${pageContext.request.contextPath}/css/css_google.css"
	rel='stylesheet' type='text/css'>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/echarts.js"></script>
</head>

<body>

	<!-- Left column -->
	<div class="templatemo-flex-row">

		<jsp:include page="left_nav.jsp"></jsp:include>

	
	<!-- Main content -->
	<div class="templatemo-content col-1 light-gray-bg">
		<div class="templatemo-top-nav-container">
			<div class="row">
				<nav class="templatemo-top-nav col-lg-12 col-md-12">
					<ul class="text-uppercase">
						<li><shiro:principal property="staffName"></shiro:principal>,欢迎使用本系统</li>
					</ul>
				</nav>
			</div>
		</div>
		<div class="templatemo-content-container">
		<div id="chart1" style="width:950px;height: 400px;"></div>
			<%-- <img src="${pageContext.request.contextPath}/images/banner3.jpg"
				style="width: 82%; height: 65%;" /> --%>
		</div>
	</div>
</div>


	<!-- JS -->

	<script type="text/javascript">
		indexInfo();
		function indexInfo() {
			$.post("${pageContext.request.contextPath}/hotel/getIndexInfo.do",
					function(indexInfo) {
						console.log(indexInfo)

						var listDate = indexInfo.listDate;
						var listSingle = indexInfo.listSingle;
						var listDouble = indexInfo.listDouble;
						var listOrdinary = indexInfo.listOrdinary;
						var listLuxury = indexInfo.listLuxury;
						var listBusiness = indexInfo.listBusiness;
						var listApartment = indexInfo.listApartment;
						var listPresident = indexInfo.listPresident;

						// 基于准备好的dom，初始化echarts图表
						var myChart = echarts.init(document
								.getElementById('chart1'));

						/*	var _data = null;
							each(function(n.i){
								
								_data.push({
									name:n.String,
									value:n.Integer
								})
								
							})*/

						option = {

							title : {
								text : '最近7日入住情况',
								x : 'center',
								y : 'top',
								padding : 375,
								textStyle : {
									fontSize : 25
								}
							},
							tooltip : {
								trigger : 'axis'
							},
							legend : {
								data : [ '单人间', '双人间', '普通套房', '豪华套房', '商务间',
										'公寓间', '总统套房' ]
							},
							toolbox : {
								show : false,
								feature : {
									mark : {
										show : true
									},
									dataView : {
										show : true,
										readOnly : false
									},
									magicType : {
										show : true,
										type : [ 'line', 'bar', 'stack',
												'tiled' ]
									},
									restore : {
										show : true
									},
									saveAsImage : {
										show : true
									}
								}
							},
							calculable : true,
							xAxis : [ {
								type : 'category',
								boundaryGap : false,
								data : listDate
							} ],
							yAxis : [ {
								type : 'value'
							} ],
							series : [ {
								name : '单人间',
								type : 'line',
								stack : '1',
								data : listSingle
							}, {
								name : '双人间',
								type : 'line',
								stack : '2',
								data : listDouble
							}, {
								name : '普通套房',
								type : 'line',
								stack : '3',
								data : listOrdinary
							}, {
								name : '豪华套房',
								type : 'line',
								stack : '4',
								data : listLuxury
							}, {
								name : '商务间',
								type : 'line',
								stack : '5',
								data : listBusiness
							}, {
								name : '公寓间',
								type : 'line',
								stack : '6',
								data : listApartment
							}, {
								name : '总统套房',
								type : 'line',
								stack : '7',
								data : listPresident
							} ]
						};

						// 为echarts对象加载数据 
						myChart.setOption(option);

					}, "json");
		}
	</script>

	<script
		src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script>
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