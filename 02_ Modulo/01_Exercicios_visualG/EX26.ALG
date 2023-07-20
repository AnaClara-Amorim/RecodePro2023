Algoritmo "semnome"

Var

   numerca, valor, s, contador, soma: inteiro
   media: real

Inicio

    soma <- 0

   Escreval ("Escreva o número total de mercadorias no estoque: ")
   leia (numerca)
   
   contador <- numerca

   repita

      Escreval ("Digite o valor de cada mercadoria: ")
      leia (valor)
      
      soma <- valor + soma
      
      contador <- contador - 1
      
   ate contador <= 0

   media <- soma / numerca
   Escreval ("O número de mercadoria foi de: ", numerca)
   Escreval ("A média do valor das mercadorias foi de: ", media)

Fimalgoritmo