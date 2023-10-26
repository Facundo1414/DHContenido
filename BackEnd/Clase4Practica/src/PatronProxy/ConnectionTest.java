package PatronProxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ConnectionTest {

    @Test

    void conectarseAlProxy(){

        List<String> permitidos = new ArrayList<>();
        permitidos.add("Jose@gmail.com");

        DConnection proxy = new DriveProxy(permitidos);

        Documento doc = proxy.solicitarDocumento("jose@gmail.com","doc1.com");
        Assertions.assertEquals(doc.getId() ,1);

    }
}
