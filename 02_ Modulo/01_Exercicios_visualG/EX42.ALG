Algoritmo "semnome"

//Crie um programa em Portugol que solicite ao usu�rio um n�mero inteiro
//positivo. O programa deve verificar se o n�mero digitado � par ou �mpar
//e exibir uma mensagem correspondente. O programa deve continuar
//solicitando n�meros at� que o usu�rio digite um n�mero igual a zero

Var

   mercadoriaEstoque, valorTotal, valorMercadoria, i: inteiro
Inicio

   escreval ("Digite o n�mero total de mercadorias: ")
   leia (mercadoriaEstoque)

   repita
      escreval ("Qual o valor da mercadoria? ")
      leia (valorMercadoria)
      valorTotal <- valorTotal + valorMercadoria
      i <- i + 1
   ate i = mercadoriaEstoque

   escreval ("O valor total � ", valorTotal)
   escreval ("A m�dia �: ", valorTotal/mercadoriaEstoque)



Fimalgoritmo