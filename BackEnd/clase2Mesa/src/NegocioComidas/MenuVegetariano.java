package NegocioComidas;

public class MenuVegetariano extends Menu {
    // ● Menú vegetariano: 1% adicional por especias y 2 pesos por cada salsa vegetariana.


    public MenuVegetariano(double precioBase) {
        super(precioBase + (precioBase / 100) + 2,"MenuVegetariano");
    }

}

