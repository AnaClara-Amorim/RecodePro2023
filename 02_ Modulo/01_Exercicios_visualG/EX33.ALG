Algoritmo "notas e nomes alunos"

Var
   num: vetor [1..10] de real
   i: inteiro
   maior: real

Inicio

   para i de 1 ate 10 faca
      leia (num[i])
   fimpara

   limpatela

   escreval ("=== Maior número: ===")

   para i de 1 ate 10 faca
      escreval (num[i])

      Se num[i] > maior entao
         maior <- num[i]
      fimse
   fimpara
   
   Escreva ("O maior número foi: ", maior)

Fimalgoritmo