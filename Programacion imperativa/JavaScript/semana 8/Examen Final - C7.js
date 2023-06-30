/* 
alumno = Allende Facundo
Camada 7 
*/

/* Ejercicio 1 
Realizar una función que reciba por parámetro dicho arreglo
y retorne un nuevo array con los objetos cuyo año de creación se encuentren entre 1800 y 1890 inclusive. 
 */

console.log('\t\tEjercicio 1');

let cuadros = [
    {
        nombre : "Mona Lisa",
        creador : "Leonardo Da Vinci",
        creacion : 1503
    },
    {
        nombre : "La ultima cena",
        creador : "Leonardo Da Vinci",
        creacion : 1495
    },
    {
        nombre : "La noche estrellada",
        creador : "Vincent van Gogh",
        creacion : 1889
    },
    {
        nombre : "El grito",
        creador : "Edvard Munch",
        creacion : 1893
    },
    {
        nombre : "Trigal con cuervos",
        creador : "Vincent van Gogh",
        creacion : 1890
    },
    {
        nombre : "Maria Magdalena",
        creador : "Leonardo Da Vinci",
        creacion : 1495
    }
]

function objetoPorAnio(array) {
    let nuevo_array = []
    for (let i = 0; i < array.length; i++) {
        if (array[i].creacion >=1800 && array[i].creacion <= 1900) {
            nuevo_array.push(array[i])
        }
    }
    return nuevo_array

}


console.table(objetoPorAnio(cuadros));


/* Ejercicio 2
Realizar una función que reciba por parámetro el arreglo de objetos que se da en la consigna del
ejercicio 1 y lo ordene de menor a mayor según su atributo creacion utilizando el algoritmo de
  ordenamiento Bubble Sort.  */

console.log('\n\t\tEjercicio 2');

function ordenarArray(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1 - i; j++) {
            if (array[j].creacion > array[j+1].creacion) {
                let temporal = array[j]
                array[j] = array[j+1]
                array[j+1] = temporal
            }    
        }
    }
    return array
}

console.table(ordenarArray(cuadros));

/* Ejercicio 3
Dada la siguiente matriz:  */
console.log('\n\t\tEjercicio 3');

let matriz = [
    [1,2,3,4,5],
    [6,7,8,9,10],
    [11,12,13,14,15],
    [16,17,18,19,20],
    [21,22,23,24,25]
]

/* Realizar una función que reciba por parámetro la matriz y retorne la multiplicación entre todos los 
elementos de la fila 1.
 */

function multiplicaciónFilaUno(array) {
    let multiplicación = 1
    for (let i = 0; i < array[0].length; i++) {
        multiplicación *= array[0][i]
    }
    return multiplicación
}

console.log('El producto de todos los elementos de la fila 1 es = ',multiplicaciónFilaUno(matriz));

/* Realizar una función que retorne la suma de todos los elementos que sean múltiplos de 3. */


function sumaMultiplosDeTres(array) {
    let suma = 0
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (array[i][j]%3 == 0) { 
                suma += array[i][j]
            }
        }
    }
    return suma
}

console.log('Total de elementos multiplos de 3 = ',sumaMultiplosDeTres(matriz));