<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html ng-app="newsService">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>news</title>

	<!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="bootstrap-theme.css">

	<!-- Customized by SEON -->
    
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">


	<!-- Latest compiled and minified JavaScript -->
    <script type="text/javascript" src="./angularJS/angular.min.js"></script>

    <script type="text/javascript" src="showNews.js"></script>
    <script type="text/javascript" src="review.js"></script>
</head>
<body ng-controller= "newsController as newsCon">
    
    <!--header bar-->
    <ol class="breadcrumb">
        <li><a href="#">News List</a></li>
        <li class="active">Current News</li>
    </ol>
    
    
    <!--news-->
    <div class="media">
        <!--article-->
        <div class="media-body col-md-8">
            <article-body></article-body>
        </div>    
            
        <!--review-->
        <div class="col-md-8">
            <reviews></reviews>
            
            <!--  Live Preview -->
            <add-review></add-review>
<!--
            <form  ng-controller="ReviewController as reviewCon" ng-submit="reviewForm.$valid && reviewCon.addReview(newsCon.articles[0])" name="reviewForm" novalidate>
                <blockquote>
                    {{reviewCon.review.body}}
                    <br>
                    <cite class="clearfix"> <small> {{reviewCon.review.name}}</small></cite>
                </blockquote>
                review form

                <fieldset class="form-group" >
                    <textarea ng-model="reviewCon.review.body" class="form-control" placeholder="review" title="Review" required></textarea>
                </fieldset>
                <fieldset class="form-group">
                    <input ng-model="reviewCon.review.name" class="form-control" placeholder="name" title="Name" required />
                </fieldset>
                <div>Review form is {{reviewForm.$valid}}</div>
                <fieldset class="form-group">
                    <input type="submit" class="btn btn-primary pull-right" value="Submit Review" />
                </fieldset>

            </form>
-->
        </div>

    </div>
</body>
</html>