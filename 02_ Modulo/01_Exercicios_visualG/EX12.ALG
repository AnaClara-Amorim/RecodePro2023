Algoritmo "semnome"

Var
   preco, novo_preco, desconto: real

Inicio

   Escreva ("Digite o preço do produto: ")
   leia (preco)
   desconto <- 15
   novo_preco <- preco - (preco * 15/100)

   se novo_preco < 500 entao
      Escreval ("Barato")
   senao
      Escreval ("Caríssimo")
   fimse


Fimalgoritmo