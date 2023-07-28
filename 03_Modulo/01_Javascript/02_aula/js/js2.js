/* Esse script será a simulação de um caixa de mercado, onde podemos lançar valores para N produtos. A cada lançamento o sistema deve perguntar se você quer fazer um novo lançamento escolhendo entre duas opções s / n, se o usuário selecionar s o sistema continua as vendas e no momento que o usuário selecionar n será encerrada as vendas.
O sistema vai calcular todos os produtos mostrando um prompt com o valor total da venda e vai pedir para lançar o valor que o cliente deu para o caixa, após esse procedimento o sistema vai mostrar o troco do cliente que é o valor dado pelo cliente menos o total da venda. */

let total = 0;
let produto = 0;
let resposta = "";
let valorPagamento = 0; let troco = 0; 

do{
    produto = Number(prompt(" == MERCADINHO RECODE == \nDigite o valor do produto: "));
    total = total + produto;
    resposta = prompt("Lançar outro produto: s / n");
}while (resposta == "s"); 

valorPagamento = Number(prompt("Total da compra R$ " + total + " - Digite o valor do pagamento: "));
troco = valorPagamento - total; 

alert(" -- CUPOM DO CLIENTE - \n" + "Total da compra: R$" + total + "\n" +
        "Total pago:          R$" + valorPagamento + "\n" +
        "Troco do cliente: R$"+ troco);