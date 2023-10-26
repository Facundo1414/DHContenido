// 🚩 Primero que nada vamos a enlazar el HTML con este nuevo script y a su vez
// vamos a comentar la linea que lo vincula con el script de la clase 16.
// La idea es desarrollar en este script las nuevas y mejoradas funcionalidades.


/* -------------------------------------------------------------------------- */
/*                       [4] FUNCION: Consulta a la API                       */
/* -------------------------------------------------------------------------- */
// En este caso vamos a consultar a un servidor del cual nos vamos a traer la data.
// Esta API tiene su documentación en: https://jsonplaceholder.typicode.com/
// Vamos a implementar el endpoint que nos devuelve comentarios para mostrarlos en pantalla.

function consultaApi(endpoint) {

    fetch(endpoint)
        .then(objetoRespuesta => {
            const promesaJson = objetoRespuesta.json();
            return promesaJson;
        })
        .then(datosJs => {
            renderizarElementos(datosJs);
        })
        .catch(function(error){
            document.querySelector('.comentarios')
            .innerHTML = `<h2>"No se puede visualizar los comentarios"</h2>`
        })

}

/* -------------------------------------------------------------------------- */
/*                      [5] FUNCION: Escuchamos el click                      */
/* -------------------------------------------------------------------------- */
// Vamos a reimplementar la escucha del click lanzar las nuevas funciones.

const boton = document.querySelector('button');
const endpoint = 'https://jsonplaceholder.typicode.com/comments';

boton.addEventListener('click', function () {

    consultaApi(endpoint)

//TODO
 /*    try
    {
        
    }
    catch(error){
    } */
})

/* -------------------------------------------------------------------------- */
/*                      [6] FUNCION: renderizar elementos                     */
/* -------------------------------------------------------------------------- */
// Acá vamos a reutilizar la función de renderizar renderizarElementos, implementando
// el .map() y .join() para obtener el resultado esperado.

function renderizarElementos(listado) {
    const comentarios = document.querySelector('.comentarios');

    comentarios.innerHTML = listado.map(item => {
        return `<div class="comentario">
                    <h4>${item.email}</h4>
                    <p>${item.body}</p>
                </div>`
    }).join('');

    const botonMostrar = document.querySelector(".mostrar")
    botonMostrar.setAttribute("style", "visibility: hidden;");
}

/* ----------------------------- Mesa de trabajo ---------------------------- */
/* -------------------------------------------------------------------------- */
/*                              Mejoras de código                             */
/* -------------------------------------------------------------------------- */


// 4- Solo deben cargarse los primeros 10 comentarios que nos llegan.