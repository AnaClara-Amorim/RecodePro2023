Algoritmo "calculadora"

Var

   operacao, soma, a, b: inteiro

Inicio

   escreval ("Escolha dois n�meros para somar ou subtrair")
   Escreval ("Digite o primeiro n�mero: ")
   leia (a)
   Escreval ("Digite o segundo n�mero: ")
   leia (b)
   escreval ("Escolha qual opera��o voc� quer")
   Escreval ("Caso adi��o, digite 1, caso subtra��o, digite 2")
   Escreval ("Caso multiplica��o, digite 3, caso divis�o, digite 4")
   leia (operacao)

   escolha operacao

   caso 1

      escreval ("Voc� escolheu adi��o!")
      soma <- a + b
      escreval ("Seu resultado �: ", soma)

   caso 2

      escreval ("Voc� escolheu subtra��o!")
      soma <- a - b
      escreval ("Seu resultado �: ", soma)

   caso 3

      escreval ("Voc� escolheu multiplica��o!")
      soma <- a * b
      escreval ("Seu resultado �: ", soma)

   caso 4

      escreval ("Voc� escolheu divis�o!")
      soma <- a / b
      escreval ("Seu resultado �: ", soma)

   outrocaso
      escreval ("Voc� n�o escolheu corretamente, favor reiniciar o programa!")

   fimescolha

Fimalgoritmo