import java.util.ArrayList;
import java.util.List;

public class App {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(App.class);
    private List<Integer> listEnteros ;

    public App(List<Integer> listEnteros) {
        this.listEnteros = listEnteros;
    }

    public void check(){
        logger.info("Datos de la lista");
        if (listEnteros.size() > 5 && listEnteros.size() < 10){
            logger.info("Mayor a 5 elementos");
        }
        else if (listEnteros.size() > 10){
            logger.info("Mayor a 10 elementos");
        }
        if (listEnteros.size() == 0){
            Exception exception = new Exception();
            logger.error("No hay elementos en la lista",exception);
        }
        else {
            Integer num = 0;
            for (Integer x: listEnteros) {
                num+= x;
            }
            num = num / listEnteros.size();
            logger.info("promedio = "+ num);

        }
    }



}
