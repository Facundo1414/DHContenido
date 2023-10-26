function escribirHTML(titulo, texto) {
    const body = document.getElementById('body');
    const miTemplate = `
    <h1>${titulo}</h1>
    <p>${texto}</p>
    `;
    body.innerHTML += miTemplate;
} 

escribirHTML('Personajes');

function crearPersonaje(nombre,apellido) {
    let personaje = {
        nombre: `${nombre}`,
        apellido: "Scott",
        imagenUrl : "https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/MichaelScott.png/220px-MichaelScott.png",
        trabajo: {
            rol: "manager regional",
            compania: "Dunder Mifflin"
        }
    };
}
        

