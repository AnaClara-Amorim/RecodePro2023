Algoritmo "semnome"

Var

   num, fora10, entre10, x, n, i, soma: inteiro

Inicio

   i <- 1
   n <-1
   x <- 1
   entre10 <- 0
   fora10 <- 0

   repita

      Escreval ("Escreva 10 n�meros: ")
      leia (num)

      se (num >= 10) e (num <=20) entao

         entre10 <- entre10 + n
      senao

         fora10 <- fora10 + x

      fimse
      
      i <- i +1

   ate i >= 11

   Escreval ("A quantidade de n�meros entre 10 e 20 � de: ", entre10)
   Escreval ("A quantidade de n�meros fora deste intervalo � der: ", fora10)


Fimalgoritmo