public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }
    public String calcularAreaCirculo(){
        if (radio > 0){
            double resultado = Math.PI * (radio * radio);
            return "El calculo del Circulo es de " + radio ;
        }
        return null;
    }

}
