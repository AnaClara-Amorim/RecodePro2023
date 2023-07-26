/* Uma Empresa de vendas de softwares paga a seu vendedor um fixo de R$ 1200,00 por mês, mais uma comissão de 15% pelo seu valor de vendas no mês. Faça um algoritmo que leia o valor da venda e determine o salário total do funcionário. Mostre as informações que você achar necessário. */

const fixo = 1200
let valorDeVenda = Number(prompt("Digite o valor de venda"))
let salarioTotal = fixo + valorDeVenda*0.15
alert(`O salário final foi: ${salarioTotal}`)
