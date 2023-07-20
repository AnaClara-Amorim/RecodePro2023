Algoritmo "semnome"

Var

   numero, i, soma: inteiro
Inicio

   i <- 1
   soma <- 0

   Escreval ("Escreva 10 números. Os números menores qua 40 serão somados!")

   enquanto i <= 10 faca
      leia (numero)

      Se numero < 40 entao
         soma <- soma + numero
      fimse

      i <- i + 1
   fimenquanto

   Escreval ("A soma final foi de: ", soma)


Fimalgoritmo