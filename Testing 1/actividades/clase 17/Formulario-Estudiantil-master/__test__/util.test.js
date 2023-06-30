const {generateText, validateInput} = require('../util');

describe('case generateText', function () {
    test("object", function () {
        let objeto = generateText("Facu",33,1)
        expect(objeto).toBe(`Registro OK de Facu en: 1.`); 
    })
    test("mayor de edad", function () {
        let objeto = generateText("Facu",90,1)
        expect(objeto).toBe(`No pudimos registrar a: Facu. Por favor contactá a soporte@dh.com para más información.`); 
    })
    test("edad invalida", function () {
        let objeto = generateText("Facu",null,1)
        expect(objeto).toBe(`Edad ingresada no válida. Por favor intentá nuevamente.`); 
    })
})


describe("case validateInput", function () {
    test(" ! text", function () {
        expect(validateInput("", true)).toBeFalsy;
    })
    test("notEmpty && text.trim().length === 0", function () {
        expect(validateInput("", true)).toBeFalsy;
    })
    test("notEmpty && text.trim().length === 0", function () {
        expect(validateInput("", false)).toBeFalsy;
    })
    test("notEmpty && text.trim().length === 0", function () {
        expect(validateInput("sda", true)).toBeFalsy;
    })
    test("notEmpty && text.trim().length === 0", function () {
        expect(validateInput("fsasfafsa", false)).toBeFalsy;
    })
    
    test("all is right", function () {
        expect(validateInput("soy un texto", true)).toBeTruthy;
    })
})


/* 
describe('tests negativos', function () {
    test("caso generateText object: null name", function () {
        let objeto = generateText(null,33,1)
        expect(objeto).toBe(`Registro OK de Facu en: 1.`); 
    })




    test("caso generateText object: null level", function () {
        let objeto = generateText("Facu",33,null)
        expect(objeto).toBe(`Registro OK de Facu en: 1.`); 
    })
}) */