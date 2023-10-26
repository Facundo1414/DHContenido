package PatronProxy;

import java.util.ArrayList;
import java.util.List;

public class DriveService implements DConnection{
    private List<Documento> documentos;

    public DriveService() {
        List usuarios = new ArrayList<>();
        usuarios.add("Jose@gmail.com");
        usuarios.add("Samuel@gmail.com");

        Documento d1 = new Documento(1,"doc1.com","hola",usuarios);
        Documento d2 = new Documento(2,"doc2.com","hola2",usuarios);
        documentos.add(d1);
        documentos.add(d2);
    }


    @Override
    public Documento solicitarDocumento(String mail,String url) {
        return busqueda(url);
    }

    private Documento busqueda(String url){
        for (Documento documento : documentos) {
            if (documento.getUrl().incl(url)){
                return documento;
            }
        }
        return null;
    }
}
