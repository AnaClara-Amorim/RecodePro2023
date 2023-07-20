algoritmo "Projeto_Final"

procedimento cadastrar_cliente ()
inicio
   limpatela
   para i de 1 ate 5 passo 1 faca
      escreval ("Digite o NOME do ", i , " cliente:")
      leia (nome_global[i])
      escreval ("Digite o CPF do ", i , " cliente:")
      leia (cpf_global[i])
      escreval ("Digite o EMAIL do ", i , " cliente:")
      leia (email_global[i])
   fimpara
fimprocedimento

procedimento cadastrar_destino()
inicio
   limpatela
   para i de 1 ate 5 passo 1 faca
      escreval ("Digite o PAÍS destino do ", i , " cliente:")
      leia (pais[i])
      escreval ("Digite a CIDADE destino do", i , " cliente:")
      leia (cidade[i])
   fimpara
fimprocedimento

procedimento consulta_cliente()
inicio
   para i de 1 ate 5 passo 1 faca
      escreval (nome_global[i])
      escreval (cpf_global[i])
      escreval (email_global[i])
   fimpara
fimprocedimento

procedimento consulta_destino()
inicio

   para i de 1 ate 5 passo 1 faca
      escreval (pais[i])
      escreval (cidade[i])
   fimpara
fimprocedimento

var
   resposta,s, n: caractere
   opcao, i :inteiro
   opcao_cadastro, opcao_consulta: inteiro
   nome_global: vetor [1..5] de caractere
   cpf_global: vetor [1..5] de caractere
   email_global: vetor [1..5] de caractere
   pais: vetor [1..5] de caractere
   cidade: vetor [1..5] de caractere

inicio

   resposta <- "N"
   enquanto (resposta = "N") faca
      escreval ("---------------- Agência de viagens ----------------")
      escreval (" ")
      escreval ("             Seja bem vindo(a) ao MENU!             ")
      escreval ("   Use este menu para cadastrar e fazer consultas   ")
      escreval ("              Para CADASTRAR, digite 1              ")
      escreval ("           Para fazer CONSULTAS, digite 2           ")
      escreval ("               Para ENCERRAR, digite 3              ")
      escreval (" ")
      escreval (" -------------------------------------------------- ")
      leia (opcao)

      limpatela

      escolha opcao

      caso 1
         escreval ("     Você selecionou opção CADASTRAR CLIENTE     ")
         Escreval ("      Deseja cadastrar CLIENTE ou DESTINO?       ")
         escreval ("         Para cadastrar CLIENTE, digite 1        ")
         escreval ("         Para cadastrar DESTINO, digite 2        ")

         leia (opcao_cadastro)
         se opcao_cadastro = 1 entao
            cadastrar_cliente()
         senao
            cadastrar_destino()
         fimse

      caso 2
         escreval ("        Você selecionou a opção CONSULTAR         ")
         Escreval ("       Deseja consultar CLIENTE ou DESTINO?       ")
         escreval ("         Para consultar CLIENTE, digite 1         ")
         escreval ("         Para consultar DESTINO, digite 2         ")
         leia (opcao_cadastro)
         se opcao_cadastro = 1 entao
            escreval ("  Aqui estão os clientes cadastrados:  ")
            consulta_cliente()
         senao
            escreval ("  Aqui estão os destinos cadastrados:  ")
            consulta_destino()
         fimse

      caso 3
         escreval ("Você selecionou a opção ENCERRAR")
         resposta <- "S"

      outrocaso
         escreval ("Você não selecionou um número válido, digite um número de 1 a 3")
         leia (opcao)
      fimescolha
   fimenquanto

   escreval ("Você chegou ao fim do menu!")

fimalgoritmo