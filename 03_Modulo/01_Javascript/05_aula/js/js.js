document.getElementById("calcular").addEventListener("click", calcular).value = calcular

function calcular(){
    let altura = Number(document.getElementById("altura").value)
    let peso = Number(document.getElementById("peso").value)

    let imc = peso / (altura * altura)
    document.getElementById("resultado").value = imc.toFixed(1) /* O to fixed é para limitar o número de casas decimais */
}