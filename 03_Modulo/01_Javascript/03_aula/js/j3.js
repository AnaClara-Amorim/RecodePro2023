// Formas de escrever função

function multiplicacao (x, y) {
    return x * y
}

var multiplicacao = function(x, y) {
    return x * y
}

var multiplicacao = function nome_function (x,y) {
    return x * y
}

/* Arrow function onde a seta representa return */

const soma = (a,b) =>  a + b 

/* function msg(){ // Criando a função
    alert("Olá, mundo")
}
 */


function msg (x,y) {
    return x + y
}

const msg = (x,y) => {x+y} // Com arrow function
 
let resposta1 = msg (25,20)
let resposta2 = msg (100,200)

alert (resposta1)
alert (resposta2)

