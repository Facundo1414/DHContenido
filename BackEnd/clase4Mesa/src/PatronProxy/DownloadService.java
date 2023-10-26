package PatronProxy;

public class DownloadService implements SpotifyService{


    @Override
    public String downloadSong(Usuario usuario) {
        if (usuario.getTipoDeUsuario().equalsIgnoreCase("premium")){
            return "Descargando cancion";
        }
        else {
            return "No se permite descargar canciones a usuarios Free";
        }
    }
}
