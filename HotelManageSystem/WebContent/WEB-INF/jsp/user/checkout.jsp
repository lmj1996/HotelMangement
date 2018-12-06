<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Hotel Checkout Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //for-mobile-apps -->
<link href="${pageContext.request.contextPath}/css/style_co.css"
	rel="stylesheet" type="text/css" media="all" />
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
			<div class="alert-close"></div>
			<div class="hotel-form">
				<h3>消费情况</h3>
				<ul class="list_ins1">
					<li>房间编号</li>
					<li>房间消费</li>
					<li>服务消费</li>
					<li>总共消费</li>
					<li>预缴押金</li>
					<li>费用结算</li>
				</ul>
				<ul class="list_ins2" id="checkoutinfo">
					<li>201</li>
					<li>￥500.00</li>
					<li>￥10.00</li>
					<li>￥510.00</li>
					<li>￥200.00</li>
					<li>￥-310.00</li>
				</ul>
				<div class="clear"></div>
			</div>
			<div class="pay-form">
				<form action="${pageContext.request.contextPath}/hotel/checkOut1.do" method="post">

					<input type="hidden" id="room" value="${requestScope.roomId }" name="roomId" /> <input
						type="hidden" id="hotelregister" name="hotelRegisterTotalprice" />

					<h3>客户信息</h3>
					<h5>客户姓名</h5>
					<input type="text" id="customerName" style="color:#000000" disabled="disabled">
					<h5>证件号码</h5>
					<input type="text" id="customerID" style="color:#000000" name="customerCustomerid"
						disabled="disabled">
					<h3>成员组成</h3>
					<h5>成人</h5>
					<input type="text" id="adults" style="color:#000000" disabled="disabled">
					<h5>小孩</h5>
					<input type="text" id="children" style="color:#000000" disabled="disabled"> <input
						type="submit" value="结账">
				</form>

			</div>
		</div>
		<div class="hotel-left">
			<div class="hotel-text" id="roominfo">
				<h2>普通套房</h2>
				<h3>
					￥250.00 / <span>night</span>
				</h3>
				<p>2018/11/20 - 2018/11/26</p>
			</div>
		</div>
		<div class="clear"></div>

	</div>


	<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>

	<script>
		function clear(){
			$("#roominfo").children().remove();
			$("#checkoutinfo").children().remove();
			
		}
	
		getInfo();
	
		function getInfo(){
			
			$.post("${pageContext.request.contextPath}/hotel/getCheckOutInfo.do",{
				"roomId" : $("#room").val()
			},function(data){
				console.log(data)
				clear();
				if(null == data)
					return
				$("#customerName").val(data.customer.customerName);
				$("#customerID").val(data.customer.customerCustomerid);
				$("#hotelregister").val(data.hotelRegister.hotelRegisterTotalprice);
				$("#adults").val(data.hotelRegister.hotelRegisterAdults);
				$("#children").val(data.hotelRegister.hotelRegisterChildren);
				
				var a = '';
				a = a + '<li>'+data.room.roomNum+'</li>';
				a = a + '<li>￥'+data.roomCost+'</li>';
				a = a + '<li>￥'+data.serviceCost+'</li>';
				a = a + '<li>￥'+data.hotelRegister.hotelRegisterTotalprice+'</li>';
				a = a + '<li>￥'+data.hotelRegister.hotelRegisterSecurity+'</li>';
				a = a + '<li>￥'+data.settleMoney+'</li>';
				$("#checkoutinfo").append(a);
				
				var b = '';
				b = b + '<h2>'+data.room.roomType+'</h2>';
				b = b + '<h3>￥'+data.room.roomPrice+' / <span>night</span></h3>';
				b = b + '<p>'+data.hotelRegister.hotelRegisterCheckinday+' - '+data.hotelRegister.hotelRegisterCheckoutday+'</p>';
				$("#roominfo").append(b);
				
			},"json");
		}
	
</script>

</body>
</html>