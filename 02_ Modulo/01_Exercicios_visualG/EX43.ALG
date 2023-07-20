Algoritmo "semnome"

procedimento P_somar (x1, x2:real)
inicio
   soma <- x1+x2
   escreva ("A soma dos valores = ", soma)
fimprocedimento

funcao f_soma (x1, x2: real):real //Esse retorno pode ser diferente
inicio
   retorne x1 + x2
fimfuncao

Var
   valor1, valor2, soma, resultado: real

Inicio

   //p_somar (100, 100)
   resultado <- f_soma(250, 250)
   escreva (resultado + 1500)



Fimalgoritmo