import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguraTest {

    @Test
    public void calculadora(){
        Circulo circulo = new Circulo(-20);

        Assertions.assertNull(circulo.calcularAreaCirculo());
    }

}

