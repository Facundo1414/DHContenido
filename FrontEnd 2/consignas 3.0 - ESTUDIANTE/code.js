/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  do{
    datosPersona.nombre = prompt("Ingrese su Nombre:");
  }while(datosPersona.nombre == "" | !isNaN(datosPersona.nombre))

  do {
    const anioActual = new Date().getFullYear();
    datosPersona.edad = anioActual - parseInt(prompt("Ingrese su año de nacimiento:"));
  } while (datosPersona.edad == "" | isNaN(datosPersona.edad) | datosPersona.edad < 0 | datosPersona.edad > 2023);
  

  do{
    datosPersona.ciudad = prompt("Ingrese su Ciudad:");
  }while(datosPersona.ciudad == "" | !isNaN(datosPersona.ciudad))

  
  if (confirm("Le interesa Javascript")) datosPersona.interesPorJs = "Si"
  else datosPersona.interesPorJs = "No"
  
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  document.querySelector("#nombre").innerHTML = datosPersona.nombre
  document.querySelector("#edad").innerHTML = datosPersona.edad
  document.querySelector("#ciudad").innerHTML = datosPersona.ciudad
  document.querySelector("#javascript").innerHTML = datosPersona.interesPorJs
}


function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  if (!document.querySelector(".caja")) {

    listado.forEach(element => {
      document.querySelector("#fila").innerHTML += 
      `<div class = "caja">
          <img src=${element.imgUrl}  alt=${element.lenguajes}></img>
          <p class= "lenguajes">${element.lenguajes}</p>
          <p class="bimestre">${element.bimestre}</p>
      </div>`
    } 
    );
  }
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  document.querySelector("#sitio").classList.toggle("dark")
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */

window.addEventListener("keydown", function (event) {
  if (event.key === "F") {
    this.document.querySelector("#sobre-mi").classList.remove("oculto")
  }
})
