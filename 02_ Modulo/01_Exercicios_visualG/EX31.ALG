Algoritmo "notas e nomes alunos"

Var

   nomeAluno: vetor [1..5] de caractere
   notaAluno: vetor [1..5] de real
   i: inteiro
   soma, media: real


Inicio

   para i de 1 ate 5 faca
      leia (nomeAluno[i])
      leia (notaAluno[i])
      soma <- soma + notaAluno[i]
   fimpara
   
   limpatela

   escreval ("=== Nomes dos alunos: ===")

   para i de 1 ate 5 faca
      escreval ("Aluno", i, ": ",nomeAluno[i])
   fimpara
   
   escreval ("=== Notas digitadas dos alunos: ===")
   
   para i de 1 ate 5 faca
          escreval (i, "o nota: ", notaAluno[i])
   fimpara
   
   escreval ("=== Aluno e sua respectiva nota: ===")
   
   para i de 1 ate 5 faca
        escreval ("O aluno ", nomeAluno[i], " recebeu a nota: ", notaAluno[i])
   fimpara
   
   media <- soma / i

   escreval ("=== Média da turma: ===")

   Escreval ( media)

Fimalgoritmo