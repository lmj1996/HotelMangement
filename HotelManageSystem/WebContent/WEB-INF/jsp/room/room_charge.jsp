<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title></title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
   
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
   <link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/templatemo-style.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

  </head>
  <body>  
    <!-- Left column -->
    <div class="templatemo-flex-row">
      <div class="templatemo-sidebar">
         <header class="templatemo-site-header">
          <h1>龙腾酒店管理系统</h1>
        </header>
        <div class="profile-photo-container">
        <img src="${pageContext.request.contextPath}/images/banner3.jpg" alt="Profile Photo" class="img-responsive" >  
          <div class="profile-photo-overlay"></div>
        </div>      
        
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">          
          <ul>
          	<li><a href="../index.html"><i class="fa fa-area-chart fa-fw"></i>首页</a></li>
           <li><a href="room_management.html" class="active"><i class="fa fa-home fa-fw"></i>房间</a></li>
            <li><a href="../staff/staff_management.html"><i class="fa fa-users fa-fw"></i>员工</a></li>
              <li><a href="../stock/stock_management.html"><i class="fa fa-database fa-fw"></i>库存</a></li>
          </ul>  
        </nav>
      </div>
      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
          <div class="row">
            <nav class="templatemo-top-nav col-lg-12 col-md-12">
              <ul class="text-uppercase">
                <li><a href="room_management.html">查看房间</a></li>
                <li><a href="room_charge.html" class="active">房间计费规则</a></li>
              </ul>  
            </nav> 
          </div>
        </div>
        <div class="templatemo-content-container">
        	
           <div>
           	<table class="table">
           		<tr>
           			<td>
           				<input type="button" data-toggle="modal" data-target="#myModal_add" name="" value="添加" class="form-control"  style="border-radius: 15px;background-color: #23527C;color: #FFFFFF;font-family: '宋体';width: 15%;" />
           			</td>
           		</tr>
           	</table>
           </div>
           
           <div>
           	<table class="table table-hover" style="text-align: center;">
           		<thead>
           			<tr>
           				<td>计费规则名称</td>
           				<td>计费开始时间</td>
           				<td>计费结束时间</td>
           				<td>操作</td>
           			</tr>
           		</thead>
           		<tbody>
	           		<tr>
	           			<td>
	           				普通天房
	           			</td>
	           			<td>
	           				当日中午12：00以后
	           			</td>
	           			<td>
	           				次日中午12:30之前
	           			</td>
	           			<td>
	           				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal_update">修改</button>
	           				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal_delete">删除</button>
	           			</td>
	           		</tr>
	           		<tr>
	           			<td>
	           				午夜房
	           			</td>
	           			<td>
	           				当日晚上23：00以后
	           			</td>
	           			<td>
	           				次日中午12:30之前
	           			</td>
	           			<td>
	           				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal_update">修改</button>
	           				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal_delete">删除</button>
	           			</td>
	           		</tr>
	           		<tr>
	           			<td>
	           				钟点房
	           			</td>
	           			<td>
	           				当日上午8：00以后
	           			</td>
	           			<td>
	           				当日晚上18:30之前
	           			</td>
	           			<td>
	           				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal_update">修改</button>
	           				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal_delete">删除</button>
	           			</td>
	           		</tr>
           		</tbody>
           	</table>
           </div>
        </div>
      </div>
    </div>
    
    <!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：添加模态框
    -->
    <div class="modal fade" id="myModal_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	                <h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
	            </div>
	            <form action="#" method="post">
		            <div class="modal-body">
		            	<div style="text-align: center;">
			            	<table class="table">
			            		<tr>
			            			<td>
			            				计费方式：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式名称" />
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>
			            				计费开始时间：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式开始时间" />
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>
			            				计费结束时间：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式结束时间" />
			            			</td>
			            		</tr>
			            	</table>
		            	</div>
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		                <button type="submit" class="btn btn-primary">添加</button>
		            </div>
	            </form>
	            
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal-dialog -->
		</div>

 		<!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：修改模态框
    -->
    <div class="modal fade" id="myModal_update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	                <h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
	            </div>
	            <form action="#" method="post">
		            <div class="modal-body">
		            	<div style="text-align: center;">
			            	<table class="table">
			            		<tr>
			            			<td>
			            				计费方式：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式名称" />
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>
			            				计费开始时间：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式开始时间" />
			            			</td>
			            		</tr>
			            		<tr>
			            			<td>
			            				计费结束时间：
			            			</td>
			            			<td>
			            				<input type="text" name="" id="" class="form-control" placeholder="请输入计费方式结束时间" />
			            			</td>
			            		</tr>
			            	</table>
		            	</div>
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		                <button type="submit" class="btn btn-primary">更新</button>
		            </div>
	            </form>
	            
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal-dialog -->
		</div>

     <!--
    	作者：LMJ
    	时间：2018-11-02
    	描述：删除模态框
    -->
    <div class="modal fade" id="myModal_delete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	                <h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
	            </div>
		            <div class="modal-body" style="text-align: center;">
		            	是否确认删除？
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		                <button type="submit" class="btn btn-primary">删除</button>
		            </div>
	            
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal-dialog -->
		</div>
    
    <!-- JS -->
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js"></script> <!--  jQuery Migrate Plugin -->
    <script src="https://www.google.com/jsapi"></script> <!-- Google Chart -->
    <script>
      /* Google Chart 
      -------------------------------------------------------------------*/
      // Load the Visualization API and the piechart package.
      google.load('visualization', '1.0', {'packages':['corechart']});

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
          data.addRows([
            ['Mushrooms', 3],
            ['Onions', 1],
            ['Olives', 1],
            ['Zucchini', 1],
            ['Pepperoni', 2]
          ]);

          // Set chart options
          var options = {'title':'How Much Pizza I Ate Last Night'};

          // Instantiate and draw our chart, passing in some options.
          var pieChart = new google.visualization.PieChart(document.getElementById('pie_chart_div'));
          pieChart.draw(data, options);

          var barChart = new google.visualization.BarChart(document.getElementById('bar_chart_div'));
          barChart.draw(data, options);
      }

      $(document).ready(function(){
        if($.browser.mozilla) {
          //refresh page on browser resize
          // http://www.sitepoint.com/jquery-refresh-page-browser-resize/
          $(window).bind('resize', function(e)
          {
            if (window.RT) clearTimeout(window.RT);
            window.RT = setTimeout(function()
            {
              this.location.reload(false); /* false to get page from cache */
            }, 200);
          });      
        } else {
          $(window).resize(function(){
            drawChart();
          });  
        }   
      });
      
    </script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>      <!-- Templatemo Script -->

  </body>
</html>