package Pagos;

public class TarjetaDebito extends Tarjeta{
    private double saldoDisponible;

    public TarjetaDebito(String numerosDeFrente, String codigoDeSeguridad, int fechaExpiracion, double saldoDisponible) {
        super(numerosDeFrente, codigoDeSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public boolean procesarDebito(double montoADebitar){
        if (chequearFechaExpiracion(this.getFechaExpiracion())){
            if (saldoDisponible >= montoADebitar){
                saldoDisponible -= montoADebitar;
                System.out.println("PAGO REALIZADO CON EXITO - SALDO ACTUAL = $ "+ saldoDisponible);
                return true;
            }
            else {
                System.out.println("El pago no se puede realizar : Monto insuficiente");
            }
        }
        else {
            System.out.println("Tarjeta Expirada");
        }
        return false;
    }
}
