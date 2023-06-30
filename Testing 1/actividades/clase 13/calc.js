function suma(a,b){
    if (isNaN(a) || isNaN(b)) {
        return false;
    }
    else{
        return a+b;
    }
}

function resta(a,b){
    if (isNaN(a) || isNaN(b)) {
        return false;
    }
    else{
        return a-b;
    }
}

function multiplicacion(a,b){
    if (isNaN(a) || isNaN(b)) {
        return false;
    }
    else{
        return a*b;
    }
}

function division(a,b){
    if (isNaN(a) || isNaN(b) || b==0 || a==null || b==null) {
        return false;
    }
    else{
        return a/b;
    }
}

function calcular(operando1, operando2, op){
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

// let operacionSuma = calcular(2,3,"suma");
// let operacionResta = calcular(10,3,"resta");
// let operacionMultiplicacion = calcular(5,3,"multiplicacion");
// let operacionDivision = calcular(20,4,"division");

let operacionSuma = calcular(2,null,"suma");
let operacionResta = calcular("a",3,"resta");
let operacionMultiplicacion = calcular(5,2.3,"multiplicacion");
let operacionDivision = calcular(20,0,"division");
let operacionSinDatos = calcular();


