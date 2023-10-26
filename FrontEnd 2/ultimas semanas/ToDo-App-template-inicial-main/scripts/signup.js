window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const form = this.document.forms[0];
    const nombre = this.document.querySelector("#inputNombre")
    const apellido = this.document.querySelector("#inputApellido")
    const email = this.document.querySelector("#inputEmail")
    const password = this.document.querySelector("#inputPassword")
    const repeatedPassoword = this.document.querySelector("#inputPasswordRepetida")
    const url = 'https://todo-api.ctd.academy/v1'

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {
        event.preventDefault()

        mostrarSpinner()
        // preparamos los datos
        const payload = {
            firstName: nombre.value,
            lastName: apellido.value, 
            email: email.value,
            password: password.value
        };
        const settings = {
            method: 'POST',
            body: JSON.stringify(payload),
            headers: {
                'Content-Type': 'application/json'
            }
        }

        // 
        realizarRegister(settings)
        
        ocultarSpinner()

        form.reset()
    });

    /* -------------------------------------------------------------------------- */
    /*                    FUNCIÓN 2: Realizar el signup [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarRegister(settings) {
        
        fetch(`${url}/users`,settings)
        .then(response => {
            console.log(response);
            return response.json();
        })
        .then(data => {
            console.log(data);
            if (data.jwt) {
                //guardo en LocalStorage el objeto con el token
                localStorage.setItem('jwt', JSON.stringify(data.jwt));

                //redireccionamos a la página
                location.replace('./mis-tareas.html');
            }
        })
        .catch(err => {
            console.log("Promesa rechazada:");
            console.log(err);})


    };


});