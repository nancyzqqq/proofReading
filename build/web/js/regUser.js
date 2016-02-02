function checkEqual(a,b){
    var email1 =  $("#email1").val();
    var email2 =  $("#email2").val();
    if(email1 != email2){
        $("#emailMessage").html("Please recheck your email!");
    }

}
jQuery(document).ready(function() {

    $("#email2").bind("blur",function(){
        checkEqual();
    })

    /*
       validate username availabilty
    */
    $("#form-username").bind("blur", function(){
        console.log($(this).val());
        var username = $(this).val();
        $.ajax({
            type:"POST",
            url:"checkUserNameAvail",
            data:"username=" + username,
            success:function(msg){
                //console.log(msg);
                $("#status").html(msg);
            }

        });

    });

    $("#signup").click(function(){
        window.location.href='signup.jsp';
    })
	

    $("#login1").click(function(){
        window.location.href='index.jsp';
    })
    /*
        Fullscreen background
    */
    $.backstretch("img/backgrounds/5034.png");
    
    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    

    
    
});
