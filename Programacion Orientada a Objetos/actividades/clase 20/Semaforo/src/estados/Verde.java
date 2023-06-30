package estados;

import estados.Amarillo;

public class Verde implements Estado {
    private Semaforo semaforo ;

    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }


    @Override
    public void mostrarAviso() {
        System.out.println("VERDE");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Amarillo(semaforo));
    }
}
