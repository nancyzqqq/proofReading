
function checkExpeSizeAddExp(a,b){
   var temp = document.getElementsByClassName(a);
   var size = temp.length;
   console.log(size);
   var ori = document.getElementById("delExp");

         if(size == 1 && ori == null){
            $("#minusExp").append(b);

         }
};

function checkExpeSizeDeleteButton(){
    var wrap_exp = document.getElementById("experiences");
    var temp = document.getElementsByClassName("oneExp");
    var size = temp.length;
    var wrap_button = document.getElementById("delExp");
    console.log("123");

    if(size == 1 && wrap_button != null){
        console.log("123");
            document.getElementById("minusExp").removeChild(wrap_button);
    }

};

jQuery(document).ready(function() {
    
    
    $.backstretch("img/backgrounds/5055.jpg");
    
   
    /*
        add more experience
    */
    $("#addMore").mouseover(function(){
        
    });
    var newExper = "<div class='container oneExp' id='oneExp' style='width:100%;padding-top:5px'><div class='row'><div class='col-md-2'> <input type='text' class='form-control'  name='expTime' placeholder='time... (MM/YY)'></div><div class='col-md-10' ><input type='text' name='expDes' class='form-control'  placeholder='experience description...'></div></div></div>";
    var deleteExper = "<a class='btn' id='delExp'><i class='fa fa-minus fa-2x' style='color:#fff'></i></a>";
    var wrap = document.getElementById("experiences");
    var expName = "oneExp";
    var b = deleteExper;
    



    $("#addMore").click(function(){

         checkExpeSizeAddExp(expName,b);
         $("#experiences").append(newExper);

        
    });

    
    $("#minusExp").click(function(){
        var wrap_exp = document.getElementById("experiences");
        var temp = document.getElementsByClassName(expName);
        var size = temp.length;
        console.log("size = "+size);
        if(size >=1){


            var lastExp = document.getElementsByClassName("oneExp")[size-1];
            wrap.removeChild(lastExp);
            var wrap_exp_1 = document.getElementById("experiences");
            var temp_1 = document.getElementsByClassName(expName);
            var size_1 = temp_1.length;
            console.log("newsize = "+ size_1)
            if(size_1 == 1){
                var wrap_button = document.getElementById("delExp");
                document.getElementById("minusExp").removeChild(wrap_button);
            }


        }

    });
   checkExpeSizeDeleteButton();
       
       
      
  

    
    /*
        Form validation
    */
    $('.registration-form input[type="text"], .registration-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
    $('.registration-form').on('submit', function(e) {
    	
    	$(this).find('input[type="text"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});
    	
    });
    
    
});
