import estados.Rojo;
import estados.Semaforo;

public class Main {
    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();
        System.out.println(semaforo.getEstado());
        semaforo.cambiarestado();
        System.out.println(semaforo.getEstado());
        semaforo.cambiarestado();
        System.out.println(semaforo.getEstado());
        semaforo.cambiarestado();
        System.out.println(semaforo.getEstado());




    }
}