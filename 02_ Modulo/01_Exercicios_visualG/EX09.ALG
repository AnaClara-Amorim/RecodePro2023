Algoritmo "semnome"

Var
   n1, n2, media: real

Inicio
   escreva ("Escreva a primeira nota: ")
   leia (n1)
   escreva ("Escreva a segunda nota: ")
   leia (n2)
   media <- (n1 + n2)/2

   se media >= 7 entao
      escreva ("Aluno aprovado com nota ", media)
   senao
      escreva ("Aluno reprovado com nota " media)
   fimse


Fimalgoritmo