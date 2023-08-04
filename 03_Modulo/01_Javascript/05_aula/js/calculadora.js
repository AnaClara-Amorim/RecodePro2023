function calc(){ 

    let v1 = Number(document.getElementById("v1").value)
    let v2 = Number(document.getElementById("v2").value)
    let opc = document.getElementById("opc").value

    let result = 0

    if(opc == "1"){
        result = v1 - v2
    }

    else if (opc == "2"){
        result = v1 + v2
    }

    else if (opc == "3"){
        result = v1 * v2
    }

    else if (opc == "4"){
        result = v1 / v2
    } 

    document.getElementById("resultado").value = result 

}