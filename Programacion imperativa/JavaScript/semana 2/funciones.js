function test1(x, y){
    return y - x
}

console.log(test1(10, 40));


function test2(x, y){
    return x * 2
}
console.log(test2(10));


function test3(x){
    return x + " !"
}
console.log(test3("hola"));

function test4(x){
    return console.log("edad = "+ (x * 7));
}
test4(5)

function test5(sueldo){
    let x = sueldo / 40
    return console.log("tu sueldo por hs es $" + x);
}
test5(120000)

function calculadorIMC(altura, peso){
    let imc = peso / (altura*altura)
    return console.log("imc es igual a "+ imc);
}
calculadorIMC(1.81, 76)



function mayus(text){
    const sentence = text;

    return console.log(sentence.toUpperCase());
}

mayus("hola soy facundo")

function tipode(x){
    return console.log(typeof x);
}
tipode(true)


function calculaCircunferencia(radio) {
    return 2 * Math.PI * radio;
}

console.log(calculaCircunferencia(3));

