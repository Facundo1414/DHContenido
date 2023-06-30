import java.util.ArrayList;

public class Tren implements Figura{
    private ArrayList<Figura> tren;

    public Tren() {
        tren = new ArrayList<>();
    }

    public void addItem(Figura item){
        tren.add(item);
    }

    public void deleteItem(Figura item){
        tren.remove(item);
    }

    @Override
    public double calculoDeSuperficie() {
        double total = 0;
        for (Figura f: tren) {
            total += f.calculoDeSuperficie();
        }
        return total;
    }
}
