const {Builder, Capabilities, By} = require("selenium-webdriver");
const chromeCapabilities = Capabilities.chrome();
const assert = require('assert');
const { log } = require("console");



async function TC_001() {
    //instanceamos el driver
    chromeCapabilities.set('chromeOptions', {args: ['--headless']});
    let driver = await new Builder().forBrowser('chrome').withCapabilities(chromeCapabilities).build();
    
    // ahora interactuamos con el driver
    await driver.get("http://resto-app.ctd.academy:3000/admin/dashboard/");
    await driver.manage().window().maximize();
    

    console.log("END OF TC_001");
    await driver.quit;
}

/* TC_001(); */

async function TC_002(){
    //instanceamos el driver
    chromeCapabilities.set('chromeOptions', {args: ['--headless']});
    let driver = await new Builder().forBrowser('chrome').withCapabilities(chromeCapabilities).build();

    // ahora interactuamos con el driver
    await driver.get("http://resto-app.ctd.academy:3000");
    await driver.manage().window().maximize();

    //interactuamos
    await driver.findElement(By.id('inputEmail')).sendKeys('userTest@gmail.com');
    await driver.findElement(By.id('inputPassword')).sendKeys('userTest');
    await driver.findElement(By.xpath("//button[@id='loginBtn']")).click(); 
    await driver.sleep(2000);

    // ahora compararemos los resultados esperados
/*     let buttonTextToCompare = await driver.findElement(By.id("createProduct")).getText()
    assert.strictEqual(buttonTextToCompare, "Crear Producto"); */
    let currentPage = await driver.getCurrentUrl();
    assert.equal(currentPage, 'http://resto-app.ctd.academy:3000/admin/dashboard/');

    
    console.log("END OF TC_002");
    await driver.quit;
}


TC_002() 

