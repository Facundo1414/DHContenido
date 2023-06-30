package Articulos;

import Estados.Presupuesto;
import Estados.State;

public class Articulo {
    private String nombreDeArticulo;
    private Double valorDePresupuesto;
    private String direccionDeEntrega;
    private State estado;

    public Articulo(String nombreDeArticulo) {
        this.nombreDeArticulo = nombreDeArticulo;
        this.valorDePresupuesto = 0.0;
        estado = new Presupuesto(this);
    }

    public void cambiarDireccion() throws Exception {
        estado.cambiarDireccion();
    }

    public void darValorDePresupuesto() throws Exception {
        estado.darValorDePresupuesto();
    }

    public void agregarRepuestos() throws Exception {
        estado.agregarRepuestos();
    }

    public void pasarAlSiguientePaso(){
        System.out.println(toString());
        estado.pasarAlSiguientePaso();
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombreDeArticulo='" + nombreDeArticulo + '\'' +
                ", valorDePresupuesto=" + valorDePresupuesto +
                ", direccionDeEntrega='" + direccionDeEntrega + '\'' +
                ", estado=" + estado +
                '}';
    }

    public Double getValorDePresupuesto() {
        return valorDePresupuesto;
    }

    public void setValorDePresupuesto(Double valorDePresupuesto) {
        this.valorDePresupuesto = valorDePresupuesto;
    }

    public String getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public void setDireccionDeEntrega(String direccionDeEntrega) {
        this.direccionDeEntrega = direccionDeEntrega;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
}
