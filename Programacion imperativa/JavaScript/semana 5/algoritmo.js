// we are going to make some functions to increase our logical mindset



//Calcular el sueldo de una persona, conociendo la cantidad de horas que trabaja en el mes y el valor de la hora.

function sueldo_hs(horas,valor){
    console.log("Sueldo: " + (horas * valor) );
}
sueldo_hs(125,500)

// Calcular el importe que debe pagar una persona compra una heladera de pesos X y por pagar en efectivo le hacen el 10% de descuento ¿Cuánto abona?


function importe(x){
    console.log("Precio Inicial: "+ x + "\nPrecio Final con descuento: "+ (x-x*0.10));
}
importe(1000)

//Convertir longitudes de millas a Km. y de pulgadas a cm., si:1 milla = 1.60935 Km.1 pulgada = 2.534 cm

function conversor(millas,pulgadas){
    console.log(millas + " millas son "+(millas*1.60935) +" km");
    console.log(pulgadas + " pulgadas son "+(pulgadas*2.534) +" cm");
}
conversor(10,30)

//Hallar la longitud de la hipotenusa de un triángulo dada la medida de sus catetos5. Ingresar un número de tres cifras y mostrar el segundo dígito.

function hipotenusa(cateto1,cateto2){
    let hip = Math.sqrt(cateto1*cateto1 + cateto2*cateto2) 
    console.log("Hipotenusa = " + hip);
}
hipotenusa(3,4)

/* function mostrar_Segundo(x){
    for(let i = 0; i <= 3 ;i++ ){
        if (i == 1){
            console.log(x[i]);
        }
    }
}
mostrar_Segundo(456) */

// 

// Ingresar un número. Si es positivo, calcular su raíz cuadrada, si es negativo mostrar su cuadrado y si es cero mostrar “Error. Ha ingresado un valor nulo”.

function raizcuadrada(num){
    if(num>0){
        console.log(Math.sqrt(num));
    }
    else if(num != 0){
        console.log(num*num);
    }
    else{
        console.log("Error. Ha ingresado un valor nulo");
    }
}
raizcuadrada(25)

//Ingresar las edades de dos personas. Si una de ellas es mayor de edad y la otra menor de edad, calcular y mostrar su promedio. 
//En caso contrario mostrar las dos edades.

function edades(x,y){
    if ((x<18 || y<18)&&(x>=18 || y>=18)){
        console.log((x+y)/2);
    }
    else{
        console.log(x, y);
    }
}

edades(18,6)

//Ingresar dos números, calcular y mostrar el cociente del primero por el segundo, siempre que el divisor no sea cero
//. En este último caso mostrar la leyenda “no se puede realizar el cociente”.

function cociente(x,y){
    if (y == 0){
        console.log("no se puede realizar el cociente");
    }
    else{
        console.log("cociente del primero por el segundo : " + x/y);
    }
}
cociente(11,0)

//Ingresar el valor de la ganancia anual de una empresa y calcular su retención según se encuentre dentro de los
// siguientes parámetros: Ganancia Retención<= 10000 Cero>10000 y <= 15000 2% sobre (ganancia -10000)> 150000 300+5% sobre (ganancia -15000)

