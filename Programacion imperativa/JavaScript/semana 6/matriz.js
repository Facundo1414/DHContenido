
// Parte 1 
let matriz = 
[[1,2],
[3,4]]


console.log(matriz[1][1]);
console.log(matriz[1][0]);

// Parte 2

let matrizRectangular = [
    [1,2,3,4,5],
    [6,7,8,9,10],
    [11,12,13,14,15]
]

console.table(matrizRectangular)

// Parte 3

for (let fila = 0; fila < matrizRectangular.length ; fila++) {
    for (let columna = 0; columna < matrizRectangular[fila].length; columna++) {
        console.log(matrizRectangular[fila][columna]);
    }
}