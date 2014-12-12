(function () {
    var app = angular.module('newsService', ['newsService-reviews']);
    app.controller('newsController', ['$http', function($http) {
        var newsCon = this;
        this.articles = [];
        
        $http.get('news.json').success(function(data){
            newsCon.articles = data;
        });
    }]);
    
//    app.controller('ReviewController', function(){
//        this.review={};
//        
//        this.addReview=function(article){
//            article.reviews.push(this.review);
//            this.review={};
//        };
//    });
    
    app.directive('articleBody', function(){
        return{
            restrict: 'E',
            templateUrl: 'articleBody.html'
        };
    });
//    
//    app.directive('reviews', function(){
//        return{
//            restrict: 'E',
//            templateUrl: 'reviews.html'
//        };
//    });
//    
//    app.directive('addReview', function(){
//        return{
//            restrict: 'E',
//            templateUrl: 'addReview.html',
//            
//            controller: function(){
//                this.review={};
//        
//                this.addReview=function(article){
//                    article.reviews.push(this.review);
//                    this.review={};
//                };
//            },
//            controllerAs: 'reviewCon'
//        };
//    });
    
    app.directive('makeNewsList', function(){
        return{
            restrict: 'E',
            templateUrl: 'makeNewsList.html',
            
            controller: function(){
                this.order=1;
        
                this.selectOrder = function(Order){
                    this.order = Order; 

                };
        
                this.isSelected = function(checkOrder){
                    return this.order === checkOrder;
                };
            },
            controllerAs: 'list'
        };
    });
    
    
})();