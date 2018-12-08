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
		<div class="hotel-form">
			<h3>消费情况</h3>
			<ul class="list_ins1">
						<li>房间编号</li>
						<li>预缴押金</li>
						<li>充值金额</li>
			</ul>
			<ul class="list_ins2">
						<li>: ${room.roomNum }</li>
						<li>: ￥${hotelRegister.hotelRegisterSecurity }</li>
						<li>: ￥${recharge.rechargeMoney }</li>
			</ul>
			<div class="clear"></div>
		</div>
		<div class="pay-form">
			<form action="${pageContext.request.contextPath}/jump/jumpToRoom.do" method="post">
				<h3>客户信息</h3>
				<h5>客户姓名</h5>
				<input type="text" value="${customer.customerName }" style="color:#000000" required="" disabled="disabled">
				<h5>证件号码</h5>
				<input type="text" value="${customer.customerCustomerid }" style="color:#000000" required="" disabled="disabled">
				<h5>联系方式</h5>
				<input type="text" value="${customer.customerPhone }" style="color:#000000" required="" disabled="disabled">
				<h3>成员组成</h3>
				<h5>成人</h5>
				<input type="text" value="${hotelRegister.hotelRegisterAdults }" style="color:#000000" required="" disabled="disabled">
				<h5>小孩</h5>
				<input type="text" value="${hotelRegister.hotelRegisterChildren }" style="color:#000000" required="" disabled="disabled">

				<input type="submit" value="返回房间列表">
			</form>
			
		</div>
	</div>
	<div class="hotel-left">
		<div class="hotel-text">
			<h2>房间价格</h2>
			<h3> ￥${room.roomPrice } / <span>night</span></h3>
			<p>起止时间：${hotelRegister.hotelRegisterCheckinday } - ${hotelRegister.hotelRegisterCheckoutday }</p>
		</div>
	</div>
	<div class="clear"></div>
	
</div>
</body>
</html>