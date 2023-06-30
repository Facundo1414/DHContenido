const prompt = require("prompt-sync")({ sigint: true })

// Ejercicio 1
console.log('\t\tEJERCICIO 1\n');

function promedio(x,y,z){
    let promedio_total = (x+y+z)/3
    if(promedio_total < x){
        return x
    }
    else if(promedio_total < y){
        return y
    }
    else if(promedio_total < z){
        return z
    }
    else{
        return - 1
    }
    
}

// prueba 1
console.log("El mayor de los 3 numeros al promedio es: " + promedio(8,5,6));
// prueba 2
console.log("El mayor de los 3 numeros al promedio es: " + promedio(6,6,6));

// Ejercicio 2:
console.log('\n\t\tEJERCICIO 2\n');

function calculoPrecio(precio,porcentaje,descuento){
    if(descuento){
        precio -= porcentaje / 100 * precio
        return precio
    }
    else{
        return precio
    }
}

console.log("El total es: $ " + calculoPrecio(prompt("Ingrese Precio del producto: $ "),prompt("Ingrese el Porcentaje del Descuento: % "),true));


// Ejercicio 3:
console.log('\n\t\tEJERCICIO 3\n');

let hoteles = [
    {
        nombre:"Acantilados",
        ubicacion: "Mar de plata",
        disponible : true
    },
    {
        nombre:"Costa soleada",
        ubicacion: "Pinamar",
        disponible : false
    },
    {
        nombre:"Rivera",
        ubicacion: "Mar de plata",
        disponible : false
    },
    {
        nombre:"Playa dorada",
        ubicacion: "Miramar",
        disponible : true
    },
    {
        nombre:"Acantilados",
        ubicacion: "Pinamar",
        disponible : false
    },
]

function disponible(array){
    let nuevoArreglo = []
    for(let i = 0 ; i <= array.length - 1 ; i ++){
        if(array[i].disponible){
            nuevoArreglo.push(array[i])
        }
    }
    return nuevoArreglo
    
}

console.log("Los siguientes Hoteles estan disponibles:\n\n" , disponible(hoteles));
