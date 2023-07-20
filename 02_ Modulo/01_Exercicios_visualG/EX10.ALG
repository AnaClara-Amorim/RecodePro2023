Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/06/2023
Var
dia: caractere
Inicio
   escreva ("Digite o dia da semana: ")
   leia (dia)
   se (dia = "sabado") ou (dia = "domingo")
      escreva ("Hoje é ", dia, " dia de ficar em casa!")
      senao
      escreva ("Hoje é ", dia, " dia de trabalhar!")
   fimse
Fimalgoritmo