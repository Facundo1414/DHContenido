public class Main {

    public static class Mascota{
        // variables
        String animalTipo;
        String nombre;
        int edad;
        double cuantoCome;
        String extra;
        // metodos
        public void setAnimalTipo(String animalTipo) {
            this.animalTipo = animalTipo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setCuantoCome(double cuantoCome) {
            this.cuantoCome = cuantoCome;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }

        public void mostrarDatos(){
            System.out.println(nombre + " Tiene "+ edad + " anios");
            System.out.println(nombre + " come " + cuantoCome + " kg " + extra);
        }

    }

    public static void main(String[] args) {
        //
        Mascota mascota1 = new Mascota();
        mascota1.setAnimalTipo("Perro");
        mascota1.setNombre("Manchitas");
        mascota1.setEdad(2);
        mascota1.setCuantoCome(1.5);
        mascota1.setExtra("hace guau guau");
        mascota1.mostrarDatos();
        //
        Mascota mascota2 = new Mascota();
        mascota2.setAnimalTipo("Pez");
        mascota2.setNombre("Nemo");
        mascota2.setEdad(1);
        mascota2.setCuantoCome(0.140);
        mascota2.setExtra("hacen glup glup");
        mascota2.mostrarDatos();
        //
        Mascota mascota3 = new Mascota();
        mascota3.setAnimalTipo("Gato");
        mascota3.setNombre("Silvestre");
        mascota3.setEdad(3);
        mascota3.setCuantoCome(0.5);
        mascota3.setExtra("hace miau miau");
        mascota3.mostrarDatos();
        //
        Mascota mascota4 = new Mascota();
        mascota4.setAnimalTipo("Tortuga");
        mascota4.setNombre("Manuelita");
        mascota4.setEdad(12);
        mascota4.setCuantoCome(0.3);
        mascota4.setExtra("segun la cancion vivia en pehuajo");
        mascota4.mostrarDatos();
        //
        Mascota mascota5 = new Mascota();
        mascota5.setAnimalTipo("Pajarito");
        mascota5.setNombre("Gardel");
        mascota5.setEdad(1);
        mascota5.setCuantoCome(0.350);
        mascota5.setExtra("hace pio pio pio");
        mascota5.mostrarDatos();
    }
}