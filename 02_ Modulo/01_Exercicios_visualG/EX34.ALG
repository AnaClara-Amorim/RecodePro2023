Algoritmo "semnome"

Var

   matrizA: vetor [1..2, 1..2] de inteiro //linhas, colunas
   i, j, soma: inteiro // linhas, colunas

Inicio

   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         leia (matrizA[i,j])
         soma <- soma + matrizA[i,j]
      fimpara
   fimpara
   
   limpatela
   
   para i de 1 ate 2 faca
      para j de 1 ate 2 faca
         escreva (matrizA[i,j])
      fimpara
      escreval (" ")
   fimpara
   
   Escreval ("A soma de todos os elementos da matriz foi de: ", soma)

Fimalgoritmo