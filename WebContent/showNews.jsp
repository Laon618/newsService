<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="newsService">
<head>
<%@ include file="libraries.jspf"%>
    <script type="text/javascript" src="showNews.js"></script>
</head>
<body ng-controller= "newsController as newsCon">
    
    <!--header bar-->
    <ol class="breadcrumb">
        <li><a href="#" ng-click="newsCon.toList()">News List</a></li>
        <li class="active">Current News</li>
    </ol>
    
    
    <!--news-->
    <div class="media">
        <!--article-->
        <div class="media-body col-md-8">
            <h1 class="media-heading text-center">{{newsCon.article.title}}</h1>
            <h3 class="col-md-6"><small><em>{{newsCon.article.uDate}}</em></small></h3>
            <h3 class="col-md-2 pull-right"><small>{{newsCon.article.author}}</small></h3>
            <p class="col-md-8">{{newsCon.article.body}}</p>
        </div>    
            
        <!--review-->
        <div class="col-md-8">
            <h2 class="text-center"> <small>Reviews</small> </h2>
            <blockquote ng-repeat="review in newsCon.article.reviewList">
                {{review.body}}
                <br>
                <cite class="clearfix"> <small> {{review.name}}</small></cite>
            </blockquote>
            
            <!--  Live Preview -->
            <form  ng-controller="ReviewController as reviewCon" ng-submit="reviewCon.addReview(article)" name="reviewForm" method="POST" >
                <blockquote>
                    {{reviewCon.review.body}}
                    <br>
                    <cite class="clearfix"> <small> {{reviewCon.review.name}}</small></cite>
                </blockquote>

				<!-- review form -->

                <fieldset class="form-group" >
                    <textarea type="text" name="body" ng-model="reviewCon.review.body" class="form-control" placeholder="review"></textarea>
                </fieldset>
                <fieldset class="form-group">
                    <input type="text" name="name" ng-model="reviewCon.review.name" class="form-control" placeholder="name" />
                </fieldset>
                <fieldset class="form-group">
                    <input type="submit" class="btn btn-primary pull-right"/>
                </fieldset>

            </form>

        </div>

    </div>
</body>
</html>