Algoritmo "semnome"

//Crie um programa em Portugol que solicite ao usuário um número inteiro
//positivo. O programa deve verificar se o número digitado é par ou ímpar
//e exibir uma mensagem correspondente. O programa deve continuar
//solicitando números até que o usuário digite um número igual a zero

Var

   i, numero: inteiro

Inicio
   repita

      escreval ("Qual o número? Para sair do programa, digite 0")
      leia (numero)
      limpatela
      se numero % 2 = 0 entao
         escreval ("O número é par!")
      senao
         escreval ("O número é ímpar!")
      fimse
   ate numero = 0


Fimalgoritmo