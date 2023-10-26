public class Paypal implements StrategyPago {
    private String email;

    public Paypal(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    private String clave;

    public void pago() {
        System.out.println("pagado con paypal");
        System.out.println(email);
        System.out.println(clave);
    }
}

