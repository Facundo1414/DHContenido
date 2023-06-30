/* Propiedad única
Crear una función llamada propiedadUnica que reciba un arreglo de objetos como
parámetro y un string. Esta deberá retornar un nuevo arreglo de objetos, teniendo como
parámetro la propiedad que fue pasada como string.
Ejemplo:
let array = [ { nombre: “Lean”, edad: 27 }, { nombre: “Eze”, edad: 49} ]
propiedadUnica(array, “edad”) debe retornar [ { edad: 27 }, { edad: 49 } ]
propiedadUnica(array, “nombre”) debe retornar [ { nombre: “Lean”}, { nombre: “Eze” } ]
 */





let array = [ { nombre: 'Lean', edad: 27 }, { nombre: 'Eze', edad: 49} ]


/* function propiedadUnica(arreglo_obj,string){
    let nuevo_arreglo = []
    for (let i = 0; i <= arreglo_obj.length - 1; i++){
        if (arreglo_obj[i] == string){

        }
        }
    }

    return nuevo_arreglo
}
 */
console.log(propiedadUnica(array, "edad"));
