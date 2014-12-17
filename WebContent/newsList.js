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
		this.articles=[];
		$http({
			method: 'GET',
			url:'/getNewsList'
		}).success(function(data){
			newsCon.articles= data;
		});
		
		this.getArticle = function(nid) {
			window.location.href = 'showNews.jsp?nid=' + nid;
		}
		
		
    }]);
    
    
    
    app.controller('ListController', function(){
    	this.order=1;
        
        this.selectOrder = function(Order){
        	this.order = Order; 
        };
        this.isSelected =function(checkOrder){
        	return this.order === checkOrder;
        };
        
        this.addNews=function(){
        	window.location.href = 'addNews.jsp';
        }
    });
    
    
})();