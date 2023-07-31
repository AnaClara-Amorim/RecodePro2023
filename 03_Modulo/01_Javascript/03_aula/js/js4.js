
// Ex 01
var nome = prompt("Digite seu nome:") // lendo nome
var idade = prompt("Digite sua idade:") // lendo idade

function msg (parametro1, parametro2) { /// escrevendo função
    alert("Bem vindo(a), " + parametro1 + " voce tem " + parametro2 + " de idade")
}

msg (nome,idade) // chamando função

// Ex 02

/* Faça um script usando função que receba como parametro uma quantia em dinheiro e sugira através de um retorono, caso ele tenha 50 ou mais que vá ao cinema, senão, que fique em casa vendo tv */

var quantia = prompt("Insira quanto dinheiro você tem disponível para lazer: ")

function sugestao (dinheiro) {
    if (dinheiro >= 50) {
        alert("Vá ao cinema!")
    } else { 
        alert ("Fique em casa!")
    }
}

sugestao (quantia)

// Criar um scrip usando função que receba como parâmetro dois valores (inicial e final). Escreva quantos número pares e ímpares encontran-se entre dois números fornecidos pelo usuário

// If valor % 2 == 0

var inicial = prompt ("Insira o valor inicial")
var final = prompt("Isira o valor final")
let impar = 0
let par = 0

function parImpar (p1,p2) {
    for (let i = p1; i <= p2, i++){
            if (i%2 == 0){
                par ++
            }   else {
            impar++
        }
    }
    alert(`Quantidade ímpar ${impar}`)
    alert(`Quantidade par ${par}`)
}

parImpar (2, 10)