// Esta es la base de datos de nuestros usuarios
const baseDeDatos = {
  usuarios: [
    {
      id: 1,
      name: "Steve Jobs",
      email: "steve@jobs.com",
      password: "Steve123",
    },
    {
      id: 2,
      name: "Ervin Howell",
      email: "shanna@melissa.tv",
      password: "Ervin345",
    },
    {
      id: 3,
      name: "Clementine Bauch",
      email: "nathan@yesenia.net",
      password: "Floppy39876",
    },
    {
      id: 4,
      name: "Patricia Lebsack",
      email: "julianne.oconner@kory.org",
      password: "MysuperPassword345",
    },
  ],
};

// ACTIVIDAD

// Paso a paso:



document.querySelector(".login-btn").addEventListener("click",function () {
  document.querySelector("#loader").classList.toggle("hidden")

  // simulando tiempo de ejecucion
  setTimeout(function () {
    document.querySelector("#loader").classList.toggle("hidden")

      //tomando los datos
      email = document.querySelector("#email-input").value
      password = document.querySelector("#password-input").value

      //validando
      const errorContainer = document.querySelector("#error-container");
      errorContainer.classList.remove("hidden");

      if (validaciones(email,password)) {
        errorContainer.classList.add("hidden");
        document.querySelector("body").innerHTML = "<h1> Bienvenido al sitio 😀 </h1>"
        
      }
      else{
        errorContainer.innerHTML = `<p><small>Alguno de los datos ingresados son incorrectos</small></p>`;
      }

      
    
      
  },3000)



})


function validaciones(email, password) {
  // 1) Que el primer input sea un email válido.
  let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!regex.test(email)) {
    return false;
  }
  
  // 2) Que la contraseña tenga al menos 5 caracteres.
  if (password.length < 5) {
    return false;
  }
  
  // 3) Que los datos ingresados corresponden a una
  // persona que se encuentre registrada en la base de datos.
  const usuarioEncontrado = baseDeDatos.usuarios.find(
    (usuario) => usuario.email === email && usuario.password === password
  );
  
  if (usuarioEncontrado) {
    return true;
  } else {
    return false;
  }
}


