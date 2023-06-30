
let matriz = [
    [1,3,2,4,5,5,3],
    [1,3,2,4,5,5,3],
    [1,3,2,4,5,5,3],
    [1,3,2,4,5,5,3]
]



/* a) Lo que nos solicitan es dar el total de gastos en una semana. Recordemos que cada
fila representa una semana, es decir, si nos indican semana 2 tenemos que sumar la
fila 1 de la matriz. Recordar que las matrices comienzan siempre en posición 0.
 */

function gastos(array, numero_Semana) {
    let total = 0
    for (let i = 0; i < array[numero_Semana-1].length; i++) {
        total += semanagastos(array[numero_Semana - 1])
    }
    return total    
}

function semanagastos(array) {
    let suma = 0
    for (let i = numero_Semana-1; i < array.length[numero_Semana]; i++) {
        suma += array[i]
    }
    return suma
}

console.log(gastos(matriz, 2));

/* b) La aplicación también tendrá una parte de estadísticas, para esto nos solicitan dar
el total de un día en particular, por ejemplo del día 3, acá también tengamos en
cuenta lo que ocurre con las filas, ya que las columnas también comienzan en 0.
 */



/* c) Por último, es necesario tener el total de gastos realizados en el mes.
 */




/* d) Obtener cuál fue la semana que más gastos se realizaron. Indicar el día que más
gastos se realizaron */
















/*
a)  Lo que nos solicitan es dar el total de gastos en una semana. 
Recordemos que cada fila representa una semana, es decir, 
si nos indican semana 2 tenemos que sumar la fila 1 de la matriz. 
Recordar que las matrices comienzan siempre en posición 0. 
b) La aplicación también tendrá una parte de estadísticas, 
para esto nos solicitan dar el total de un día en particular, 
por ejemplo del día 3, acá también tengamos en cuenta lo que ocurre 
con las filas, ya que las columnas también comienzan en 0.
c) Por último, es necesario tener el total de gastos realizados en el mes.
Pregunta para pensar, 
¿es lo mismo recorrer por filas o por columnas para resolver este último punto?

*/





let gastosmes =
    [[1135, 2500, 900, 1600, 2800, 3650, 1100],
     [1750, 1890, 1900, 1300, 898, 1750, 2800],
     [1700, 1150, 1690, 1900, 1770, 4500, 2560],
     [800, 1250, 1430, 2100, 1980, 1270, 950]
    ];


    function sumaMes(matrizGastos)
    {   let total=0;
        for(let i=0;i<matrizGastos.length;i++)  //0,1,2,3
        {
            total+=totalSemana(matrizGastos,i); //1,2,3,4
        }
        return total;
    }

function totalSemana(matrizGastos, semana)
{   
    let total=0;
    for (let i=0;i<matrizGastos[semana].length;i++)
    {
        total+=matrizGastos[semana][i];
    }
    return total;
}        
// semana 1,2,3,4
function gastoDia(matrizGastos, semana, dia)
{
    return (matrizGastos[semana-1][dia-1]);
}
function gastoDiaenMes(matrizGastos, dia)
{
    let total=0;
    for(let i=0;i<matrizGastos.length;i++)
    {
        total+=matrizGastos[i][dia-1];
    }
    return total;
}


console.log(totalSemana(gastosmes, 4));
console.log(gastoDia(gastosmes, 4,7));
console.log(gastoDiaenMes(gastosmes,7));
console.log(sumaMes(gastosmes));