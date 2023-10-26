public class Tarjeta implements StrategyPago {
    private String titular;
    private String numero;
    private String verificador;
    private String vence;

    public Tarjeta(String titular, String numero, String verificador, String vence) {
        this.titular = titular;
        this.numero = numero;
        this.verificador = verificador;
        this.vence = vence;
    }

    public void pago() {
        System.out.println("pagado con tarjeta");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println(verificador);
        System.out.println(vence);
    }

}
