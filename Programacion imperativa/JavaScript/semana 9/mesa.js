
let ingresosBrutos =[1000,2000,3000,4000,5000,6000,7000,8000,9000
,10000,11000,12000]

function mostrarElementos(array) {
    ingresosBrutos.forEach(function(element,i){
        console.log('En el mes ', i+1 , ' ingresaron ' + element);
    });
}


/* mostrarElementos(ingresosBrutos) */


function descuento(array) {
    return array.map(function(elemnt) {
        return elemnt = elemnt*0.8
    })
}

nuevo_array =(descuento(ingresosBrutos));
/* console.log(nuevo_array); */

function total(array) {
    return array.reduce(function (acumulador,element) {
        return acumulador + element
    })
}

/* console.log('Ganancia bruta = ', total(ingresosBrutos));
console.log('Ganancia neta = ', total(nuevo_array));
 */


function filtro(array) {
    return array.filter(function(element) {
        if (element > 4000) {
            return element
        }
    })
}


/* console.log(filtro(ingresosBrutos)); */