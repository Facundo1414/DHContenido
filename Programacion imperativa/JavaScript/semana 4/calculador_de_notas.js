let alumno = {
    nombre : "Facundo Allende",
    legajo : 1243,
    lista_de_notas : [8,9,7,8,10,6]
}

function promedio(alumno, nota_de_aprobacion){
    let total = 0
    let cantidad = alumno.lista_de_notas.length
    for(i=0; i<= cantidad - 1 ;i++){
        total += alumno.lista_de_notas[i]
    }
    let promedio = total / cantidad
    if (promedio > nota_de_aprobacion){
        console.log("\t\tDatos del Alumno\n", alumno);
        console.log("Condicion: Aprobado \nPromedio = ", + promedio, '\nMinimo Promedio Esperdo = ' + nota_de_aprobacion);
    }
    else{
        console.log("\t\tDatos del Alumno\n", alumno);
        console.log("Condicion: Desaprobado \nPromedio = ", + promedio, '\nMinimo Promedio Esperdo = ' + nota_de_aprobacion);
    
    }
}

promedio(alumno, 7)