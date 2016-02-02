function checkUserType(username){
  
    $.ajax({
    type:"POST",
    url:"getUserType",
    data:"username=" + username,
    success:function(msg){

        var usertype =parseInt(msg);
        console.log(usertype);
        clickVolSection(usertype);
        }

      });

}

function clickVolSection(usertype){

  $("#volPointer").click(function(){

      console.log(usertype);
      if(usertype == 0){
         $("#dialog" ).dialog({
            autoOpen: false,
            width: 500,
            show: {
            effect: "blind",
            duration: 1000
          },
          hide:{
           effect: "explode",
            duration: 1000
          },
          buttons: {
            "Go to register!!": function() {
              $( this ).dialog( "close" );
              window.location.href='regVol.jsp';
            },
            "Cancel": function() {
              $( this ).dialog( "close" );
            }
          }
        });
 
   
      $( "#dialog" ).dialog( "open" );
  
      }else if(usertype == 1){
        console.log("is volunteer");
        window.location.href='regVol.jsp';
      }


});
}

function getUserName(){
    var username = $("#username").html();
    return username;
}

$(document).ready(function(){
    $("#username").hide();
   $("#dialog").hide();
  var username = getUserName();
  username = username.replace("\n","").replace("\r","");
   console.log(username+"~~~");

  checkUserType(username);
  



})