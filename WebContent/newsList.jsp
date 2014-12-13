<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="newsService">
<head>
<%@ include file="libraries.jspf"%>
</head>

<body ng-controller= "newsController as newsCon">
    <ol class="breadcrumb">
        <li class="active">News List</li>
    </ol>
    
	<h1 class="col-md-8 text-center">뉴스 리스트</h1>
    <div ng-controller="ListController as list">
        <div class="list-group col-md-8" >
            <a href="#" class="list-group-item" ng-repeat="article in newsCon.articles | orderBy:'-date'" ng-show="list.isSelected(3)"> 
                {{article.title}}
                <p class="pull-right">{{article.date}}</p>
            </a>
            <a href="#" class="list-group-item" ng-repeat="article in newsCon.articles | orderBy:'date'" ng-show="list.isSelected(1)"> 
                {{article.title}}
                <p class="pull-right">{{article.date}}</p>
            </a>
        </div>
        <div class="col-md-8">
            <button type="button" class="btn btn-default pull-right" aria-label="Left Align">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                Add News
            </button>
            <button type="button" class="btn btn-default pull-right" aria-label="Left Align" ng-click="list.selectOrder(1)">
                <span class="glyphicon glyphicon-sort-by-order" aria-hidden="true"></span>
                order
            </button>
            <button type="button" class="btn btn-default pull-right" aria-label="Left Align" ng-click="list.selectOrder(3)">
                <span class="glyphicon glyphicon-sort-by-order-alt" aria-hidden="true"></span>
                re-order
            </button>

        </div>
    </div>
</body>
</html>