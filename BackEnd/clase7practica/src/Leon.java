import java.util.logging.Logger;

public class Leon {
    private String nombre;
    private int edad;
    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;
    }

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Leon.class);

    public void esMayorA10(){
        if (edad < 10 ){
            logger.info("Chequeando si es mayor a 10");
            Exception exception = new Exception();
            logger.error("Error la edad es menor a 10", exception);
        }
    }


    public void run(){

        try {



        }catch (Exception e){

        };

    }

}
