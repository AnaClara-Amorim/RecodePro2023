let idade = 26 // Inteiro
        let salario = 10000 // Real - double
        const ano = 2023 // Constante, não pode ser alterado 
        let nome = "Ana" // Texto - string

        // Entrada de dados
        let valor1 = Number(prompt("Digite o valor1")) // Aqui o valor digitado vai vir em texto, por isso, é preciso transformar em texto com o Number()
        let valor2 = Number(prompt("Digite o valor2"))


        // Processo de dados
        //let valor1 = 250 
        //let valor2 = 300
        
        let soma = valor1 + valor2
        alert(`A soma dos valores é igual à ${soma}`)

        let nome1 = prompt(`Digite seu nome`);
        let anoatual = Number(prompt(`Digite o ano atual: `));
        let anonas = Number(prompt(`Digite o ano em que você nasceu: `))
        idadef = anoatual - anonas
        alert (`Seja bem vindo/a ${nome1}! Sua idade é: ${idadef}`)