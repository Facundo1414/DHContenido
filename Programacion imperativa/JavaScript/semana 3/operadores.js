/* // suma resta multiplicacion division modulo 

console.log( 10 + 12);
console.log( 10 - 6);
console.log( 10 * 6);
console.log( 12 / 6);
console.log( 12 % 6);
console.log();

// incremento decremento

let numero = 1;
console.log(++ numero);
console.log(-- numero);
console.log();
// Comparadores

console.log( 5 == 5);
console.log( 5 !== 5);
console.log( 5 === "5");
console.log( 5 < 5);
console.log();

// Logicos and && or || 

console.log(true && true);
console.log(true || true);

// concatenar

let name = "facu"
let lastname = 'allende'
console.log(name + ' ' + lastname);
console.log();

console.log("Gato" || "Perro");
console.log();

// switch

let fruta = "cosa"

switch(fruta){
    case 'manzana':
        console.log("manzanita");
        break;
    case 'naranja':
        console.log("naranjita");
        break;
    default:
        console.log("what is this?");
}

//  ciclo for

let texto = "hola"
function loro(texto){
    for (let vuelta = 1; vuelta <= 5; vuelta ++){
        console.log(texto)
    }
}
loro(texto)
console.log();



function noParesDeContarImparesHasta(rango_maximo_numero){
    let contadore_de_impares = 0; 

// for (desde, hasta, cuenta_vueltas)     (1,2,3,4,5,6,7,8,9)
    for(let contador=0; contador<=rango_maximo_numero; contador++){
        // hasta aca solo declaramos la cantidad de vueltas

        if((contador%2) !== 0){ // aca chequeo si es impar
            contadore_de_impares = contadore_de_impares+1; // aca suma si es impar
        }

    }
    return contadore_de_impares;
}
console.log(noParesDeContarImparesHasta(9));

console.log();

// Ciclo while

function tablaDeMultiplicar(numero) {
    let i = 1
    while (i<11){
        let producto = i * numero
		console.log(numero + " * " + i + " = " + producto) 
        i += 1;
    }
}
tablaDeMultiplicar(5)

 */

function sumando(){
    let suma = 0 // declaro una variable que se encargue de acumular la suma de cada ciclo
    
    for(let i=0;i<=5;i++){ // i indica la cantidad de vueltas del ciclo
        suma += 3
        console.log(suma) // muestra la variable suma incrementada de 3 en 3
    }
    // despues de 5 vueltas termina la funcion
}
sumando()