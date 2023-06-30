/* let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"];
let pelis_animadas = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

function mayus(array){
    for(let i = 0;i <= array.length - 1; i ++){
        array[i] = array[i].toUpperCase()
    }
    return array
}

function unir(a,b){
    for(let i = 0;i <= b.length - 1; i ++){
        a.push(b[i])
    }
    return a
}




mayus(peliculas)
mayus(pelis_animadas)
console.log(peliculas);

unir(peliculas,pelis_animadas)
console.log(peliculas);

//eliminando
let error_juego = peliculas.pop()

console.log(peliculas);
console.log(error_juego);

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compare(a, b){
    let coinciden = 0
    for(let i = 0;i <= b.length - 1; i ++){
        if(a[i]== b[i]){
            coinciden += 1
        }
    }
    console.log("La cantidad de valoraciones que coinciden son "+ coinciden+" de "+ a.length);
}

compare(asiaScores,euroScores) */




//          Array inverso       

/* 
let ar = ["h",'o','l','a']

ar.reverse()
console.log(ar);



 */

//sumaArray()

/* function suma(a, b, c){
    let total = 0
    for(let i = 0;i <= b.length - 1; i ++){
        total += a[i]+ b[i] + c[i]
    }
    console.log('total: '+ total);
}

let a=[1,2,3] // 6
let b=[10, 3, 10] // 23
let c=[-5,100, 19]// 114
suma(a,b,c) */

