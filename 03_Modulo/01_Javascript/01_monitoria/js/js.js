// Escrever um programa que solicite ao usuário 5 números e ao final exiba a soma dos pares. Usando FOR

/*         for (let i = 0; i< 5; i++){
            let number = Number(prompt("Digite o número"))
            if(number % 2 == 0){
                soma +=  number
            }
        } */

document.write("O resultado da soma dos números pares é de: " + soma)

// Fazer um programa que peça o número total de eleitores e conte quantos votos cada candidato recebeu, a eleição possui 3 candidatos. Usando while.

/*         let voto = 0; 
        let candidato1 = 0;
        let candidato2 = 0;
        let candidato3 = 0; 
        let total = Number(prompt("O total de eleitores: "))
        let i = 0; 
        while (i < total){
            voto = prompt(`Voto do eleitor ${i} é do candidato (1, 2 ou 3): `)
            if (voto == 1) {
                candidato1++
            } else if (voto ==2) {
                candidato2++
            } else if (voto == 3) {
                candidato3++
            } else {
                alert("Voto inválido, tente novamente.")
            }
            i++
        }

        alert (`Resultado - Candidato 1: ${candidato1} votos /n Candidato 2: ${candidato2} votos /n Candidato 3: ${candidato3}`) */

// Escreva um programa que solicite ao usuário que digite uma palavra. O programa deve contar e exibir o númerro de vogais e consoantes presentes na palavr. Usando do while. Use o método length para percorrer a palavra exemplo.

            /* let palavra = prompt ("Digite uma palavra: ")
            let i = 0
            let vogal = 0
            let consoante = 0

            do {
                if(palavra[i] == 'a' ||
                 palavra[i] == 'e' ||
                  palavra[i] == 'i' ||
                  palavra[i] == 'o' ||
                   palavra[i] == 'u'){
                    vogal++
                } else {
                    consoante++
                }

                i++
            } while(i < palavra.length)

            document.write(`A palavra tem ${vogal} vogais e ${consoante} consoantes`) */

// Constura um objeto pessoa qe contenha as seguintes propriedades: nome, sobrenome e idade, após isso, recebe 3 valores pelo prompt e atribua os valores ao objeto em seguida mostre na tela as propriedades do objeto pessoa

            /* const pessoa = {
                nome: "",
                sobrenome: "",
                idade: 0
            }

            pessoa.nome = prompt ("Digite seu nome: ")
            pessoa.sobrenome = ("Digite seu sobrenome: ")
            pessoa.idade = prompt("Digite sua idade: ")

            alert("Nome: " + pessoa.nome + "\nSobrenome: " + pessoa.sobrenome + "\nIdade: " + pessoa.idade) */

// Crie 4 funções com as operações aritiméticas de adição, subração, multiplicação e divisão, cada função deverá receber 2 parâmetros e fazer o cálculo dentro do seu escopo, o resulado deve ser acumulado em uma variável global fora das 4 funções, a função da divisão não deverá aceitar a divisão por 0 



// let acumulador = 0;

// function soma(a, b) {
//   let resultado = a + b;
//   acumulador += resultado;
//   console.log(`O Resultado é: ${resultado}`);
// }

// function sub(a, b) {
//   let resultado = a - b;
//   acumulador += resultado;
//   console.log(`O Resultado é: ${resultado}`);
// }

// function mult(a, b) {
//   let resultado = a * b;
//   acumulador += resultado;
//   console.log(`O Resultado é: ${resultado}`);
// }

// function div(a, b) {
//   let resultado = a / b;
//   acumulador += resultado;
//   console.log(`O Resultado é: ${resultado}`);
// }

// soma(10, 10);
// sub(20, 5);
// console.log(acumulador);

//Exercício 6

// const myArray = []

// let arrayLength = Number(prompt("Digite o tamnho o do Array"))

// for(i=1; i <= arrayLength; i++){
//   myArray.push(i)
// }

// let firstValue = myArray.shift()
// let lastValue = myArray.pop()

// alert(`Os valores somados são: ${firstValue + lastValue}`)

// Map
// o Map itera sobre o array, e aplica uma função nele como Callback e logo retorna esse valor

// const myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const arrayCaractere = ["joao", "pedro", "josias"];

// const myArrayX2 = myArray.map((valor) => valor * 2);
// const arrayCaractereUpper = arrayCaractere.map((valor) => valor.toUpperCase());

// console.log(arrayCaractereUpper);

//Filter
// o Filter itera sobre o array, e retorna valores que passam como (True) pela condição imposta
// const myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const nomes = ["joao", "mario", "andre"];

// const numerosPares = myArray.filter((valor) => valor % 2 === 0);
// const numerosImpares = myArray.filter((valor) => valor % 2 === 1);

// const nomesComO = nomes.filter((valor) => valor.includes("o"));

// console.log(numerosPares);
// console.log(numerosImpares);
// console.log(nomesComO);