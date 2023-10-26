package PatronProxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DownloadServiceTest {

    @Test
    void download(){
        Usuario user = new Usuario("2112","Premium");

        DownloadService downloadService = new DownloadService();

        String response = downloadService.downloadSong(user);
        Assertions.assertEquals("Descargando cancion", response);

    }

    @Test
    void failDownload(){
        Usuario user = new Usuario("2112","Free");

        DownloadService downloadService = new DownloadService();

        String response = downloadService.downloadSong(user);
        Assertions.assertEquals("No se permite descargar canciones a usuarios Free", response);
    }
}
