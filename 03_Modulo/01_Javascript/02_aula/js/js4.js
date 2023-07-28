/* Criar um script com 2 Arrays, um para receber 5 nomes de alunos e outro para receber 5 notas dos alunos, mostrar os nomes e as notas digitadas, mostrar também a média total das notas dos alunos */

let nome = [];
let nota = [];
let soma = 0, media = 0;

for(let i = 0; i < 5; i++){

    nome[i] = prompt("Digite o " + (i + 1) + "º nome");
    nota[i] = Number(prompt("Digite a " + (i + 1) + "ª nota"));
    soma += nota[i];

}

media = soma / 5;

for(let i = 0; i < 5; i++){ 
    document.write("NOME: " + nome[i] + " NOTA: " + nota[i] + "<br>");
}

document.write("A media da turma = " + media);