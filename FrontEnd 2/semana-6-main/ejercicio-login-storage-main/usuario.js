document.querySelector(".login-btn").addEventListener("click",function () {
    localStorage.clear()
    window.location.href = 'index.html'

    
})


const datos = localStorage.getItem("user")
const datosParseados = JSON.parse(datos)

document.querySelector("#email").innerText = datosParseados.email
document.querySelector("#perfil").innerText = datosParseados.name