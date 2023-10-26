const {provincias,sumar} = require('../probando')

/* test("aaa", function () {
    excpect(provincias()).toHaveLength(3);
}) */

test("suma",function (a,b) {
    excpect(sumar(1,1)).toBe(2)
})