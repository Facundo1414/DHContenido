public class Cuenta implements Comparable<Cuenta>{
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return numeroCuenta - o.numeroCuenta;
    }
}
