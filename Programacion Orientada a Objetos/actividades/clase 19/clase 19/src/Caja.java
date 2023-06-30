public class Caja extends Producto{
    private double longitud;
    private double ancho;
    private double altura;

    public Caja(double peso, double longitud, double ancho, double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return longitud * ancho * altura;
    }
}
