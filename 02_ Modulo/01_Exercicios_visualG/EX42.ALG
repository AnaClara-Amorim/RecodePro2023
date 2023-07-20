Algoritmo "semnome"

//Crie um programa em Portugol que solicite ao usuário um número inteiro
//positivo. O programa deve verificar se o número digitado é par ou ímpar
//e exibir uma mensagem correspondente. O programa deve continuar
//solicitando números até que o usuário digite um número igual a zero

Var

   mercadoriaEstoque, valorTotal, valorMercadoria, i: inteiro
Inicio

   escreval ("Digite o número total de mercadorias: ")
   leia (mercadoriaEstoque)

   repita
      escreval ("Qual o valor da mercadoria? ")
      leia (valorMercadoria)
      valorTotal <- valorTotal + valorMercadoria
      i <- i + 1
   ate i = mercadoriaEstoque

   escreval ("O valor total é ", valorTotal)
   escreval ("A média é: ", valorTotal/mercadoriaEstoque)



Fimalgoritmo