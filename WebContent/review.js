(function(){
    var app=angular.module('newsService-reviews', []);
    
        
    app.directive('reviews', function(){
        return{
            restrict: 'E',
            templateUrl: 'reviews.html'
        };
    });
    
    app.directive('addReview', function(){
        return{
            restrict: 'E',
            templateUrl: 'addReview.html',
            
            controller: function(){
                this.review={};
        
                this.addReview=function(article){
                    article.reviews.push(this.review);
                    this.review={};
                };
            },
            controllerAs: 'reviewCon'
        };
    });
    
})();