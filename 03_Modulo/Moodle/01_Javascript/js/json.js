// Json

let nomes = {
    nome: "Ana",
    idade: 25,
    altura: 1.57,
    calculo: (num) => num *2, // Arrow function simplifica, se há retorno em uma única linha
    hobbies: [
        "ler", "jogar"
    ]
}

console.log(nomes)
console.log(nomes.nome)
console.log(nomes.calculo(4))
console.log(nomes.hobbies)
console.log(nomes.hobbies[1])
