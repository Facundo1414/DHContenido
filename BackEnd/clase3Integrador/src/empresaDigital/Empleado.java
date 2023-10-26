package empresaDigital;

public class Empleado extends Vendedor{
    private int nuevosAfiliados;
    private int antiguedad;


    public Empleado(String nombre,int antiguedad) {
        super(nombre);
        nuevosAfiliados = 0;
        this.antiguedad = antiguedad;
    }


    public void conseguirAfiliado(){
        nuevosAfiliados ++;
    }

    @Override
    protected void calcularPuntos() {
        int total = 0;
        total += getVentas() * 5;
        total += antiguedad * 5;
        total += nuevosAfiliados * 10;
        this.setPuntos(total);
    }

}
