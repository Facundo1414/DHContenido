public class Rectangulo implements Figura{
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }


    @Override
    public double calculoDeSuperficie() {
        return alto * largo;
    }
}
