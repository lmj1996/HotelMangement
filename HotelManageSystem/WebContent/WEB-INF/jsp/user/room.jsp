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
		
		<script type="text/javascript">
		function clear(){
			$("#typeInfo").children().remove();
			$("#roomCount").children().remove();
		}
		function clearRoomList(){
			$("#roomList").children().remove();
		}
		
		
		
		typeInfo();
		function typeInfo(){
			$.post("${pageContext.request.contextPath}/hotel/indexRoomTypeInfo.do",function(data){
				console.log(data)
				clear();
				if(null == data)
					return
					
				$.each(data.listDTO,function(){
					var t = '<tr>';
					t = t + '<th scope=\"col\">'+this.roomType+'</th>';
					t = t + '<th scope=\"col\">'+this.total+'</th>';
					t = t + '<th scope=\"col\">'+this.used+'</th>';
					t = t + '<th scope=\"col\">'+this.cleaning+'</th>';
					t = t + '<th scope=\"col\">'+this.surplus+'</th>';
					t = t + '</tr>';
					$("#typeInfo").append(t);
				});
					
				
				var p = '<tr>';
				p = p + '<th scope=\"col\">房间统计</th>';
				p = p + '<th scope=\"col\">'+data.totalRooms+'</th>';
				p = p + '<th scope=\"col\">'+data.usedRooms+'</th>';
				p = p + '<th scope=\"col\">'+data.cleaningRooms+'</th>';
				p = p + '<th scope=\"col\">'+data.surplusRooms+'</th>';
				p = p + '</tr>';
				$("#roomCount").append(p);
			},"json");
		}
		
		roomInfo();
		function roomInfo(){
			$.post("${pageContext.request.contextPath}/hotel/indexRoomInfo.do",{
				"search" : $("#search").val()
			},function(data){
				console.log(data)
				clearRoomList();
				if(null == data || '' == data){
					var x = '<tr><th colspan=\"5\">暂无数据</th></tr>';
					return $("#roomList").append(x);
				}
					/* <th scope="col">房间编号</th>
			        <th scope="col">房间类型</th>
			        <th scope="col">房间状态</th>
			        <th scope="col">备注</th>
			        <th scope="col">操作</th> */
				$.each(data,function(){
					var k = '<tr>';
					k = k + '<th scope=\"col\">'+this.roomNum+'</th>';
					k = k + '<th scope=\"col\">'+this.roomType+'</th>';
					k = k + '<th scope=\"col\">'+this.roomState+'</th>';
					k = k + '<th scope=\"col\">'+this.roomRemarks+'</th>';
					k = k + '<th scope=\"col\"><a href=\"${pageContext.request.contextPath}/jump/jumpToCheckOut2.do?room_Id='+this.roomId+'\">结账</a>';
					/* k = k + '<a href=\"${pageContext.request.contextPath}/jump/jumpToCheckOut2.do\">续费</a>'; */
					k = k + '<a href=\"${pageContext.request.contextPath}/jump/jumpToAddCost.do?roomId='+this.roomId+'\">服务</a>';
					k = k + '</th>'
					k = k + '</tr>';
					$("#roomList").append(k);
				});
				
			},"json");
		}
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
									<a class="navbar-brand" href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do"><img src="${pageContext.request.contextPath}/images/logo1.png" style="width: 151px;height: 55px;margin-top: -50px;margin-bottom: 20px;" /></a>
								</div>
							</div>
							<div id="navbar" class="navbar-collapse collapse">
								<nav class="cl-effect-16" id="cl-effect-16">
									<ul class="nav navbar-nav" style="padding-top: 15px;">
										<li>
											<a href="${pageContext.request.contextPath}/jump/jumpToStaffHome.do" data-hover="首页">首页</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/jump/jumpToCheckIn.do" data-hover="住宿登记">住宿登记</a>
										</li>
										<li>
											<a class="active" href="${pageContext.request.contextPath}/jump/jumpToRoom.do" data-hover="房间">房间</a>
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
        <th scope="col">房间类型</th>
        <th scope="col">总数</th>
        <th scope="col">入住中</th>
        <th scope="col">打扫中</th>
        <th scope="col">剩余</th>
      </tr>
    </thead>
    
     <tbody id="typeInfo">
      <tr>
        <th scope="col">单人间</th>
        <th scope="col">80</th>
        <th scope="col">40</th>
        <th scope="col">0</th>
        <th scope="col">40</th>
      </tr>
      
      
    </tbody>
   
    
     <tfoot id="roomCount">
      <tr>
        <th scope="col">房间统计</th>
        <th scope="col" id="totalRooms">240</th>
        <th scope="col" id="totalSellRooms">80</th>
        <th scope="col" id="totalCleaningRooms">80</th>
        <th scope="col" id="totalSurplusRooms">80</th>
      </tr>
    </tfoot>

</table>

<div
					style="width: 30%; margin-left: 72%;  position: relative;">
					<div class="templatemo-search-form" role="search">
						<div class="input-group">
							<button type="submit" class="fa fa-search"></button>
							<input type="text" class="form-control" placeholder="Search"
								name="search" id="search" onkeyup="roomInfo()">
						</div>
					</div>
				</div>

<table class="tariff_table" summary="Sample Table" style="width:100%;">
    
      
       
      
      <thead>
      <tr>
      	<th scope="col">房间编号</th>
        <th scope="col">房间类型</th>
        <th scope="col">房间状态</th>
        <th scope="col">备注</th>
        <th scope="col">操作</th>
      </tr>
    </thead>
      
    <tfoot>
      <tr>
       <th colspan="5"></th>
      </tr>
    </tfoot>
    <tbody id="roomList">
      <tr>
      	<th>LT1990</th>
        <th scope="row">单人间</th>
        <td>已入住</td>
        <td>1000$</td>
        <td>
        	<a href="${pageContext.request.contextPath}/jump/jumpToCheckOut2.do">结账</a>
        </td>
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