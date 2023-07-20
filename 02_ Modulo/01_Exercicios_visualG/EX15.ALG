Algoritmo "calculadora"

Var

   operacao, soma, a, b: inteiro

Inicio

   escreval ("Escolha dois números para somar ou subtrair")
   Escreval ("Digite o primeiro número: ")
   leia (a)
   Escreval ("Digite o segundo número: ")
   leia (b)
   escreval ("Escolha qual operação você quer")
   Escreval ("Caso adição, digite 1, caso subtração, digite 2")
   Escreval ("Caso multiplicação, digite 3, caso divisão, digite 4")
   leia (operacao)

   escolha operacao

   caso 1

      escreval ("Você escolheu adição!")
      soma <- a + b
      escreval ("Seu resultado é: ", soma)

   caso 2

      escreval ("Você escolheu subtração!")
      soma <- a - b
      escreval ("Seu resultado é: ", soma)

   caso 3

      escreval ("Você escolheu multiplicação!")
      soma <- a * b
      escreval ("Seu resultado é: ", soma)

   caso 4

      escreval ("Você escolheu divisão!")
      soma <- a / b
      escreval ("Seu resultado é: ", soma)

   outrocaso
      escreval ("Você não escolheu corretamente, favor reiniciar o programa!")

   fimescolha

Fimalgoritmo