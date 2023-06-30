let personas = [
    {
    id: 1,
    nombre: "Ale",
    edad: 15
    },
    {
    id: 2,
    nombre: "Javi",
    edad: 83
    },
    {
    id: 3,
    nombre: "Luis",
    edad: 26
    },
    {
    id: 4,
    nombre: "Dan",
    edad: 16
    },
    {
    id: 5,
    nombre: "Tito",
    edad: 22
    },
    {
    id: 6,
    nombre: "Marina",
    edad: 76
    },
    {
    id: 7,
    nombre: "Susy",
    edad: 35
    },
    {
    id: 8,
    nombre: "John",
    edad: 25
    },
]   

/*    Ordenar la colección de menor a mayor utilizando bubble sort.
Crear una función buscarPorEdad que recibe como parámetros la colección de personas y una edad, y como resultado deberá imprimir por consola el nombre correspondiente a la persona cuya edad fue pasada como parámetro.
Para realizar la búsqueda en la colección de personas, utilizar el algoritmo de búsqueda binaria.
    */

function bubbleSort(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1 - i; j++) {
            if (array[j].edad > array[j+1].edad) {
                let temporal = array[j]
                array[j] = array[j+1]
                array[j+1] = temporal
            }
        }
    }
    return array
}

function busquedaEdad(array,edad) {
    let high = array.length - 1
    let low = 0
    while (low <= high) {
        const mid = Math.floor((low + high) / 2)
        const guess = array[mid].edad
        if (guess === edad) {
            return array[mid]
        }
        if (guess > edad) {
            high = mid - 1
        }
        else{
            low = mid + 1
        }
    }
    return null
}




bubbleSort(personas)
console.table(personas);
console.log(busquedaEdad(personas, 26));

