const { suma, resta, multiplicacion, division } = require('../calc');


describe("Test de calculadora", function () {        
    describe("Caso Suma", function () {
        test("Suma de 2 numeros", function () {
            const resultado = suma(1,3);
            expect(resultado).toBe(6);
        });
        test("Suma de valores nulos", function () {
            expect(suma(null,null)).toBe(0);     
        });
        test("Suma de letras", function () {
            expect(suma('a','b')).toBe(0);
        });
        test("Suma de valores vacios", function () {
            expect(suma()).toBe(0);
        });
    })


    describe("Caso Resta", function () {
        test("Resta de 2 numeros", function () {
            expect(resta(2,1)).toBe(1); // otra forma de hacerlo
        });
    })
    describe("Caso Multiplicacion", function () {
        test("Multiplicacion de 2 numeros", function () {
            expect(multiplicacion(4,2)).toBe(8);
        });
    })
    
    describe("Caso Division", function (prams) {
        test("Division de 2 numeros", function () {
            expect(division(4,2)).toBe(2);
        });
    })
    
})    
