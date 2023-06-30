let obj =  require("./response_ability.json") ;



function findPokemonV2(namePokemon) {
    
    for (let i = 0; i < obj.results.length; i++) {
        console.log(obj.results[i].name.find(namePokemon));
        return obj.results[i].url;
    }
    return console.log("NO se encontro nada");
}

function findPokemon(namePokemon) {
    
    for (let i = 0; i < obj.results.length; i++) {
        if (namePokemon == obj.results[i].name) {
            console.log("Se encontro a " + obj.results[i].name);  
            return obj.results[i].url;
        }   
    }
    return console.log("NO se encontro nada");
}

let urlBuscada = findPokemonV2("static");
console.log(urlBuscada);

