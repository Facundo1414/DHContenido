import java.util.ArrayList;

public class Locomotora implements Figura{
    private ArrayList<Figura> locomotora;

    public Locomotora() {
        locomotora = new ArrayList<>();
    }

    public void createlocomotora(Figura figura){
        locomotora.add(figura);
    }


    @Override
    public double calculoDeSuperficie() {
        double total = 0;
        for (Figura f: locomotora) {
            total += f.calculoDeSuperficie();
        }
        return total;
    }
}
