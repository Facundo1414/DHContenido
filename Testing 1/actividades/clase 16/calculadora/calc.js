function suma(a,b) {
    if (isNaN(a) || isNaN(b)) {
        return 0;
    }
    return a + b;
}
module.exports = suma;


/* console.assert(suma(1,2)==3, 'Error: resultado esperado de 1 + 2 es 3') */