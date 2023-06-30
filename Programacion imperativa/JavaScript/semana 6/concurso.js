const alicia = [10, 80, 75];
const bob = [90, 20, 25];

function encontrarGanador(a, b) {
    let puntosPrimerParticipante = 0;
    let puntosSegundoParticipante = 0;
    for (let i = 0; i < a.length; i++) {
        if (a[i] == b[i]) {
        //empate
        console.log('Empate');
        }
        else if (a[i] > b[i]) {
            puntosPrimerParticipante += 1
            console.log('Ganador de la ronda jugador 1');
        }
        else{
            puntosSegundoParticipante += 1
            console.log('Ganador de la ronda jugador 2');
        }    
    }
    if (puntosPrimerParticipante > puntosSegundoParticipante) {
        console.log('El ganador final es el 1');
    }
    else if (puntosPrimerParticipante != puntosSegundoParticipante) {
        console.log('El ganador final es el 2');
    }
    else{
        console.log('Empate');
    }
}

console.log("El ganador es: " + encontrarGanador(alicia, bob) + "participante");


