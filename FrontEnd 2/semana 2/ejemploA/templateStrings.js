let escribirEnHTML = confirm("escribir html?")

/////////////////////////////////////////////////////////

function escribirHTML(titulo, texto) {
    const body = document.querySelector('div.text-box');
    const miTemplate = `
    <h2>${titulo}</h2>
    <p>${texto}</p>
    `;
    body.innerHTML += miTemplate;
} 

/* if (escribirEnHTML) {

    escribirHTML('Personajes',"hola");
}
 */

////////////////////////////////////////////////////////

function crearPersonaje(objetoPersonaje) {
    let plantillaPersonaje = `
    <div style="border:1px solid black; width 500px;">
        <img src="${personaje.apellido}"width = "100%" alt="">
        <h3>Nombre</h3>
        <h4>${personaje.nombre}</h4>
        <h3>Apellido</h3>
        <h4>${personaje.apellido}</h4>
        <h3>Nacimiento</h3>
        <h4>${personaje.nacimiento.fecha}</h4>
        <h3>Lugar</h3>
        <$>${personaje.nacimiento.ciudad},${personaje.nacimiento.estado}</h4>
        <h3>Trabajo</h3>
        <p>${personaje.trabajo.rol} en <strong>${personaje.trabajo.compania}</strong> </p>
    </div>`;
    let boxPersonaje = document.querySelector("div.box1");
    boxPersonaje.classList.toggle();
}

let personaje = {
    nombre: "Michael",
    apellido: "Scott",
    nacimiento: {
        fecha: "15/04/1965",
        ciudad: "Scranton",
        estado: "Pensilvania"
    },
    imagenUrl : "https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/MichaelScott.png/220px-MichaelScott.png",
    trabajo: {
        rol: "manager regional",
        compania: "Dunder Mifflin"
    }
};

if (escribirEnHTML) {
    crearPersonaje(personaje);
}
