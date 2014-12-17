(function () {
    var app = angular.module('newsService', []);

    app.controller('newsController', ['$http', '$location', function($http, $location) {

        this.news={};

        this.addNews =function(){
        	$http({
    			method: 'POST',
    			url:'/addNews',
    			data: { title: this.news.title, author: this.news.author, uDate: this.news.uDate, body: this.news.body}
    		}).success(function(data){
    			window.location.href = 'newsList.jsp';
    		});
        };
        
        this.toList = function(){
        	window.location.href = 'newsList.jsp';
        }
    }]);
    

    
    
})();