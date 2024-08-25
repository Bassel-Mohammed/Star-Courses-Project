/**
 * 
 */

 
  $(".nav-bar").css({
    "visibility": "visible"
  }).animate({ opacity: 1 }, 400); // Fades in over 1000 milliseconds (1 second)

$("#Log-in-form").css(
{
"visibility" : "visible"
}
).animate({opacity:1} , 1000);


 function validatePassword() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirmPassword").value;

        if (password !== confirmPassword) {
            alert("Passwords do not match!");
            return false;  // Prevent form submission
        }
        return true;  // Allow form submission
    }