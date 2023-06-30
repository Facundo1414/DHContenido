/* const edades = [11, 12, 15, 18, 25, 22, 10, 33, 18, 5]; */

/* 
function menores(array){
    const nuevoarray = []
    for (i=0 ; i <= array.length -1  ;i++ ){
        if(array[i] < 18){nuevoarray.push(array[i])}}
    console.log(nuevoarray);
}
menores(edades)

function mayores(array){
    const nuevoarray = []
    for (i=0 ; i <= array.length -1  ;i++ ){
        if(array[i] > 18){
            nuevoarray.push(array[i])}}
    console.log(nuevoarray);
}

mayores(edades)

 */


/* 
function incremento(array){
    let nuevoarray = []
    for (i=0 ; i <= array.length - 1  ;  i++ ){
        let x = array[i];
        x++;
        nuevoarray.push(x)
    }
    return nuevoarray
}

console.log(edades);
console.log(incremento(edades));
 */


const arrayCuentas = [
    {
      titular: "Arlene Barr",
      estaHabilitada: false,
      saldo: 3253.40,
      edadTitular: 33,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Roslyn Torres",
      estaHabilitada: false,
      saldo: 3229.45,
      edadTitular: 27,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Cleo Lopez",
      estaHabilitada: true,
      saldo: 1360.19,
      edadTitular: 34,
      tipoCuenta: "corriente"
    },
    {
      titular: "Daniel Malone",
      estaHabilitada: true,
      saldo: 3627.12,
      edadTitular: 30,
      tipoCuenta: "sueldo"
    },
    {
        titular: "Ethel Leon",
      estaHabilitada: true,
      saldo: 1616.52,
      edadTitular: 34,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Harding Mitchell",
      estaHabilitada: true,
      saldo: 1408.68,
      edadTitular: 25,
      tipoCuenta: "corriente"
    }
  ]


// Obtener un nuevo array de cuentas cuyas edades sean menores a 30.

function edades_menores(array){
    nuevo_array = []
    for (i=0 ; i <= array.length - 1;  i++ ){
        if(array[i].edadTitular < 30){
            nuevo_array.push(array[i])
        }
    }
    console.log(nuevo_array);
}

/* edades_menores(arrayCuentas) */

// Desarrollar una función llamada generarID que
// reciba como parámetro el array de cuentas y agregue a cada elemento (objeto literal) una propiedad llamada id con un valor Numérico
function generarID(array_de_objetos){
    for (i=0 ; i <= array_de_objetos.length - 1;  i++ ){
        array_de_objetos[i].id = i
        }
    /* console.log(array_de_objetos); */
    }
generarID(arrayCuentas)

function buscarPorId(array_de_objetos,ide){  
    for (i=0 ; i <= array_de_objetos.length - 1;  i++ ){
        if(array_de_objetos[i].id == ide){
            array_de_objetos[i]
        }
        else{
            return null
        }
        }
}
buscarPorId(arrayCuentas, 3)