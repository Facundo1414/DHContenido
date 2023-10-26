package PatronProxy;

import java.util.List;

public class DriveProxy implements DConnection{
    private DriveService driveService;
    private List<String> permitidos;

    public DriveProxy(List<String> permitidos) {
        this.driveService = new DriveService();
        this.permitidos = permitidos;
    }

    @Override
    public Documento solicitarDocumento(String mail,String url) {
        if (!permitidos.contains(url)){
            System.out.println("Accediendo");
            return driveService.solicitarDocumento(mail, url);
        }
        else {
            System.out.println("No Estas en la lista de permitidos");
            return null;
        }
    }

}
