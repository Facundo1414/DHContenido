const { Builder } = require('selenium-webdriver');
const chrome = require('selenium-webdriver/chrome');

// Set the user token
const userToken = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InVzZXJUZXN0QGdtYWlsLmNvbSIsImlkIjoxNjcsInJvbGUiOiJhZG1pbiIsImlhdCI6MTY4ODAxNDc0Mn0.pRVWu7AU3T0BqpW9btjGtF4RpnZyBBALwgMLOsWLTj8';

// Create Chrome options
const options = new chrome.Options();
options.addArguments(`--user-token=${userToken}`);

// Create the WebDriver instance with the desired options
const driver = new Builder()
  .forBrowser('chrome')
  .setChromeOptions(options)
  .build();

// Use the driver to automate your web application
// ...

driver.get("http://resto-app.ctd.academy:3000/");
driver.manage().window().maximize();