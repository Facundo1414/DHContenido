package estados;

public class Amarillo implements Estado {
    private Semaforo semaforo;

    public Amarillo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("AMARILLO");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Rojo(semaforo));
    }
}
