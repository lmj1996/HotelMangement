<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title></title>
<link href="${pageContext.request.contextPath}/css/bootstrap_s.css"
	rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/css/style2.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="${pageContext.request.contextPath}/css/style1.css"
	rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Mr Hotel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		
</script>
<!--Google Fonts-->

<!--google fonts-->
<!-- animated-css -->
<link href="${pageContext.request.contextPath}/css/animate.css"
	rel="stylesheet" type="text/css" media="all">
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
<!-- animated-css -->
<script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
<script>
	$(document).ready(function() {
		if (Modernizr.touch) {
			// show the close overlay button
			$(".close-overlay").removeClass("hidden");
			// handle the adding of hover class when clicked
			$(".branch-gd").click(function(e) {
				if (!$(this).hasClass("hover")) {
					$(this).addClass("hover");
				}
			});
			// handle the closing of the overlay
			$(".close-overlay").click(function(e) {
				e.preventDefault();
				e.stopPropagation();
				if ($(this).closest(".branch-gd").hasClass("hover")) {
					$(this).closest(".branch-gd").removeClass("hover");
				}
			});
		} else {
			// handle the mouseenter functionality
			$(".branch-gd").mouseenter(function() {
				$(this).addClass("hover");
			})
			// handle the mouseleave functionality
			.mouseleave(function() {
				$(this).removeClass("hover");
			});
		}
	});
</script>

<script src="${pageContext.request.contextPath}/js/echarts.js"></script>


</head>

<body>

	<div class="header">
		<div class="fixed-header">
			<div class="navbar-wrapper">
				<div class="container">
					<nav class="navbar navbar-inverse navbar-static-top">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse" data-target="#navbar"
								aria-expanded="false" aria-controls="navbar">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<div class="logo wow slideInLeft" data-wow-delay="0.3s">
								<a class="navbar-brand"
									href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><img
									src="${pageContext.request.contextPath}/images/logo1.png"
									style="width: 151px; height: 55px; margin-top: -17px; margin-bottom: 20px;" /></a>
							</div>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<nav class="cl-effect-16" id="cl-effect-16">
								<ul class="nav navbar-nav">
									<li><a class="active"
										href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"
										data-hover="首页">首页</a></li>

									<li><a href="${pageContext.request.contextPath}/jump/jumpToCheckIn.do" data-hover="住宿登记">住宿登记</a></li>

									<li><a href="${pageContext.request.contextPath}/jump/jumpToRoom.do" data-hover="房间">房间</a></li>

								</ul>
							</nav>

						</div>
						<div class="clearfix"></div>
					</nav>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--header end here-->
	<!--banner  start hwew-->
	<div class="banner">
		<div class="container">
			<div class="banner-main wow zoomIn" data-wow-delay="0.3s"
				style="margin-top: 0; background-color: rgba(250, 250, 250, 0.8); width: 750px;">
				<div id="chart1" style="width: 700px; height: 400px;"></div>

				<!--<h2>MR HOTELS</h2>
			<h6>Welcome To Our Hotels</h6>
			<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>-->
			</div>
		</div>
	</div>

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

</body>

</html>