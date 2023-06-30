import java.util.ArrayList;

public class Vagon implements Figura{
    private ArrayList<Figura> vagon;

    public Vagon() {
        vagon = new ArrayList<>();
    }

    public void createVagon(Figura figura){
        vagon.add(figura);
    }


    @Override
    public double calculoDeSuperficie() {
        double total = 0;
        for (Figura f: vagon) {
            total += f.calculoDeSuperficie();
        }
        return total;
    }
}
