package patronFlyweight;

import org.junit.jupiter.api.Test;

public class Testsong {

    @Test
    void crearCancion(){
        final CancionFactory cancionFactory = new CancionFactory();

        Cancion cancion = new Cancion("Baila sola","J balvin","Reg");
        Cancion cancion2 = new Cancion("Baila sola 22","J alvarez","Reg");
        Cancion cancion3 = new Cancion("Baila sola","J balvin","Reg");
        Cancion cancion4 = new Cancion("Salsita","J balvin","Salsa");

        Cancion cancionx = cancionFactory.getCancion(cancion,"Reggeatton2020");
        cancionFactory.getCancion(cancion2,"Reggeatton2020");
        cancionFactory.getCancion(cancion3,"Reggeatton2020");
        cancionFactory.getCancion(cancion4,"Salsa");

        System.out.println(cancionx.getNombre());
    }
}
