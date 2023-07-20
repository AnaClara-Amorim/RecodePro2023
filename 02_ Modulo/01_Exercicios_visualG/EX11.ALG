Algoritmo "semnome"

var
   desconto, compra, valor: real
   nome: caractere

Inicio

   escreva ("Digite o seu nome: " )
   leia (nome)
   escreva ("Digite o valor do produto: " )
   leia (compra)

   se compra <= 200 entao
      desconto <- 10
      senao
           se (compra >= 200) e (compra <= 500) entao
           desconto <- 15
           senao
           desconto <- 20
         fimse
   fimse
   compra <- compra - (compra*desconto/100)
   Escreval ("Olá, ", nome, ", o seu desconto foi de: ", desconto, "%. e o valor da sua compra é de: ", compra, " reais.")
Fimalgoritmo