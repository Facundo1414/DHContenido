import java.util.ArrayList;

public class Almacen {
    private ArrayList productos;


    public Almacen() {
        productos = new ArrayList<>();
    }

    public void addProductos(Producto producto){
        productos.add(producto);
    }

    public double calcularEspacioNecesario(){
        return 0.0;
    }
}
