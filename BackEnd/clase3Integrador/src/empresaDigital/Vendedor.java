package empresaDigital;

public abstract class Vendedor {
    private String nombre;
    private int puntos;
    private int ventas;
    private Categoria categoria;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.ventas = 0;
        categoria = new Categoria();
        categoria.setTipo("novato");
    }

    public void vender() {
        ventas++;
    }

    public String mostrarCategoria(){
        calcularPuntos();
        recategorizar();
        return nombre + "- nivel de categoria: "+categoria.getTipo();
    }

    protected abstract void calcularPuntos();


    private void recategorizar(){
        if (puntos >= 20 && puntos <= 30){
            categoria.setTipo("aprendiz");
        } else if (puntos >= 31 && puntos < 40) {
            categoria.setTipo("bueno");
        } else if (puntos >= 40) {
            categoria.setTipo("maestro");
        }
    }

//
    protected void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    protected int getVentas() {
        return ventas;
    }

    public int getPuntos() {
        return puntos;
    }
}
