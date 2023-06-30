const prompt = require("prompt-sync")({ sigint: true })
/* let edad=2 //(el número es a modo de ejemplo, podes cambiarlo o crear otras para tener varias pruebas) 


function impar(edad){ // funcion que se encargar de validar si es impar o no su edad
    if ((edad % 2) !== 0 ){ 
        console.log("¿Sabías que tu edad es impar?")}}




if(edad<0){ // Pregunta si es un numero negativo
    console.log("Error, edad inválida. Por favor ingrese un número válido." )
}
else if(edad<18) { 
    console.log("No puede pasar al bar.") 
    impar(edad)
}
else if(edad<21){ 
    console.log("Puede pasar al bar, pero no puede tomar alcohol.") 
    impar(edad)
} 
else if(edad==21){ 
    console.log("bienvenido rey!!!") // Pregunta si tiene 21
    impar(edad)
}
else{ 
    console.log("Puede pasar al bar y tomar alcohol.") 
    impar(edad)
} 


 */



// parte 2 totalAPagar() 


/* 
function totalAPagar(vehiculo, litrosConsumidos) {
    let total = 0
    if (vehiculo == "coche"){
        total = litrosConsumidos * 86
    }
    else if (vehiculo == "moto"){
        total = litrosConsumidos * 86
    }
    else {
        total = litrosConsumidos * 86
    }
    if (litrosConsumidos > 0 && litrosConsumidos < 25){
        total = total + 50
    }
    else{
        total = total + 25
    }
    return total
}

console.log("El total es $ " + totalAPagar("coche",30));

 */


// Local de sándwiches 



/* function Local_s(opcion_base, tipo_de_pan,Q,T,L,C,Ma,Mo){
    let total = 0
    //
    if (opcion_base == "pollo"){
        total += 150
    }
    else if(opcion_base == 'carne'){
        total += 200
    }
    else if(opcion_base == 'veggie'){
        total += 100
    }
    //
    // tipo de pan
    if (tipo_de_pan == "blanco"){
        total += 50
    }
    else if(tipo_de_pan == 'negro'){
        total += 60
    }
    else if(tipo_de_pan == 's/gluten'){
        total += 75}
    //
    // ingredientes
    if (Q){total += 20}
    if (T){total += 15}
    if (L){total += 10}
    if (C){total += 15}
    if (Ma){total += 5}
    if (Mo){total += 5}
    //
    return console.log("total = " + total)
    }

Local_s("pollo","negro",true,false,true,true,true,true)

//total

 */


//Numero Secreto

/* function number_secret(num){
    let x = Math.floor(Math.random() * 10)
    if (x == num){
        console.log("Tu numero "+ num + " coincide con "+ x);
    }
    else{
        console.log("Tu numero "+ num + " NO coincide con "+ x);
    }
}

number_secret(Number(prompt("Ingrese num: "))) */


//

/* 
function abrirParacaidas(velocidad, altura){
    if (velocidad<1000 && (3000 > altura) && altura >= 2000){
    console.log("OPEN PARACHUTE");
    }
}

abrirParacaidas(200,2400) */

//Traductor Condicional
/* 
function traductor(stringUno){
    switch(stringUno){
        case 'casa':
            console.log('Home');
            break
        case "perro":
            console.log('Dog');
            break
        case "pelota":
            console.log('Ball');
            break
        case 'arbol':
            console.log('Tree');
            break
        case 'genio':
            console.log('Genius');
            break
        default:
            console.log("Palabra mal formulada");
    }
}

traductor(prompt("Palabra: ")) */

//Valoración de Películas

function valorando_peli(opcion){
    switch(opcion){
        case "muy mala":
            console.log("Elegiste Muy mala lo sentimos");
            break
        case "mala":
            console.log("Elegiste mala lo sentimos :(");
            break
        case "mediocre":
            console.log("Elegiste mediocre lo intentamos");
            break
        case "buena":
            console.log("Elegiste buena nos alegramos");
            break
        case "muy buena":
            console.log("Elegiste Muy buena nos alegramos :)");
            break
        default:
            console.log("Opcion mal formulada");
    }
}

valorando_peli("muy bsad")