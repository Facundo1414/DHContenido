package Estados;

public interface Estado {
    void addProducto(Producto p);
    void cancelarCarrito();
    void volverAlPuntoAnterior();
    void pasarAlSiguienteEstado();
}
