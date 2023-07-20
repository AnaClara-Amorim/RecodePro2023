Algoritmo "MATRIZ"

procedimento valor(produto:real)
var

inicio
   produto <- produto + (produto * 0.35)
   escreval ("O resultado do produto com acrescimo de 35% é de: ", produto)
fimprocedimento

Var
   prod: inteiro
Inicio
   Escreval ("Escreva o valor do produto: ")
   leia(prod)
   valor(prod) // variáveis de escopo global que vao ser passadas como parametro e lidas no parametro

Fimalgoritmo