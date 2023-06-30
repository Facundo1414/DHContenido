let a = [
    [5,2,3],
    [2,2,3],
    [4,2,3],
    [4,2,4]
]


function multiplicar_matriz_pornumero(array,k) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            array[i][j] *= k
        }
    }
    return array
}

/* console.table(multiplicar_matriz_pornumero(a,2)) */

let p = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]


function mostrarElementosDiagonales(array) {
    let diagonalPrincipal = []
    let diagonalSecundaria = []
    let diagonalTriangulaSup = []
    let diagonalTriangulaInf = []
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
            if (i==j) {
                diagonalPrincipal.push(array[i][j])
            }
            if (i + j == array.length - 1) {
                diagonalSecundaria.push(array[i][j])
            }
            if (j>i) {
                diagonalTriangulaSup.push(array[i][j])
            }
            if (j<i) {
                diagonalTriangulaInf.push(array[i][j])
            }
        }
    }
    console.log('Elementos de la diagonal principal: ',diagonalPrincipal);
    console.log('Elementos de la diagonal secundaria: ',diagonalSecundaria);
    console.log('Elementos triangular superior: ',diagonalTriangulaSup);
    console.log('Elementos triangular inferior: ',diagonalTriangulaInf);
    
}

/* mostrarElementosDiagonales(p) */
