const suma = require('../calc.js');
const p = require('../calc.js');
/* 

describe("Pruebas de sumas", function () {
    test("Suma de 2 numeros", function () {
        expect(suma(1,2)).toBe(3);
    })
    test("Suma de 0", function () {
        expect(suma(0,0)).toBe(0);
    })
    test("Suma de null", function () {
        expect(suma(null,null)).toBe(0);
    })
    test("Suma de texto", function () {
        expect(suma('a','b')).toBe(0);
    })

}) */

test("pp", function () {
    expect(p().toHaveLenght(3))
})