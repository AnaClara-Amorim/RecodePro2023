Algoritmo "semnome"

Var

   listaPreco: vetor [1..10] de real
   i: inteiro
   soma: real

Inicio

   para i de 1 ate 10 faca
      leia (listaPreco[i])
   fimpara
   
   escreval ("=== dados do vetor ===")
   
   para i de 1 ate 10 faca
      escreva (listaPreco[i])
      soma <- listaPreco[i] + soma
   fimpara
   
   Escreval ("O total dos produtos foi: ", soma)

Fimalgoritmo