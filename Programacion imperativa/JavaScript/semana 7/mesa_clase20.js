/* Ejercicio 1 */

/* En un concurso de fotografía, donde los usuarios publican una fotografía y obtienen likes, se registra la cantidad de likes obtenidos 
por cada usuario en un array. Ordenar los valores para poder indicar cuál fue la mayor cantidad de likes obtenidos, cuánto obtuvo el segundo, 
cuánto el tercero y cuánto el que menos likes obtuvo —suponer que participaron 15 usuarios y suponer para cada uno, una cantidad de likes—. */


/* Deberás construir tu propio array de prueba, el cual contendrá un número de objetos (determinado por vos) donde cada objeto tendrá 
las siguientes propiedades:
likes: numero
username: string 
 */



let objeto_concurso = [
    {
    likes: 10,
    username: 'Facu'
},
    {
    likes: 130,
    username: 'Soli'
},
    {
    likes: 120,
    username: 'Carlos'
},
    {
    likes: 16,
    username: 'Fran'
},
    {
    likes: 102,
    username: 'Lu'
},
    
]


function ordenar_concurso_por_likes(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length -1; j++) { 
            if (array[j].likes < array[j+1].likes) {
                let temporal = array[j] // guardame el objeto en una cajita
                array[j]= array[j+1] // intercambio de objetos
                array[j+1] = temporal // aca tambien
            }
        }
    }
    return array
}

console.table(ordenar_concurso_por_likes(objeto_concurso));


console.log('Top 1: ',objeto_concurso[0]);
console.log('Top 2: ',objeto_concurso[1]);
console.log('Top 3: ',objeto_concurso[2]);


console.log('Ultimo: ', objeto_concurso[objeto_concurso.length - 1]);

// [1,23,4,6]



/* Ejercicio 2
El servicio meteorológico, para llevar el control diario de temperatura, utiliza un objeto temperatura donde registra día 
—valor numérico del día—, mes —valor numérico—, temperatura máxima y temperatura mínima, correspondiente a dicho día. 
Las temperaturas —objeto temperatura— están cargados en un array. 
Deberás construir tu propio array de prueba, el cual contendrá un número de objetos (determinado por vos) donde cada
 objeto tendrá las siguientes propiedades:
 */
/* dia: numero
 mes: numero
 tempMax: número
 tempMin: número
  */

let temperatura = [
    {
    dia: 1,
    mes: 1,
    tempMax: 10,
    tempMin: 5
    },
    {
    dia: 2,
    mes: 2,
    tempMax: 105,
    tempMin: 55
    },
    {
    dia: 3,
    mes: 3,
    tempMax: 102,
    tempMin: 54
    }
]




/*  Ordenar por temperatura mínima de menor a mayor */
function ordenar_temp_menor_a_mayor(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1; j++) {
            if (temperatura[j].tempMin > temperatura[j+1].tempMin) {
                let t = temperatura[j]
                temperatura[j] = temperatura[j+1]
                temperatura[j+1] = t
            }
        }
    }
    return array
}
console.table(ordenar_temp_menor_a_mayor(temperatura));



/* Ordenar por temperatura máxima de mayor a menor.  */

function ordenar_temp_alreves(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1; j++) {
            if (temperatura[j].tempMax < temperatura[j+1].tempMax) {
                let t = temperatura[j]
                temperatura[j] = temperatura[j+1]
                temperatura[j+1] = t
            }
        }
    }
    return array
}
console.table(ordenar_temp_alreves(temperatura));