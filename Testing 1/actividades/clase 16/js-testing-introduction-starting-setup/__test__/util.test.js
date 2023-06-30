const { generateText } = require('../util')


test("Salida de nombre y edad", function () {
    const text = generateText("Daniel",30);
    expect(text).toBe("Daniel (30 years old)")
})
