package estados;

public class Rojo implements Estado {
    private Semaforo semaforo;

    public Rojo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("ROJO");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Verde(semaforo));
    }
}
