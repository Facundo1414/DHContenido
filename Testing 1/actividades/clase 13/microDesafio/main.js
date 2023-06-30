import * as calcu from "./Calculadora"

let resultado = calcu.calcular(5,4,"SUMA")
console.log(resultado);


// casos errados
let operacionSuma = calcular(2,null,"suma");
let operacionResta = calcular("a",3,"resta");
let operacionMultiplicacion = calcular(5,2.3,"multiplicacion");
let operacionDivision = calcular(20,0,"division");
let operacionSinDatos = calcular();

