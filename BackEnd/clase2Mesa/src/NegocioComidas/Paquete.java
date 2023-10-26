package NegocioComidas;

import java.util.List;

public class Paquete {
    private List<Menu> pedidos;

    public Paquete(List<Menu> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean armarMenu(){
        StringBuilder res = new StringBuilder();
        for (Menu pedido : pedidos) {
            res.append(pedido.getName());
            res.append(" - ");
        }
        System.out.println("ARMAR EL PEDIDO CON: "+  res  + "\nEl total es = $ " + calculoPrecioFinal());
        return true;
    }

    private double calculoPrecioFinal(){
        double total = 0.0;
        for (Menu pedido : pedidos) {
            total += pedido.getPrecio();
        }
        return total;
    }


}
