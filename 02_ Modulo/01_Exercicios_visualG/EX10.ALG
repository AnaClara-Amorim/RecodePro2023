Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/06/2023
Var
dia: caractere
Inicio
   escreva ("Digite o dia da semana: ")
   leia (dia)
   se (dia = "sabado") ou (dia = "domingo")
      escreva ("Hoje � ", dia, " dia de ficar em casa!")
      senao
      escreva ("Hoje � ", dia, " dia de trabalhar!")
   fimse
Fimalgoritmo