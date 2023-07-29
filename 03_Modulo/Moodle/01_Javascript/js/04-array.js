// ARRAY

// Declaração de um vetor
var nomes = ["carros", "aviao", "bicicleta"];
console.log(nomes);
console.log(typeof(nomes));

var veiculos = Array["carros", "aviao", "bicicleta"];
console.log(veiculos)

// Método push()
let pessoas = []
pessoas [0] = "Ana"
pessoas [1] = "Ramires"
pessoas [2] = "Sky"
console.log(pessoas)
pessoas.push("Garibaldo") // Método push permite inserir um valor ao vetor
console.log(pessoas)



// Método slice()
frutas = ["Maçã", "Banana", "Melancia", "Limão", "Abacaxi", "Uva", "Morango"]
resultado = frutas.slice(2, 5) // O método slice permite começar de um índice específico
//resultado = frutas.slice(2, -2)  Ao usar números negativos, elimina os dois últimos índices
console.log(resultado)

// Método pop()
let pessoas = [];
pessoas.push("Pessoa 1", "Pessoa 2", "Pessoa 3", "Pessoa 4");
pessoas.pop(); // Remove o último elemento do array
console.log(pessoas);

// Método splice()
let pessoas = [];
pessoas.push("Pessoa 1", "Pessoa 2", "Pessoa 3", "Pessoa 4");
pessoas.splice(1,1); // Remove o elemento selecionado
console.log(pessoas);

// Método shift()
let pessoas = [];
pessoas.push("Pessoa 1", "Pessoa 2", "Pessoa 3", "Pessoa 4");
pessoas.shift() // Remove o primeiro elemento de um Array
console.log(pessoas);

// Propriedade length
let pessoas = [];
pessoas.push("Pessoa 1", "Pessoa 2", "Pessoa 3", "Pessoa 4");
console.log(pessoas.length);

// Método sort()
let pessoas = []
pessoas.push("Ana", "Ramires", "Sky")
pessoas.sort() // Organiza em ordem alfabética
console.log(pessoas)


