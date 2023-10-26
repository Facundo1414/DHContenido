package empresaDigital;

public class Afiliado extends Vendedor{
    public Afiliado(String nombre) {
        super(nombre);
    }
    @Override
    protected void calcularPuntos() {
        this.setPuntos(10 * getVentas());
    }


}
