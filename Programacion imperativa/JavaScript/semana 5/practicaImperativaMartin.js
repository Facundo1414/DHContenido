/* 



function promedio(array){
  let prom = 0
  let longitud = array.length
  for (let i = 0; i <= longitud - 1; i ++ ){
    prom += array[i]
  }
  console.log("Promedio = " + prom / longitud);
}

promedio([2,5,2,6,8,4,8,5])

function mayor_elemento(array){
  let may = 0
  let longitud = array.length
  for (let i = 0; i <= longitud - 1; i ++ ){
    if (may < array[i]){
      may = array[i]
    }
  }
  console.log("Mayor = " + may);
}

mayor_elemento([2,5,2,6,8,4,8,5])

/* 4 - Funcion que reciba un array de edades y retorne true si encuentra algun elemento repetido o false caso contrario */

function repetido(array){
  let longitud = array.length
  let edadRepetida = []
  for (let i = 0; i <= longitud - 1; i ++ ){
    const edad = array[i]
    if (edadRepetida.includes(edad)) {
      return true
    }
    edadRepetida.push(edad)
    }
    return false
  }

console.log(repetido([10, 15, 8, 22, 55, 80, 49, 9, 29, 9]));

//
//5 - Funcion que reciba un array de edades y una edada buscar, retorne el primer índice si encuentra coincidencia o null caso contrario

function indice(array,edad){
  let ok = array.indexOf(edad)
  if(ok != -1)
    console.log(ok);
  else
    console.log("null");
}

indice([10, 15, 8, 22, 55, 80, 49, 9, 29, 9], 80)






function objeto_propiedad(array){
  let menores = []
  let mayores = []
  for (let i = 0; i <= array.length - 1 ; i ++){
    if(array[i]< 18){
      menores.push(array[i])
    }
    else{
      mayores.push(array[i])
    }
  }
  let objeto = {
    edadesMenor : menores,
    edadesMayor : mayores
  }
  return objeto
}

console.log(objeto_propiedad([10, 18, 8, 3, 55, 4, 49, 9, 29, 9]));



//1 - Desarrollar un objeto literal que contenga 5 propiedades que sean del siguiente tipo:
/*    - 2 String   
   - 1 Boolean
   - 1 Number
   - 1 Array
   - 1 Metodo que retorne un saludito */


let objeto_5 = {
  nombre : "Mili",
  edad : 19,
  datos : ["Dice que se bania pero no le creo"," mide 1.56", "dato no menor se cayo de la cuna cuando era chiquita y quedo con secuelas"],
  saludar : function(){
    console.log("Hola soy Mili");
  }
}

console.log(objeto_5);
console.log(objeto_5.saludar());




function buscador(array, ide){
  for(i=0; i <= array.length -1  ;i ++ ){
    if(array[i].id == ide){
      return console.log(array[i]);
    }
    
  }
  return console.log("No se encontro");
}


let array = [
        {
          id: 0,
          isProgrammer: true,
          age: 28,
          name: "Harrington Curry",
          company: "TRANSLINK",
          favoriteFruit: "strawberry"
        },
        {
          id: 1,
          isProgrammer: false,
          age: 38,
          name: "Greta Morton",
          company: "PYRAMI",
          favoriteFruit: "apple"
        },
        {
          id: 2,
          isProgrammer: false,
          age: 32,
          name: "Hester Bowen",
          company: "TURNABOUT",
          favoriteFruit: "apple"
        },
        {
          id: 3,
          isProgrammer: false,
          age: 25,
          name: "Melendez Mcfarland",
          company: "XSPORTS",
          favoriteFruit: "strawberry"
        },
        {
          id: 4,
          isProgrammer: false,
          age: 31,
          name: "Kimberly Matthews",
          company: "KNOWLYSIS",
          favoriteFruit: "banana"
        },
        {
          id: 5,
          isProgrammer: false,
          age: 36,
          name: "Hardin Sims",
          company: "SEALOUD",
          favoriteFruit: "banana"
        },
        {
          id: 6,
          isProgrammer: true,
          age: 29,
          name: "Natalia Huff",
          company: "ENERSOL",
          favoriteFruit: "apple"
        }
      ]
      
function lista(array){
  for(i=0; i <= array.length -1  ;i ++ ){
    console.log(array[i].name);
    
  }
}

function programadores(array){
  let nuevo_array = []
  for(i=0; i <= array.length -1  ;i ++ ){
    if(array[i].isProgrammer){
      nuevo_array.push(array[i])
    }
  }
  console.log(nuevo_array);
}



/* lista(array) */
/* programadores(array) */
/* buscador(array,9) */