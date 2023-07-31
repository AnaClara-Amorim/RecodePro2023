// Crie um objeto em js representando um usuário com duas propriedades, email e senha, outro objeto deve ser criado chamado BD com as mesmas propriedades já preenchidas, deve ser simulado uma tela de login, verificar ser os dados são iguais nos dois objetos, caso verdadero o script vai emitir a mensagem "Acesso permitido", caso falso, "Acesso negado"

/* let user = { // Criação do objeto usuáro
    nome: "",
    senha: ""
}

let BD = { // Criação do objeto BD
    nome: "Ana",
    senha:"12345"
}

 

user.nome = prompt("Entre com o nome: Ana") // Leitura de dados para comparação
user.senha = prompt("Entre com a senha: ") 

if((user.nome == BD.nome) && (user.senha == BD.senha)){
    alert("Acesso permitido")
}else{
    alert("Acesso negado")
} */


// Criar um objeto que representa um aluno com as seguintes propriedades: nome, rg, nota1, nota2, nota3, media, situação. O cadastro deve ser feito via prompt com as seguintes observações: a propriedade situação vai receber um valor conforme as seguintes condições: média <= 5: reprovado, média > 5 e <=7: recuperação e média > 7: aprovado. Os dados devem ser apresentados com o método document.write

let aluno = {
    nome: prompt("Escreva o nome do aluno: "),
    rg: prompt("Escreva o rg do aluno: "),
    nota1: Number(prompt("Escreva a primeira nota do aluno: ")),
    nota2: Number(prompt("Escreva a segunda nota do aluno: ")),
    nota3: Number(prompt("Escreva a terceira nota do aluno: ")),
    media: 0,
    situacao: '', // Inicializa a propriedade situacao com uma string vazia
  };
  
  aluno.media = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3; // Corrige o cálculo da média
  
  if (aluno.media <= 5) {
    aluno.situacao = "Aluno reprovado!"; // Atribui a string diretamente à propriedade situacao
  } else if (aluno.media <= 7) {
    aluno.situacao = "Aluno em recuperação!"; // Atribui a string diretamente à propriedade situacao
  } else {
    aluno.situacao = "Aluno aprovado!"; // Atribui a string diretamente à propriedade situacao
  }
  
  document.write("Nome do aluno: " + aluno.nome + "<br>");
  document.write("RG do aluno: " + aluno.rg + "<br>");
  document.write("Média: " + aluno.media + "<br>");
  document.write("Situação: " + aluno.situacao + "<br>");
  

