//how to accept user input
    //1.window.prompt
    //2.HTML textbox

    let username;
   username = window.prompt("What's your username");
   document.getElementById("mySubmit").onclick =function(){
         username = document.getElementById("myText").value;
        document.getElementById("myH1").textContent = 'Hello ${username}';
   }

