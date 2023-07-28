// ARRAYS

/* let nome = [];

 nome [0] = "Nome 1";
 nome [1] = 30;
 nome [2] = true;

 for (let index = 0; index < nome.length; index++) {
    alert (nome[index])
 } */

 let nome = []

 for (let i = 0; i < 5; i++) { 
     nome[i] = Number(prompt("Digite um nome")) 
 }  
 
 nome.sort() 
 for (let index = 0; index < nome.length; index++) {   
     alert(nome[index])     
 }