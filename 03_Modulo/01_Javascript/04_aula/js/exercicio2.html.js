document.addEventListener("DOMContentLoaded", function() {
    const box = document.getElementById("myBox");
    const btnRed = document.getElementById("btnRed");
    const btnBlue = document.getElementById("btnBlue");
    const btnGreen = document.getElementById("btnGreen");
  
    btnRed.addEventListener("click", function() {
      box.style.backgroundColor = "red";
    });
  
    btnBlue.addEventListener("click", function() {
      box.style.backgroundColor = "blue";
    });
  
    btnGreen.addEventListener("click", function() {
      box.style.backgroundColor = "green";
    });
  });