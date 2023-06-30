package estados;
public class Semaforo {
    private Estado estado;

    public Semaforo() {
        this.estado = new Verde(this);
    }

    public void cambiarestado(){
        estado.cambiarEstado();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
