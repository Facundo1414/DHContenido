#Ejercicio 1
#Escribir un script en PowerShell que muestre por pantalla la cadena
#“¡Hola Mundo!”. Luego que almacene la cadena “¡Hola Mundo!” en una
#variable y muestre por pantalla el contenido de esa variable.

$saludo = Write-Output "Hola Mundo"
Write-Output $saludo

#Ejercicio 2
#Escribir un script en PowerShell que pregunte el nombre del usuario en
#la consola y después de que el usuario lo introduzca muestre por
#pantalla la cadena “¡Hola <nombre>!”, donde <nombre> es el nombre
#que el usuario haya introducido.
Write-Output ""

$nombre = Read-Host "ingrese su nombre: "
Write-Output "¡Hola $nombre !"

#Ejercicio 3
#Escribir un script en PowerShell que pregunte al usuario por el número
#de horas trabajadas y el coste por hora. Después debe mostrar por
#pantalla la paga que le corresponde.
Write-Output ""

#version 1
$numhoras = Read-Host "ingrese las horas trabajadas: "
$numhoras = $numhoras -as [int]
#version 2
[int]$costohoras = Read-Host "ingrese el costo de la hora: "

$total = $numhoras * $costohoras
Write-Output "Total: $ $total "


#Ejercicio 4
#Escribir un script en PowerShell que pida al usuario su peso (en kg) y
#estatura (en metros), calcule el índice de masa corporal y lo almacene en
#una variable, y muestre por pantalla la frase “Tu índice de masa corporal
#es <imc>”, donde <imc> es el índice de masa corporal calculado
#redondeado con dos decimales.
Write-Output ""

[float]$peso = Read-Host "ingrese su peso en kg: "
[float]$estatura = Read-Host "ingrese su estatura en m: "

$imc = ($peso) / ($estatura * $estatura) 
$formattedNumber = "{0:N2}" -f $imc

Write-Output "Total:  $formattedNumber "

#Ejercicio 5
#Escribir un script en PowerShell que pida al usuario ingresar un número,
#calcular el factorial de ese número y guardar el resultado en un archivo.
Write-Output ""

[int]$numfac = Read-Host " ingresar un número para calcular el factorial: "
$numtotal = 1;


for ( $i=1; $i -lt $numfac; $i++){

    $numtotal = $numtotal + $numtotal*$i
}


Write-Output "Total:  $numtotal "