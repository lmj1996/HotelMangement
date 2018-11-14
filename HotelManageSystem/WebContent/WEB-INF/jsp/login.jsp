<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files --> 
<!-- web font --> 
<link href="${pageContext.request.contextPath}/css/css_font-G.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/css_font-A.css" rel="stylesheet">

</head>
<body>
	<!-- main --> 
	<div class="main-agileinfo slider ">
		<div class="items-group">
			<div class="item agileits-w3layouts">
				<div class="block text main-agileits"> 
					<span class="circleLight"></span> 
					<!-- login form -->
					<div class="login-form loginw3-agile"> 
						<div class="agile-row">
							<h1>龙腾酒店管理系统</h1> 
							<div class="login-agileits-top"> 	
								<form action="${pageContext.request.contextPath}/staff/login.do" method="post"> 
									<p>账号</p>
									<input type="text" class="name" name="staffNum" required="" placeholder="员工编号/姓名/联系电话" />
									<p>密码</p>
									<input type="password" class="password" name="staffPassword" required=""/>  
									<label class="anim">
										<input type="checkbox" class="checkbox">
										<span> Remember me ?</span> 
									</label>   
									<input type="submit" value="登录">
								</form> 	
							</div> 
							
						</div>  
					</div>   
				</div>
				<div class="w3lsfooteragileits">
					<p> &copy; 2017 Shadow Login Form. All Rights Reserved | Design by W3layouts</p>
				</div> 
			</div>   
		</div>
	</div>	 
	<!-- //main --> 
</body>
</html>