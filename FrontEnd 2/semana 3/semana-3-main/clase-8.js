/* -------------------------------------------------------------------------- */
/*                        [4] FUNCION: marcar favorito                        */
/* -------------------------------------------------------------------------- */
function marcarFavorito() {
    // seleccionamos todos lo botones de like
    const botonesLike = document.querySelectorAll('.fa-heart');

    botonesLike.forEach(boton => {
        // 👇 por cada boton escuchamos su click
        boton.addEventListener('click', function () {
            console.log(boton.id);

            // recorreremos el listado de albumes
            albumesFamosos.forEach(album => {
                // si encontramos al que coincide con el boton apretado,
                // le cambiamos la propiedad like por lo contrario
                if (album.id === boton.id) {
                    album.like = !album.like;
                }
            })

            actualizar()
        })
    })
}
marcarFavorito()
/* -------------------------------------------------------------------------- */
/*                         [5] FUNCION: Eliminar album                        */
/* -------------------------------------------------------------------------- */
function eliminarAlbum() {
    document.addEventListener("keydown", function (event) {
        if (event.key === "f") {
            const albumEliminar = prompt("ingrese el nombre del album a eliminar"); 
            // recorreremos el listado de albumes
            const indice = albumesFamosos.findIndex(album => album.nombre == albumEliminar);
            // si existe lo eliminamos
            if (indice !== -1) {
                albumesFamosos.splice(indice, 1);
            }
            //
            actualizar()
        }})
    }
eliminarAlbum();

/* -------------------------------------------------------------------------- */
/*                         Actualiza el renderizado actual                    */
/* -------------------------------------------------------------------------- */
function actualizar() {
    marcarFavorito()
    renderizarAlbumes(albumesFamosos);
}