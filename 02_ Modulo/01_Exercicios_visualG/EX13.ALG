Algoritmo "semnome"

Var
   valor: real
   investimento: inteiro
Inicio

   Escreval ("Nosso banco tem dois tipos de investimento!")
   Escreval ("Poupan�a rende 5% e Fundo de renda fixa rende 10%!")
   Escreval("Digite quanto quer investir: ")
   leia (valor)
   Escreval ("Qual investimento voc� quer fazer? Digite 1 para Poupan�a ou 2 para FRX")
   leia (investimento)

   se investimento = 1 entao
      valor <- valor + (valor * 0.05)
   senao

      se investimento = 2 entao
         valor <- valor + (valor * 0.1)
      senao

         Repita
            Escreval ("Digite Poupan�a ou FRX corretamente")
            leia (investimento)
         ate (investimento = 1) ou (investimento = 2)

      fimse
   fimse
   Escreva ("Tudo certo, seu valor agora �: ", valor)
Fimalgoritmo