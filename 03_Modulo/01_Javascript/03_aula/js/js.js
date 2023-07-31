/* let dados = []  */// Declaração de Array

/* let pessoa = {  */// Declaração de objetos
     /* nome: "Ana",
     profissao: "dev",
    salario: 1200
} */


let agenda = []
let pessoa = {
    nome: "Flavio",
    profissao: "Professor",
    salario: 1200
} 

let pessoa1 = {
    nome: "Rochele",
    profissao: "Contadora",
    salario: 5000
} 

agenda.push(pessoa)
agenda.push(pessoa1) 

for (let index = 0; index < agenda.length; index++) {
    alert(agenda[index].nome)
    alert(agenda[index].profissao)
    alert(agenda[index].salario)
}

/* for (const i in pessoa) {  Para mostrar as propriedades todas de uma vez
    alert (i + " " + pessoa[i])
} */