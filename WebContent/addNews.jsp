<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="libraries.jspf"%>
	<link rel="stylesheet" href="addNews.css">
</head>
<body>
        <ol class="breadcrumb">
        <li><a href="#">News List</a></li>
        <li class="active">Add News</li>
    </ol>
    <div class="news-box">
        <h1 class="col-md-8 text-center">뉴스 입력</h1>

        <div class="col-md-8 news-box">
            <input type="text" class="form-control" placeholder="News Title">
        </div>
        <div class="col-md-5 news-box">
            <input type="text" class="form-control" placeholder="author">
        </div>
        <div class="col-md-3 news-box">
            <input type="text" class="form-control" placeholder="date">
        </div>
        <div class="col-md-8 news-box">
            <input type="text" class="form-control" placeholder="article" id="article">
        </div>

        <div class="col-md-5">
            <button type="button" class="btn btn-default btn-lg pull-right"> 
                Submit
            </button>
        </div>
    </div>

</body>
</html>