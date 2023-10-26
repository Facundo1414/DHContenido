package Pagos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

public class TarjetaTest {
            @Test
    void procesarPago(){
        Tarjeta td1 = new TarjetaDebito("321231213","231123",2025,5000);
        Tarjeta td2 = new TarjetaDebito("222","231123",2012,5000);
        Tarjeta tc1 = new TarjetaCredito("sssda","231123",2025,5000,2000);
        Tarjeta tc2 = new TarjetaCredito("sffs22","231123",2012,5000,0);

        if (td2 instanceof TarjetaDebito){
            TarjetaDebito td2casteo = (TarjetaDebito) td2;
            Assertions.assertFalse(td2casteo.procesarDebito(2000)  );
        }
    }
}
