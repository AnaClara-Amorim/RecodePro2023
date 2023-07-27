// Estrutura simples

let num = 5;

if (num > 10) {
  console.log("O número é maior que 10") &
    console.log("Portanto, é maior que 1 também");
    
} else {
  console.log("O número não é maior que 10");
}

// Estrutura com aninhamento

let usuario1 = "Ana";
let email = "ana@recode.com";
let senhaDoUsuario = "recode";

if (
  usuario1 == "Ana" &&
  senhaDoUsuario == "recode" &&
  email == "ana@recode.com"
) {
  console.log("Usuário autenticado com sucesso");
} else if (senhaDoUsuario == "recode" && email == "ana@recode.com") {
  console.log("Usuário autenticado com sucesso");
} else {
  console.log("Usuário inválido");
}


let numero = 1; 

if (numero == 1)
  console.log("Iniciar");
else if (numero == 2) // É boa práricar colocar o o else if na mesma linha
  console.log ("Pausar");
else if (numero==3)
  console.log("Avançar");
else if (numero == 4)
  console.log ("Retroceder");
else if (numero ==5)
  console.log("Desligar")
else 
  console.log("Comando inválido")

  


