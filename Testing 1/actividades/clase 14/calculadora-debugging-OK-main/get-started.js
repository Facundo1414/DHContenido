function onClick() {
  if (inputsAreEmpty()) {
    label.textContent = 'Error: Uno o los dos inputs están vacíos.';
    return;
  }
  if (inputsAreNumber()){
    label.textContent = 'Error: Uno o los dos inputs no es un número.';
    return;
  }
  updateLabel();
}
function inputsAreEmpty() {
  if (getNumber1() === '' || getNumber2() === '') {
    return true;
  } else {
    return false;
  }
}

function inputsAreNumber() {
  if (isNaN(parseInt(getNumber1())) || isNaN(parseInt(getNumber2()))) {
    return true;
  } else {
    return false;
  }
}

function updateLabel() {
  var addend1 = getNumber1();
  var addend2 = getNumber2();
  //parseo de variables (así se veia antes --> var sum = addend1 + addend2;)
  var sum = parseInt(addend1) + parseInt(addend2);
  label.textContent = addend1 + ' + ' + addend2 + ' = ' + sum;
}

function getNumber1() {
  return inputs[0].value;
}

function getNumber2() {
  return inputs[1].value;
}

var inputs = document.querySelectorAll('input');
var label = document.querySelector('p');
var button = document.querySelector('button');
button.addEventListener('click', onClick);
