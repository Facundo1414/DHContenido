package empresaDigital;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VenderTest {

    @Test
    void mostrarCategoria(){
        Empleado empleado = new Empleado("Juan",4);
        //
        empleado.vender();
        empleado.vender();
        empleado.conseguirAfiliado();
        //
        String response = empleado.mostrarCategoria();
        Assertions.assertEquals(response,"Juan- nivel de categoria: maestro");
        System.out.println(response);

    }
    @Test
    void mostrarCategoria2(){
        Afiliado afiliado = new Afiliado("Jose");
        //
        afiliado.vender();
        afiliado.vender();
        //
        String response = afiliado.mostrarCategoria();
        Assertions.assertEquals(response,"Jose- nivel de categoria: aprendiz");
        System.out.println(response);
    }
}
