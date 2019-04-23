<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->

<link href="${pageContext.request.contextPath}/css/css_font-G.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/css_font-A.css"
	rel="stylesheet">

<link href="${pageContext.request.contextPath}/css/toastr.css"
	rel="stylesheet">

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
								<form action="${pageContext.request.contextPath}/staff/login2.do"
									method="post">
									<p>账号</p>
									<input type="text" class="name" name="staffNum" required=""
										placeholder="员工编号/姓名/联系电话" />
									<p>密码</p>
									<input type="password" class="password" name="staffPassword"
										required="" /> <label class="anim"> <input
										type="checkbox" class="checkbox"> <span>
											Remember me ?</span>
									</label> <input type="submit" value="登录">
								</form>
							</div>

						</div>
					</div>
				</div>
				<div class="w3lsfooteragileits">
					<p>&copy; 龙腾酒店登录系统  2019</p>
				</div>
			</div>
		</div>
	</div>
	<!-- //main -->

	<script src="${pageContext.request.contextPath}/js/jquery-2.11.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/toastr.js"></script>
	<script type="text/javascript">
		;
		(function toastrError() {
			var s = '${requestScope.state}';
			if (s == "error") {
				toastr.error("用户名或密码错误!")
			}
		})();
		
		;
		(function testError() {
			var un = '${requestScope.userName}';
			if (un != null && un != '') {
				toastr.error("用户名不存在!")
			}
			var up = '${requestScope.passwd}';
			if(up != null && up != ''){
				toastr.error("密码错误")
			}
		})();
	</script>

</body>
</html>