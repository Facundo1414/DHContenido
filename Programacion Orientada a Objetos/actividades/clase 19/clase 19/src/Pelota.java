public class Pelota extends Producto{
    private double radio;

    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return (4.0/3.0) * Math.PI * (radio*radio*radio); // v = 4/3 π r³
    }
}
