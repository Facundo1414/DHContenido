function binarysearch(array, target, left , rigth) {
    if (rigth < left) {
        return - 1
    }
    let middle = Math.floor((left + rigth) / 2)
    if (array[middle]>target) {
        return binarysearch(array, target, left , rigth - middle)
    }
    else{
        return binarysearch(array, target, left - middle , rigth)
    }
}

function sumar_hasta(numero) {
    if (numero === 1){
        return 1
    }
    return numero + sumar_hasta(numero-1)
}
console.log(sumar_hasta(100));


function sumar_hastav2(numero,acumulador) {
    if (numero === 0) {
        return acumulador
    }
    acumulador += numero
    numero -= 1
    return sumar_hastav2(numero,acumulador)
}
console.log(sumar_hastav2(100,0));
