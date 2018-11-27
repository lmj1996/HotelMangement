<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">
	
<link href="${pageContext.request.contextPath}/css/bootstrap_s.css" rel="stylesheet" type="text/css" media="all">
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
		<!-- Custom Theme files -->
		<link href="${pageContext.request.contextPath}/css/style_tr.css" rel="stylesheet" type="text/css" media="all" />
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
									<a class="navbar-brand" href="staff index.html"><img src="${pageContext.request.contextPath}/images/logo1.png" style="width: 151px;height: 55px;margin-top: -50px;margin-bottom: 20px;" /></a>
								</div>
							</div>
							<div id="navbar" class="navbar-collapse collapse">
								<nav class="cl-effect-16" id="cl-effect-16">
									<ul class="nav navbar-nav" style="padding-top: 15px;">
										<li>
											<a href="staff index.html" data-hover="首页">首页</a>
										</li>
										<li>
											<a href="check in.html" data-hover="住宿登记">住宿登记</a>
										</li>
										<li>
											<a class="active" href="tariff.html" data-hover="房间">房间</a>
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
		
<div class="banner">
<div class="wrap">
<div class="wrapper">
 
<div class="tariff-content">
<div class="content">
<div class="sub1">
<table class="tariff_table" summary="Sample Table" style="width:100%;">

	<thead>
      <tr>
        <th scope="col">单人间</th>
        <th scope="col">总数：80</th>
        <th scope="col">已入住：40</th>
        <th scope="col">剩余：40</th>
      </tr>
    </thead>
    
     <thead>
      <tr>
        <th scope="col">单人间</th>
        <th scope="col">总数：80</th>
        <th scope="col">已入住：40</th>
        <th scope="col">剩余：40</th>
      </tr>
    </thead>
    
     <thead>
      <tr>
        <th scope="col">单人间</th>
        <th scope="col">总数：80</th>
        <th scope="col">已入住：40</th>
        <th scope="col">剩余：40</th>
      </tr>
    </thead>
    
     <thead>
      <tr>
        <th scope="col">单人间</th>
        <th scope="col">总数：80</th>
        <th scope="col">已入住：40</th>
        <th scope="col">剩余：40</th>
      </tr>
    </thead>

</table>

<div
					style="width: 30%; margin-left: 72%;  position: relative;">
					<div class="templatemo-search-form" role="search">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="Search"
								name="search" id="search" onchange="flush('1')">
						</div>
					</div>
				</div>

<table class="tariff_table" summary="Sample Table" style="width:100%;">
    
      
       
      
      <thead>
      <tr>
      	<th scope="col">房间编号</th>
        <th scope="col">房间类型</th>
        <th scope="col">房间状态</th>
        <th scope="col">Double</th>
        <th scope="col">Vat</th>
        <th scope="col">...</th>
      </tr>
    </thead>
      
    <tfoot>
      <tr>
        <th scope="row">Total</th>
        <td colspan="7">4</td>
      </tr>
    </tfoot>
    <tbody>
      <tr>
      	<th>LT1990</th>
        <th scope="row">单人间</th>
        <td>已入住</td>
        <td>1000$</td>
        <td>4%</td>
        <td><a href="${pageContext.request.contextPath}/jump/jumpToCheckOut2.do">结账</a></td>
      </tr>
      
    </tbody>
  </table>
</div>

</div>
</div>

</div>
</div>	
</div>	
</body>
</html>