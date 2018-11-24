<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Hotel Checkout Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="${pageContext.request.contextPath}/css/style_co.css" rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/js/jquery.min_co.js"></script>
<!-- script for close -->
<script>
$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.vlcone').fadeOut('slow', function(c){
			$('.vlcone').remove();
		});
	});	  
});
</script>
<!-- //script for close -->
</head>
<body>
<div class="main">
	<h1>账单</h1>
	
	<div class="hotel-right  vlcone" style="height: 740px;">
		<div class="alert-close"> </div>
		<div class="hotel-form">
			<h3>Receipt Form</h3>
			<ul class="list_ins1">
						<li>房间编号</li>
						<li>房间消费</li>
						<li>服务消费</li>
						<li>总共消费</li>
						<li>预缴押金</li>
						<li>费用结算</li>
			</ul>
			<ul class="list_ins2">
						<li>: 201</li>
						<li>: ￥500.00</li>
						<li>: ￥10.00</li>
						<li>: ￥510.00</li>
						<li>: ￥200.00</li>
						<li>: ￥-310.00</li>
			</ul>
			<div class="clear"></div>
		</div>
		<div class="pay-form">
			<form>
				

				<input type="submit" value="结账">
			</form>
			
		</div>
	</div>
	<div class="hotel-left">
		<div class="hotel-text">
			<h2>ROYAL PALACE</h2>
			<h3> ￥250.00 / <span>night</span></h3>
			<p>Entire Room for 5 members.</p>
			<p>Thursday, Dec 10, 2014 to Thursday, Dec 12, 2014.</p>
		</div>
	</div>
	<div class="clear"></div>
	
</div>
</body>
</html>