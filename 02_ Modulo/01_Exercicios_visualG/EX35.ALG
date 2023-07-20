Algoritmo "Estado e capital"

Var

   e_c: vetor [1..5, 1..2] de caracter  //linhas, colunas
   i, j, soma: inteiro // linhas, colunas

Inicio

   para i de 1 ate 5 faca
      para j de 1 ate 2 faca

         se j = 1 entao
            escreval ("Escreva o nome do estado: ")
            leia (e_c[i,j])
            se j = 2 entao
               escreval ("Escreval o nome da capital: ")
               leia (e_c[i,j])
            fimse
         fimse
      fimpara
   fimpara

   limpatela

   para i de 1 ate 5 faca
      para j de 1 ate 2 faca
         se j = 1 entao
            Escreva ("Estado: ", e_c[i,j])
         fimse
         se j = 2 entao
            Escreva (" - Capital: ", e_c[i,j]) // por algum motivo, nao roda capital
         fimse
      fimpara
      Escreval (" ")
   fimpara
   
Fimalgoritmo