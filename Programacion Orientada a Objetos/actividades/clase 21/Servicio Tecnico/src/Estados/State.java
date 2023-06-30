package Estados;

public interface State {
    public void cambiarDireccion() throws Exception;

    public void darValorDePresupuesto() throws Exception;

    public void agregarRepuestos() throws Exception;

    public void pasarAlSiguientePaso();
}
