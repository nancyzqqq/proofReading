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
         $( "#dialog" ).dialog({
          autoOpen: false,
          width: 500,
          show: {
           effect: "blind",
           duration: 1000
          },
          hide: {
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



$(document).ready(function() {

  $("#dialog").hide();
	$("#requestForm").hide();
	$("#requestForm").css("backrgound-image","url(img/backgrounds/5022.png) no-repeat");

  $("#menu-toggle").click(function(e) {
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
        // $("#content").html("1");
        $("#mainIntro").hide(200);
        $("#requestForm").show();
        $("body").css("background-image","url(img/backgrounds/5033.jpg)");

    });
  $("#backToMain").click(function(){
    window.location.href='usermainpage.jsp';
    console("123");
});
  
   
  $(".sidebar-nav li").mouseover(function(){
         // $( this ).fadeOut( 100 );
         $( this ).fadeIn( 100 );
         $(this).css("font-weight", "bold");
     });
  $(".sidebar-nav li").mouseout(function(){
         // $( this ).fadeOut( 100 );
         $( this ).fadeIn( 100 );
         $(this).css("font-weight", "normal");
     });

  var username =document.getElementById("username").innerHTML;

  /*
  check for user_type when click the my Voluntary Button
  */
  checkUserType(username);


  console.log(username);
  var dataset;
  var finaldataSet;



  





  $.ajax({
    type:"POST",
    url:"request",
    data:"username=" + username,
    success:function(msg){
                //console.log(msg);
                
                dataset = msg;
                console.log(dataset);
                var sub_arr = dataset.split(";"); 
                //console.log("subarr"+sub_arr);
                var len = sub_arr.length;
                //console.log(len);
                var arr=new Array(len);

                for(var i = 0 ; i < sub_arr.length;i++){
                    //console.log(sub_arr[1]);
                    
                    var temp = sub_arr[i].substring(1,sub_arr[i].length-1);
                    //console.log("temp "+temp);
                    var arrtemp = temp.split("-!");
                    arr[i] = arrtemp;
                    //console.log(arrtemp);
                    
                }
                console.log(arr);
                finaldataSet=arr;
                console.log(finaldataSet);
                $('#table').DataTable( {
                    data: finaldataSet,
                    "lengthMenu": [5, 10],
                    "order": [[ 1, "asc" ]],
                    columns: [
                    { title: "Paper Name" },
                    { title: "Paper Deadline" },
                    { title: "Paper Description" },
                    { title: "Paper Requirement" },
                    { title: "Paper Domain" }
                    ]
                } );

            }

        });

var Set = [
[ "Tiger Nixon", "System Architect", "Edinburgh", "5421", "2011/04/25", "$320,800" ],
[ "Garrett Winters", "Accountant", "Tokyo", "8422", "2011/07/25", "$170,750" ],

[ "Unity Butler", "Marketing Designer", "San Francisco", "5384", "2009/12/09", "$85,675" ]
];
console.log(Set);
console.log(finaldataSet);






});