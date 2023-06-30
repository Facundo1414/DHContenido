function calcular(operando1, operando2, op) {
    if ( isNaN(operando1) || isNaN(operando2)) {
        return console.log("Error no hay numeros");
    }
    
    let result = 0; 
    switch(op){
        case "suma": 
            result = suma(operando1,operando2);
            break;
        case "resta":
            result = resta(operando1,operando2);
            break;
        case "division":
            result = division(operando1,operando2);
            break;        
        case "multiplicacion":
            result = multiplicacion(operando1,operando2);
            break;
        default:
            console.log("Error: No es una operación válida");
    }

    
    if (!result){
        console.log("Error: no es posible realizar la operación: " + op)
    }
    else{
        console.log(" Operando1: " + operando1 + 
        "\n Operando2: " + operando2 +
        "\n Operacion: " + op +     
        "\n Resultado: " + result);
    }

}

function suma(numeroA, numeroB) {
    return numeroA + numeroB;
}
function resta(numeroA, numeroB) {
    return numeroA - numeroB;
}
function multiplicacion(numeroA, numeroB) {
    return numeroA * numeroB;
}
function division(numeroA, numeroB) {
    return numeroA / numeroB;
}


let resultado = calcular(5,4,"suma")
console.log(resultado);



let operacionSuma = calcular(2,null,"suma");
console.log(operacionSuma);
let operacionResta = calcular("a",3,"resta");
console.log(operacionResta);
let operacionMultiplicacion = calcular(5,2.3,"multiplicacion");
let operacionDivision = calcular(20,0,"division");
let operacionSinDatos = calcular();