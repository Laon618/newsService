<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="newsService">
<head>
<%@ include file="libraries.jspf"%>
	<link rel="stylesheet" href="addNews.css">
	<script type="text/javascript" src="addNews.js"></script>
</head>
<bod ng-controller= "newsController as newsCon"y>
        <ol class="breadcrumb">
        <li><a href="#" ng-click="newsCon.toList()">News List</a></li>
        <li class="active">Add News</li>
    </ol>
    <div class="news-box" >
        <h1 class="col-md-8 text-center">뉴스 입력</h1>
		<form  ng-submit="newsCon.addNews()">
	        <div class="col-md-8 news-box">
	            <input type="text" class="form-control" placeholder="Title" ng-model="newsCon.news.title" name="title">
	        </div>
	        <div class="col-md-5 news-box">
	            <input type="text" class="form-control" placeholder="author" ng-model="newsCon.news.author" name="author">
	        </div>
	        <div class="col-md-3 news-box">
	            <input type="text" class="form-control" placeholder="yyyy-mm-dd" ng-model="newsCon.news.uDate" name="uDate">
	        </div>
	        <div class="col-md-8 news-box">
	            <input type="text" class="form-control" placeholder="article" id="article" ng-model="newsCon.news.body" name="body">
	        </div>
	
	        <div class="col-md-5">
	            <input type="submit" class="btn btn-primary pull-right"/>
	        </div>
        </form>
    </div>

</body>
</html>