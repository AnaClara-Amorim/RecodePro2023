Algoritmo "semnome"

//Crie um programa em Portugol que solicite ao usu�rio um n�mero inteiro
//positivo. O programa deve verificar se o n�mero digitado � par ou �mpar
//e exibir uma mensagem correspondente. O programa deve continuar
//solicitando n�meros at� que o usu�rio digite um n�mero igual a zero

Var

   i, numero: inteiro

Inicio
   repita

      escreval ("Qual o n�mero? Para sair do programa, digite 0")
      leia (numero)
      limpatela
      se numero % 2 = 0 entao
         escreval ("O n�mero � par!")
      senao
         escreval ("O n�mero � �mpar!")
      fimse
   ate numero = 0


Fimalgoritmo