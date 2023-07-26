/* Uma agência bancária possui dois tipos de investimentos, conforme o quadro abaixo. Faça um script que receba o tipo do investimento e o valor do investimento, calcule e mostre o valor corrigido de acordo com o tipo de investimento.

Tipo - 1 Poupança - 5%

Tipo - 2 Fundo de renda fixa - 10% */

const poupança = 0.05
const rendaFixa = 0.1

let valorDoInvestimento = Number(prompt("Digite o valor do investimento: "))
let tipoDeInvestimento = Number(prompt("Digite o tipo de investimento: "))

if (tipoDeInvestimento == 1) {
    valorDoInvestimento = valorDoInvestimento + valorDoInvestimento*poupança
    alert (`O valor final foi de ${valorDoInvestimento}`)

} else {
    valorDoInvestimento = valorDoInvestimento + valorDoInvestimento*rendaFixa
    alert (`O valor final foi de ${valorDoInvestimento}`)
}
