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
          	<li><a href="${pageContext.request.contextPath}/jsp/home"><i class="fa fa-area-chart fa-fw"></i>首页</a></li>
           <li><a href="${pageContext.request.contextPath}/jsp/room/room_management.html" class="active"><i class="fa fa-home fa-fw"></i>房间</a></li>
            <li><a href="${pageContext.request.contextPath}/jsp/staff/staff_management.html"><i class="fa fa-users fa-fw"></i>员工</a></li>
              <li><a href="${pageContext.request.contextPath}/jsp/stock/stock_management.html"><i class="fa fa-database fa-fw"></i>库存</a></li>
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
                <li><a href="room_add.html" class="active">增加房间</a></li>
                <li><a href="room_charge.html">房间计费规则</a></li>
              </ul>  
            </nav> 
          </div>
        </div>
        <div class="templatemo-content-container">
            <div  style="width: 60%;margin: auto;">
              
              <form action="#" method="post">
              	<table class="table">
              	
               	<tr>
               		<td>
               		<label>房间编号</label>
               			</td>
               			<td>
               		<input type="text" class="form-control" placeholder="房间编号" disabled="disabled">
               		</td>
								</tr>
								
								<tr>
									<td>
               		<label>房间等级</label>
               		</td>
               			<td>
               				<select class="form-control">
									      <option>单人间</option>
									      <option>双人间</option>
									      <option>普通套房</option>
									      <option>豪华套房</option>
									      <option>商务间</option>
									      <option>公寓间</option>
									      <option>总统套房</option>
									    </select>
               			</td>
								</tr>
								
								<tr>
									<td>
               		<label>房间价格</label>
               		</td>
               			<td>
               				<input type="text" class="form-control">
               			</td>
								</tr>
								
								<tr>
									<td>
               		<label>所在楼层</label>
               		</td>
               			<td>
               				<select class="form-control">
									      <option>1</option>
									      <option>2</option>
									      <option>3</option>
									      <option>4</option>
									      <option>5</option>
									      <option>6</option>
									    </select>
               			</td>
								</tr>
								
							
								
								</table>
								<div>
								<input type="submit" name="" value="添加" class="form-control"  style="border-radius: 15px;background-color: #23527C;color: #FFFFFF;font-family: '宋体';" />
								</div>
               </form>
               
             </div>  
        </div>
      </div>
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