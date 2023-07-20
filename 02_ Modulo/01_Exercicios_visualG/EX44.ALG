Algoritmo "semnome"



funcao calc_idade (ano1, ano2: real):real //Esse retorno pode ser diferente
//não precisa do var aqui pois já foi declarado acima
inicio
   retorne ano1 - ano2
fimfuncao

Var
   ano_atual, ano_inicial, idade: real

Inicio

    Escreval ("Digite o ano atual e seu ano de nascimento ")
    leia (ano_atual, ano_inicial)
   idade <- calc_idade (ano_atual, ano_inicial)
   escreva ("Sua idade é: ", idade)


Fimalgoritmo