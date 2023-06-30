package Estados;
import java.util.ArrayList;

public class Carrito {
    private Estado estado;
    private ArrayList<Producto> productos;


    //
    public Carrito() {
        this.estado = new Vacio(this);
        productos = new ArrayList<>();
    }
    //                                     metodos
    public void addProdcutoAlArray(Producto producto){
        productos.add(producto);
    }

    public void addProdcuto(Producto producto){
        getEstado().addProducto(producto);
    }
    //
    public void vaciarList(){
        productos = new ArrayList<>();
    }
    public void cancelarCarrito(){
        getEstado().cancelarCarrito();
    }
    //
    public void volverAlPuntoAnterior(){
        getEstado().volverAlPuntoAnterior();
    }

    public void pasarAlSiguienteEstado(){
        getEstado().pasarAlSiguienteEstado();
    }

    // getters & setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public void mostrarProductos(){
        if (productos.size()== 0){
            System.out.println("Carrito VACIO");
        }
        for (Producto p :productos) {
            System.out.println(p);
        }
    }


}
