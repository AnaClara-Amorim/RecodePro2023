        // Estrutura FOR
/* 
let valor = Number(prompt("Digite um valor para a tabuada: "))


for (let i = 1; i <= 10; i++){
    document.write(valor + "x" + i + " = " + (valor*i) + "<br>")
}

        // Estrutura WHILE

let i = 1
while (i <= 10) {
    alert ("Recode" + i)
    i++
} */

// Tabuada no while:
/* let i = 1
while (i <= 10) {
    document.write(valor + "x" + i + " = " + (valor*i) + "<br>")
    i++
} */

        // Estrutura DO WHILE

/* do {
    document.write(valor + "x" + i + " = " + (valor*i) + "<br>")
} while (i <= 10) */


        // Exercícios

/* Ler um valor N e mostrar todos os números inteiros de 1 até N. Usando o laço de repetição FOR. */

/* let valor = Number(prompt("Digite um número: "))
for (let i = 1; i <= valor; i++){
    document.write(i + "<br>")
}10 */

/* let i = 1
let valor = Number(prompt("Digite um número: "))
do {
    document.write(i + "<br>")
    i++
} while (i<=valor) */

/* Escreva um script para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada. Usando a estrutura de repetição WHILE. */

let valor = 0;
let soma = 0;
let i = 1;

while (i <= 10){
    valor = Number(prompt("Digite o " + i + " valor"))
    if(valor < 40){
        soma += valor
    }
    i++
}
alert("A soma dos valores menores que 40 = " + soma)