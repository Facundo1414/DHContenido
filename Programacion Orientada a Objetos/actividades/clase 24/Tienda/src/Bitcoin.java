public class Bitcoin implements StrategyPago {
    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;
    }

    public void pago() {
        System.out.println("pagado con bitcoin");
        System.out.println(billetera);;
    }
}
