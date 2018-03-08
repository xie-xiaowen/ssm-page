<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	    <meta name="description" content="">
	    <meta name="author" content="">
	    <!--<link rel="icon" href="../../favicon.ico">-->
		<title>后台管理</title>
		
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/ie10-viewport-bug-workaround.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/media.css"/>
		<link rel="stylesheet" type="text/css" href="css/common.css"/>
		<link rel="stylesheet" type="text/css" href="css/index.css"/>
		
		
		
	</head>
	<body>
		
		<!-- +++++++++++++++++++++++++ start -- 响应式导航栏 +++++++++++++++++++++++++++++ -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
	      	<div class="container-fluid">
	        	<div class="navbar-header"> 
	          		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            		<span class="sr-only">Toggle navigation</span>
	            		<span class="icon-bar"></span>
	            		<span class="icon-bar"></span>
	            		<span class="icon-bar"></span>
	          		</button>
	          		<h1 class="title-name">能源服务管理平台</h1>
	        	</div>
	        	<div id="navbar" class="collapse navbar-collapse">
	          		<ul class="nav navbar-nav">
	            		<li><a class="highlight-nav1" href="#">
	            			<span class="glyphicon glyphicon-tasks highlight-nav-ico" aria-hidden="true"></span>
	            			<span class="highlight-nav-info">2</span>
	            		</a></li>
	            		<li><a class="highlight-nav2" href="#about">
	            			<span class="glyphicon glyphicon-bell highlight-nav-ico" aria-hidden="true"></span>
	            			<span class="highlight-nav-info">3</span>
	            		</a></li>
	            		<li><a class="highlight-nav3" href="#contact">
	            			<span class="glyphicon glyphicon-envelope highlight-nav-ico" aria-hidden="true"></span>
	            			<span class="highlight-nav-info">4</span>
	            		</a></li>
	            		<li>
	            			<a class="highlight-user" href="#">
	            				<span class="highlight-user-img">
	            					<img src="img/user.jpg"/>
	            				</span>
	            				<span class="highlight-user-info">
	            					<small>Welcome</small>
	            					系统管理员
	            				</span>
	            				<span class="glyphicon glyphicon-triangle-bottom highlight-user-many"></span>
	            			</a>
	            		</li>
	          		</ul>
	        	</div>
	      	</div>
	    </nav>
		<!-- +++++++++++++++++++++++++ end -- 响应式导航栏 +++++++++++++++++++++++++++++ -->
		
		<div class="container-fluid body">
			<div class="row">
				<div id="left-menu" class="col-xs-2">
					<ul>
						<li>
							<a class="left-menu-sub1" href="#">
								<i class="glyphicon glyphicon-home"></i>
								<span>后台首页</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub2" href="#">
								<i class="glyphicon glyphicon-cog"></i>
								<span>系统管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub3" href="#">
								<i class="glyphicon glyphicon-signal"></i>
								<span>能源在线消耗</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub4" href="#">
								<i class="glyphicon glyphicon-tint"></i>
								<span>设备在线监测</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub5" href="#">
								<i class="glyphicon glyphicon-object-align-bottom"></i>
								<span>能耗情况分析</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub6" href="#">
								<i class="glyphicon glyphicon-list-alt"></i>
								<span>实时数据查询</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub7" href="#">
								<i class="glyphicon glyphicon-warning-sign"></i>
								<span>报警信息查询</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub8" href="#">
								<i class="glyphicon glyphicon-pencil"></i>
								<span>单位填报管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub9" href="#">
								<i class="glyphicon glyphicon-send"></i>
								<span>能耗预测分析</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub10" href="#">
								<i class="glyphicon glyphicon-file"></i>
								<span>信息管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub11" href="#">
								<i class="glyphicon glyphicon-briefcase"></i>
								<span>系统配置管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub12" href="#">
								<i class="glyphicon glyphicon-user"></i>
								<span>用户管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub13" href="#">
								<i class="glyphicon glyphicon-leaf"></i>
								<span>能源管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub14" href="#">
								<i class="glyphicon glyphicon-compressed"></i>
								<span>系统工具</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
						<li>
							<a class="left-menu-sub15" href="#">
								<i class="glyphicon glyphicon-comment"></i>
								<span>微信管理</span>
								<b class="glyphicon glyphicon-menu-down left-menu-drop"></b>
							</a>
						</li>
					</ul>
				</div>
				<div id="right-content" class="col-xs-10">
					<div class="content-history">
						<ul>
							<li>主页</li>
						</ul>
					</div>
					<iframe src="left.html" width="100%" height="99%" scrolling="auto"  frameborder="0"></iframe>
				</div>
			</div>
		</div>
		
		
		<script src="js/ie-emulation-modes-warning.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery-2.1.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/ie10-viewport-bug-workaround.js" type="text/javascript" charset="utf-8"></script>
		
		
	</body>
</html>
