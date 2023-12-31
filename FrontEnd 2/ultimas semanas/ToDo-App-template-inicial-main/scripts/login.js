window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const form = document.forms[0];
    const email = document.querySelector('#inputEmail')
    const password = document.querySelector('#inputPassword')
    const url = 'https://todo-api.ctd.academy/v1';

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {
    event.preventDefault();

    mostrarSpinner()    

    const payload = {
        email: email.value,
        password: password.value
    }
    const settings = {
        method: 'POST',
        body: JSON.stringify(payload),
        headers: {
            'Content-Type': 'application/json'
        }
    };

    realizarLogin(settings)
    ocultarSpinner()
    });

    //limpio los campos del formulario
    form.reset();

    /* -------------------------------------------------------------------------- */
    /*                     FUNCIÓN 2: Realizar el login [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarLogin(settings) {
        fetch(`${url}/user/login`,settings)
        .then(response => {
        console.log(response);
        if (response.ok != true) {
            alert("Alguno de los datos es incorrecto.")
        }
        return response.json(); 
        })
        .then(data => {
            console.log("Promesa cumplida:");
            console.log(data);

            if (data.jwt) {
                //guardo en LocalStorage el objeto con el token
                localStorage.setItem('jwt', JSON.stringify(data.jwt));
                ocultarSpinner()
                //redireccionamos a la página
                location.replace('./mis-tareas.html');
                
            }
        }).catch(err => {
            console.log("Promesa rechazada:");
            console.log(err);
            ocultarSpinner()
        })
    };
});