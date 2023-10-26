package controldeCalidad;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CompruebeCalidadTest {

    @Test
    void controlCalidad(){

        CompruebeCalidad compruebeCalidad = new CompruebeCalidad();

        Producto producto = new Producto("Madera",1200,1250,"sano");

        // respose
        String response = compruebeCalidad.validarCalidadDelProdcuto(producto);
        // expected
        String expected = "Producto Aceptado";
        // validate
        Assertions.assertEquals(response,expected);
    }

    @Test
    void controlCalidadRechazado(){

        CompruebeCalidad compruebeCalidad = new CompruebeCalidad();

        Producto producto = new Producto("Madera",1200,1250,"destruido");

        // respose
        String response = compruebeCalidad.validarCalidadDelProdcuto(producto);
        // expected
        String expected = "Producto rechazado";
        // validate
        Assertions.assertEquals(response,expected);
    }
}
