Algoritmo "semnome"

Var
   preco, novo_preco, desconto: real

Inicio

   Escreva ("Digite o pre�o do produto: ")
   leia (preco)
   desconto <- 15
   novo_preco <- preco - (preco * 15/100)

   se novo_preco < 500 entao
      Escreval ("Barato")
   senao
      Escreval ("Car�ssimo")
   fimse


Fimalgoritmo