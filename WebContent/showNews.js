(function () {
    var app = angular.module('newsService', []);

	app.config(function($locationProvider) {
		$locationProvider.html5Mode({
			  enabled: true,
			  requireBase: false
			});
	});

    app.controller('newsController', ['$http', '$location', function($http, $location) {

      var nid = $location.search().nid;
      var newsCon = this;

		$http({
			method: 'GET',
			url:'/findNews?nid=' + nid
		}).success(function(data){
			newsCon.article= data;
		});
		
        this.toList = function(){
        	window.location.href = 'newsList.jsp';
        }

    }]);
    
    app.controller('ReviewController', ['$http', '$location', function($http, $location){
    	
        var nid = $location.search().nid;
        this.review={};
        
        this.addReview=function(article){
        	$http({
    			method: 'POST',
    			url:'/addReview',
    			data: { nid: nid, name: this.review.name, body: this.review.body}
    		}).success(function(data){
    			window.location.href = 'showNews.jsp?nid=' + nid;
    		});
        };
    }]);
    

    
    
})();