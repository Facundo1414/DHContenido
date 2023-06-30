// https://playground.digitalhouse.com/course/d173572f-ad08-452c-ae00-787068d8e3d8/unit/70ee35ac-7f86-4919-9698-954cb9e3abf7/lesson/f17b01c1-bf4b-4481-914a-1390ad7907f0/topic/6cb2358a-1d86-40d6-8e30-389ad1874434

// actividad arriba

const binarySearch = (array, item) => {
	// punto mas bajo
	let low = 0;
	// punto mas alto
	let high = list.length - 1;

	// mientras que low sea menor o igual que high
	while (low <= high) {
		// encontramos la mitad entre low y high
		const mid = Math.floor((low + high) / 2);
		console.log("a ",mid);

		// adivinar si el valor es el de la mitad
		const guess = array[mid];
		console.log("b ",guess);
		// si es asi, retornar esa posiciona
		if (guess === item) {
			return mid;
		}
		// si lo propuesto es mayor que lo
		// que estamos buscando
		if (guess > item) {
			//
			high = mid - 1;
		} else {
			low = mid + 1;
		}
	}

	return null; // si no encontramos nada
};

let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let buscar = 5;
console.log(binarySearch(list, buscar));



function busquedaBinaria(array, item) {
	let high = array.length - 1
	let low = 0

	while (low<=high) {
		const mitad = Math.floor((low + high) / 2)
		const guess = list[mitad];
		if (guess === item) {
			return mitad			
		}
		if (guess > item) {
			high = mitad - 1;
		} else {
			low = mitad + 1;
		}
	}
	return null
}
/* 
console.log('Posicion: ',busquedaBinaria(list, buscar)); */