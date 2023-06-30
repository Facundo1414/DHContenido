const prompt = require("prompt-sync")({ sigint: true })


/* 1) Escribí un programa que le pida al usuario ingresar una frase y
la imprima en la consola.
 */

/* 
console.log(prompt("Escrina una frase: "));

 */




/* 2) Escribí un programa que le pregunte al usuario su nombre e
imprima "Hola " seguido del nombre y un signo de
exclamación */
/* 
console.log("Hola "+ prompt('nombre: ')+" !!!")

 */


/* 3) Escribí un programa que le pida al usuario ingresar un número,
luego le pida un segundo número, e imprima en la consola la
suma de los dos números que ingresó el usuario.

 */
/* 
let a = parseInt(prompt("Ingrese 1er Numero: "))
let b = parseInt(prompt("Ingrese 2do Numero: "))
console.log("La suma de los 2 numeros es igual a "+ (a+b));
 */


/* 4) Escribí un programa que le pida al usuario su año de
nacimiento e imprima su edad actual en la consola con la frase
"Tienes X años" (siendo X la cantidad de años).
 */
/* 
let fecha = parseInt(prompt("Ingrese su año de nacimiento: "))
console.log("Tiene "+ (2023 - fecha) +" años");

 */



/* 5) Escribí un programa que piense un número de forma aleatoria
del 1 al 10 y le pida al usuario que lo trate de adivinar. Si el
número es correcto debe imprimir en la consola "Felicitaciones,
ese era!", de lo contrario, debe imprimir "Lo siento, intenta
nuevamente!" */


/* let num_aleatorio = Math.floor(Math.random() * 10);
let num_user = parseInt(prompt("Ingrese Numero: "))

if (num_aleatorio == num_user){
    console.log("Felicitaciones, ese era!");
}
else{
    console.log("Lo siento, intenta nuevamente, era el "+ num_aleatorio);
}
 */


/* 6) Escribí un programa que imprima los números pares del 0 al
100 */
/* 
for(let i = 0; i <=100;i++){
    if(i%2==0){
        console.log(i);
    }
} */






// 7) Escribí un programa que itere sobre el arreglo nombres e
/* imprima cada uno en la consola: const nombres = ["Pedro",
"Pablo", "Maria", "Juan", "Diana"]; */


/* let arreglo = ["Pedro","Pablo", "Maria", "Juan", "Diana"];

for(let i = 0; i <= 4; i++){
    console.log(arreglo[i]);
}
 */



/* 8) Construí un pseudocódigo que permita ingresar un número, si
el número es mayor de 500, se debe calcular y mostrar en
pantalla el 18% de este.
 */

/* let num_user = parseInt(prompt("Ingrese Numero: "))

if (num_user >=500){
    let x = num_user * 18 /100
    console.log("El 18% de "+ num_user + " es "+ x);
}
 */


/* 9) Escribí una función llamada elemento que recibe un arreglo
como parámetro. La función debe devolver el valor que se
encuentra en la tercera posición. Si el arreglo no tiene al menos
3 elementos deberá retornar -1. */
/* 
function elemento(arreglo){
    if (elemento.length >3){
        return console.log(-1);
    }
    else{
        return console.log(arreglo[3]);
    }
}
elemento([5,2,3,3])


 */

/* 10) Se ingresa por teclado un número natural de hasta 2 cifras, si
tiene una cifra que muestre lo mínimo que le falta para ser un
número de 2 cifras; de lo contrario, que muestre lo mínimo que
le falta para ser un número de 3 cifras. Considerar que el
usuario ingresa números de hasta dos cifras.

 */
/* 
let numero_natural = Number(prompt("number: "))
if (numero_natural < 10){// es de 1 cifra
    vueltas_f(numero_natural, 10, 2)
}
else if(numero_natural <100){ // es de 2 cifra
    vueltas_f(numero_natural, 100, 3)
}
function vueltas_f(num , c_v, cifra){
    let vueltas = 0
    while(num<c_v){
        num++, vueltas++
    }
    console.log("Le faltan ",+ vueltas, " cantidades para llegar a ser un numero de "+ cifra + " cifras");
} */




/* 11) Hacer un algoritmo que muestre el promedio de varias
notas o de N notas ingresadas, se debe definir el valor de N
para conocer la cantidad de notas a ingresar.
 */
/* 
let n = parseInt(prompt("Ingrese la cantidad de notas: "))
let total = 0
for (let i=1;i<=n;i++){
    let notas = parseInt(prompt("Ingrese la nota: "))
    total += notas
}
console.log("El promedio de las notas es igual a "+ (total/n)); */




/* 12) Hacer un programa que calcule la suma de los N primeros
números naturales, dónde N es el número límite ingresado por
teclado */

let n = parseInt(prompt("Ingrese la cantidad de numeros a sumar: "))
let total = 0
for (let i=1;i<=n;i++){
    let num = parseInt(prompt("Ingrese un numero: "))
    total += num
}
console.log("La suma de los numeros es de "+ total); 
