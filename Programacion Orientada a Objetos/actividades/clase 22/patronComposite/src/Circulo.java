import java.lang.Math;

public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoDeSuperficie() {
        return radio * radio * Math.PI;
    }
}
