
  // SEGURIDAD: Si no se encuentra en localStorage info del usuario
// no lo deja acceder a la página, redirigiendo al login inmediatamente.

  /* if (!localStorage.getItem('jwt')) {
    location.replace('index.html')
  } */


/* ------ comienzan las funcionalidades una vez que carga el documento ------ */
window.addEventListener('load', function () {

  /* ---------------- variables globales y llamado a funciones ---------------- */
  const btnCerrarSesion = this.document.querySelector("#closeApp")
  const formCrearTarea = document.querySelector('.nueva-tarea');
  const nuevaTarea = document.querySelector('#nuevaTarea');
  const username = this.document.querySelector(".user-info p")

  const token = JSON.parse(this.localStorage.jwt)
  const url = 'https://todo-api.ctd.academy/v1'


  obtenerNombreUsuario()
  consultarTareas()
  /* -------------------------------------------------------------------------- */
  /*                          FUNCIÓN 1 - Cerrar sesión                         */
  /* -------------------------------------------------------------------------- */

  btnCerrarSesion.addEventListener('click', function () {
    localStorage.clear()
    location.replace('./index.html');
  });

  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 2 - Obtener nombre de usuario [GET]                */
  /* -------------------------------------------------------------------------- */

  function obtenerNombreUsuario() {
    const settings = {
      method: 'GET',
      headers: {
        authorization: token
      }
    };


    fetch(`${url}/users/getMe`,settings)
    .then(response => {
      response.json()
    })
    .then(data =>{
      username.innerText = data.firstName
    })
    .catch(error => console.log(error));

  };


  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 3 - Obtener listado de tareas [GET]                */
  /* -------------------------------------------------------------------------- */

  function consultarTareas() {
    
    const settings = {
      method : 'GET',
      headers : {
        authorization: token
      }
    }

    fetch(`${url}/tasks`,settings)
    .then(response => response.JSON())
    .then(data => {
      renderizarTareas(tareas);
      botonesCambioEstado();
      botonBorrarTarea();
    })

  };


  /* -------------------------------------------------------------------------- */
  /*                    FUNCIÓN 4 - Crear nueva tarea [POST]                    */
  /* -------------------------------------------------------------------------- */

  formCrearTarea.addEventListener('submit', function (event) {
    event.preventDefault();

    const payload = {
      description: nuevaTarea.value.trim()
    };
    const settings = {
      method: 'POST',
      body: JSON.stringify(payload),
      headers: {
        'Content-Type': 'application/json',
        authorization: token
      }
    }

    fetch(urlTareas, settings)
      .then(response => response.json())
      .then(tarea => {
        consultarTareas();
      })
      .catch(error => console.log(error));

      
    //limpiamos el form
    formCrearTarea.reset();
      

  });


  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 5 - Renderizar tareas en pantalla                 */
  /* -------------------------------------------------------------------------- */
  function renderizarTareas(listado) {

    // obtengo listados y limpio cualquier contenido interno
    const tareasPendientes = document.querySelector('.tareas-pendientes');
    const tareasTerminadas = document.querySelector('.tareas-terminadas');
    tareasPendientes.innerHTML = "";
    tareasTerminadas.innerHTML = "";

    // buscamos el numero de finalizadas
    const numeroFinalizadas = document.querySelector('#cantidad-finalizadas');
    let contador = 0;
    numeroFinalizadas.innerText = contador;




  };

  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 6 - Cambiar estado de tarea [PUT]                 */
  /* -------------------------------------------------------------------------- */
  function botonesCambioEstado() {
    
    



  }


  /* -------------------------------------------------------------------------- */
  /*                     FUNCIÓN 7 - Eliminar tarea [DELETE]                    */
  /* -------------------------------------------------------------------------- */
  function botonBorrarTarea() {
   
    

    

  };

});