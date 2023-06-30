const prompt = require("prompt-sync")({ sigint: true })



////////////////////////////////////////////////////////////////////////
function convertCm(){
    let inch = prompt("Indique el valor que desea convertir ")
    let cent = inch * 2.54
    return console.log(inch + " pulgadas son " + cent + " cm")                 //cajita
}
//////////////////////////////////////////////////////////////////////


// llama la funcion
convertCm()

