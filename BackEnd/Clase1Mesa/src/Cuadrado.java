public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado( double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    public String calcularAreaCuadrado(){
        if (lado > 0){
        return "El area del Cuadrado es de " + lado * lado;
        }
        return null;
    }

}
