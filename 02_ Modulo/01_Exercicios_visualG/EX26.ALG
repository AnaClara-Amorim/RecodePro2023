Algoritmo "semnome"

Var

   numerca, valor, s, contador, soma: inteiro
   media: real

Inicio

    soma <- 0

   Escreval ("Escreva o n�mero total de mercadorias no estoque: ")
   leia (numerca)
   
   contador <- numerca

   repita

      Escreval ("Digite o valor de cada mercadoria: ")
      leia (valor)
      
      soma <- valor + soma
      
      contador <- contador - 1
      
   ate contador <= 0

   media <- soma / numerca
   Escreval ("O n�mero de mercadoria foi de: ", numerca)
   Escreval ("A m�dia do valor das mercadorias foi de: ", media)

Fimalgoritmo