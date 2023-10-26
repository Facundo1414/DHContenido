const listadoNoticias = [{
        titulo: "La emoción de Lisandro Martínez",
        epigrafe: "La increíble ovación de los hinchas de Manchester United al defensor argentino: 'Quise llorar'.",
        foto: "./img/futbol.webp"
    },
    {
        titulo: "La renuncia de Liz Truss",
        epigrafe: "Boris Johnson interrumpió sus vacaciones y vuelve a sonar fuerte entre los posibles sucesores.",
        foto: "./img/boris.webp"
    },
    {
        titulo: "Los motivos",
        epigrafe: "Una escuela argentina fue elegida entre las diez mejores del mundo.",
        foto: "./img/escuela.webp"
    },
    {
        titulo: "agregando",
        epigrafe: "Boris Johnson interrumpió sus vacaciones y vuelve a sonar fuerte entre los posibles sucesores.",
        foto: "./img/boris.webp"
    },
    {
        titulo: "agregando",
        epigrafe: "Boris Johnson interrumpió sus vacaciones y vuelve a sonar fuerte entre los posibles sucesores.",
        foto: "./img/boris.webp"
    },
    {
        titulo: "agregando",
        epigrafe: "Boris Johnson interrumpió sus vacaciones y vuelve a sonar fuerte entre los posibles sucesores.",
        foto: "./img/boris.webp"
    }
]

/* -------------------------------------------------------------------------- */
/*                          CONSIGNA MESA DE TRABAJO                          */
/* -------------------------------------------------------------------------- */
// Antes de comenzar vamos a comentar la parte de PRACTICANDO ATRIBUTOS y PRACTICANDO CREACION DE NODOS.
// Una vez que solo tenemos el código comentado podemos empezar la practica.
// 1- Debemos reutilizar el "listadoNoticias" para lograr el mismo resultado de crear los nodos dinamicamente.
// 2- La diferencia ahora radica en utilizar un bucle y dentro del mismo utilizar la notación de Plantillas Literales (con comillas invertidas -> ``)
// 3- El resultado debe ser el mismo que en el caso anterior pero vamos a implementar el método innerHTML para insertar la plantilla creada.
// Ejemplo: si quiero insertar un titulo en el body, haría los siguiente:
// document.querySelector('body').innerHTML += `<h1>Nuevo Título</h1>`;

function renderizandoElementos() {
    listadoNoticias.forEach(noticia => {
        document.querySelector("main").innerHTML += 
        `<article>
            <h2 > ${noticia.titulo}    </h2>
            <img src= ${noticia.foto} alt= "miniatura de noticia" >  </img>
            <p > ${noticia.epigrafe}</p>
        </article>`
    })
};
renderizandoElementos();