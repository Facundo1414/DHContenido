let mice = [['lucas','camila','pedro'],['juan','luisa',null]]

console.log(mice[1][1])

mice[1][2] = 'jerry'

console.log(mice);

function saludo(matriz) {
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j <= matriz.length; j++) {
            console.log("Hola soy " + matriz[i][j]);
        }
    }
}

saludo(mice)