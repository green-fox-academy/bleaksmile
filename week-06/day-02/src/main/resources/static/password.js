document.querySelector("form").addEventListener("submit", myFunction);

function myFunction(event) {
    var pass1 = document.getElementById("password").value;
    var pass2 = document.getElementById("passwordConfirmation").value;
    if (pass1 != pass2) {
        event.preventDefault();
        alert("Passwords Do not match");
        document.getElementById("password").style.borderColor = "#E34234";
        document.getElementById("passwordConfirmation").style.borderColor = "#E34234";
    }
}