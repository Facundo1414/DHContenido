const prompt = require("prompt-sync")({ sigint: true })

function numeros_siguientes(numero){
    //parte 1
    console.log("\t\tParte 1");
    for (let i=numero; i <= numero + 10 ; i++){
        console.log("El siguiente del numero es: ",i);
    }
    //parte 2
    console.log("\n\t\tParte 2");
    for (let i=5; i<=20;i+=3){
        console.log("num: ", i);
    }
    //parte 3
    console.log("\n\t\tParte 3");
    let total_num = 0
    for(let i=0;i<=100;i++){
        console.log("sumatoria: ",total_num += i );
    }
    //parte 4
    console.log("\n\t\tParte 4");
    let num_entero = 0
    while (num_entero==0){
        num_entero = parseInt(prompt("Ingrese un numero entero positivo: "))
        if (num_entero <= 0){
            console.log("Error, se pidio un numero positivo, ingrese de nuevo");
            num_entero = 0
        }
    }
    let factorial = 0
    for (let i = 0; i<=num_entero; i++){
        factorial += num_entero * i
    }
    console.log("El factorial de '" + num_entero + "' es: "+ factorial);
    //parte 5           // la sucesión de Fibonacci se escribe así: n = n-1 + n-2.
    console.log("\n\t\tParte 5 sucesión de Fibonacci");
    let x = 0;
	valor = parseInt(prompt("Ingrese un numero: "));
	let arreglo = [];
	for (x; x<valor; x++){
		if(x==0){
			arreglo.push(0);
		}
		else if(x==1){
			arreglo.push(1);
		}
		else{
			arreglo.push(arreglo[x-1]+arreglo[x-2]);
		}
	}
	console.log("resultado "+ arreglo);
}


numeros_siguientes(10) // llamada a la funcion