
function sumar(x,y){
    return x + y
}
function restar(x,y){
    return x - y
}
function multiplicar(x,y){
    return x * y
}
function dividir(x,y){
    return x / y
}


console.log("\t\t operando a lo perro \t\n");
console.log(sumar(5,3));
console.log(restar(10,12));
console.log(multiplicar(45,32));
console.log(dividir(10,2));

function cuadradoDeUnNumero(x){
    return console.log("cuadrado de "+ x + " es " + (multiplicar(x,x)));
}
cuadradoDeUnNumero(5)

function promedioDeTresNumeros(x,y,z){
    let sumita = sumar(x,y)
    let total = (sumita + z) / 3
    return console.log("promedio es " + total);
}

promedioDeTresNumeros(6,8,4)


function calcularPorcentaje(num, por){
    let total = multiplicar(num,por) / 100
    console.log("total porcentaje = % " + total);
}
calcularPorcentaje(300, 50)


function GeneradorDePorcentaje(x, y){
    return console.log("porcentaje = % "+ (x * 100 / y));
}

GeneradorDePorcentaje(100, 200)