<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title></title>
		<link href="${pageContext.request.contextPath}/css/bootstrap_s.css" rel="stylesheet" type="text/css" media="all">
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
		<!-- Custom Theme files -->
		<link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet" type="text/css" media="all" />
		<link href="${pageContext.request.contextPath}/css/style1.css" rel="stylesheet" type="text/css" media="all" />
		<!-- Custom Theme files -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Mr Hotel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
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
		<link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet" type="text/css" media="all">
		<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
		<script>
			new WOW().init();
		</script>
		<!-- animated-css -->
		<script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
		<script>
			$(document).ready(function() {
				if(Modernizr.touch) {
					// show the close overlay button
					$(".close-overlay").removeClass("hidden");
					// handle the adding of hover class when clicked
					$(".branch-gd").click(function(e) {
						if(!$(this).hasClass("hover")) {
							$(this).addClass("hover");
						}
					});
					// handle the closing of the overlay
					$(".close-overlay").click(function(e) {
						e.preventDefault();
						e.stopPropagation();
						if($(this).closest(".branch-gd").hasClass("hover")) {
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
								<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			                <span class="sr-only">Toggle navigation</span>
			                <span class="icon-bar"></span>
			                <span class="icon-bar"></span>
			                <span class="icon-bar"></span>
			              </button>
								<div class="logo wow slideInLeft" data-wow-delay="0.3s">
									<a class="navbar-brand" href="staff index.html"><img src="${pageContext.request.contextPath}/images/logo1.png" style="width: 151px;height: 55px;margin-top: -17px;margin-bottom: 20px;" /></a>
								</div>
							</div>
							<div id="navbar" class="navbar-collapse collapse">
								<nav class="cl-effect-16" id="cl-effect-16">
									<ul class="nav navbar-nav">
										<li>
											<a class="active" href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do" data-hover="首页">首页</a>
										</li>
										
										<li>
											<a href="check in.html" data-hover="住宿登记">住宿登记</a>
										</li>
										
										<li>
											<a href="tariff.html" data-hover="房间">房间</a>
										</li>
										
									</ul>
								</nav>

							</div>
							<div class="clearfix"> </div>
						</nav>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--header end here-->
		<!--banner  start hwew-->
		<div class="banner">
			<div class="container">
				<div class="banner-main wow zoomIn" data-wow-delay="0.3s" style="margin-top: 0;background-color: rgba(50,50,50,0.6);">
					<div id="chart1" style="width:500px;height:400px"></div>
					
					<!--<h2>MR HOTELS</h2>
			<h6>Welcome To Our Hotels</h6>
			<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>-->
				</div>
			</div>
		</div>

<script type="text/javascript">
		// 基于准备好的dom，初始化echarts图表
		var myChart = echarts.init(document.getElementById('chart1'));
		
	/*	var _data = null;
		each(function(n.i){
			
			_data.push({
				name:n.String,
				value:n.Integer
			})
			
		})*/
		
		
		
		option = {
			title: {
				text: '',
				subtext: '',
				x: 'right',
				y: 'bottom'
			},
			tooltip: {
				trigger: 'item',
				formatter: "{a} <br/>{b} : {c} ({d}%)"
			},
			legend: {
				orient: 'vertical',
				x: 'left',
				data: ['Chrome', 'Firefox', 'Safari', 'IE9+', 'IE8-']
			},
			toolbox: {
				show: true/*,
				feature: {
					mark: {
						show: true
					},
					dataView: {
						show: true,
						readOnly: false
					},
					restore: {
						show: true
					},
					saveAsImage: {
						show: true
					}
				}*/
			},
			calculable: false,
			series: (function() {
				var series = [];
				// List<String,Integer>  each()
//				series.push();
				
				
				for(var i = 0; i < 30; i++) {
					
					series.push({
						name: 'kokoko',
						type: 'pie',
						itemStyle: {
							normal: {
								label: {
									show: i > 28
								},
								labelLine: {
									show: i > 28,
									length: 20
								}
							}
						},
						radius: [i * 4 + 40, i * 4 + 43],
						data: [{
								value: i * 128 + 80,
								name: 'Chrome'
							},
							{
								value: i * 64 + 160,
								name: 'Firefox'
							},
							{
								value: i * 32 + 320,
								name: 'Safari'
							},
							{
								value: i * 16 + 640,
								name: 'IE9+'
							},
							{
								value: i * 8 + 1280,
								name: 'IE8-'
							}
						]
					})
					
				}
				series[0].markPoint = {
					symbol: 'emptyCircle',
					symbolSize: series[0].radius[0],
					effect: {
						show: true,
						scaleSize: 6,
						color: 'rgba(250,225,50,0.8)',
						shadowBlur: 10,
						period: 30
					},
					data: [{
						x: '50%',
						y: '50%'
					}]
				};
				return series;
			})()
		};
		/*setTimeout(function() {
			var _ZR = myChart.getZrender();
			var TextShape = require('zrender/shape/Text');
			// 补充千层饼
			_ZR.addShape(new TextShape({
				style: {
					x: _ZR.getWidth() / 2,
					y: _ZR.getHeight() / 2,
					color: '#666',
					text: '恶梦的过去',
					textAlign: 'center'
				}
			}));
			_ZR.addShape(new TextShape({
				style: {
					x: _ZR.getWidth() / 2 + 200,
					y: _ZR.getHeight() / 2,
					brushType: 'fill',
					color: 'orange',
					text: '美好的未来',
					textAlign: 'left',
					textFont: 'normal 20px 微软雅黑'
				}
			}));
			_ZR.refresh();
		}, 2000);*/

		// 为echarts对象加载数据 
		myChart.setOption(option);
	</script>

	</body>

</html>