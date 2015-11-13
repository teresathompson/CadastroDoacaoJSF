var view3 = {
	
		fabricantevacina: ko.observableArray(),
		tipovacina: ko.observableArray(),
		fabricantevermifugo: ko.observableArray(),
		tipovermifugo: ko.observableArray()
		
	
};
ko.applyBindings(view3);

$(function() {
	
	$.ajax({url:'http://localhost:8080/CadastroAnimaisDoacao/rest/fabricantevacina',
			 // Whether this is a POST or GET request
		    type: "GET",
		 
		    // The type of data we expect back
		    dataType : "json",
			
	
		      success: function(msg) {
			
				view3.fabricantevacina(msg);
			}, error:function(jqXHR, status) {
				alert('Falha' + status);
			}});
	
	$.ajax({url:'http://localhost:8080/CadastroAnimaisDoacao/rest/tipovacina',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view3.tipovacina(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	$.ajax({url:'http://localhost:8080/CadastroAnimaisDoacao/rest/fabricantevermifugo',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view3.fabricantevermifugo(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	$.ajax({url:'http://localhost:8080/CadastroAnimaisDoacao/rest/tipovermifugo',
		 // Whether this is a POST or GET request
	    type: "GET",
	 
	    // The type of data we expect back
	    dataType : "json",
		

	      success: function(msg) {
		
			view3.tipovermifugo(msg);
		}, error:function(jqXHR, status) {
			alert('Falha' + status);
		}});

	
	
	

});

