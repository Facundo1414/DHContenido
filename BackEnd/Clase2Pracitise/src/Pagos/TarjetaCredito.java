package Pagos;

public class TarjetaCredito extends Tarjeta{
    private double campoLimite;
    private double saldoUtilizado;

    public TarjetaCredito(String numerosDeFrente, String codigoDeSeguridad, int fechaExpiracion, double campoLimite, double saldoUtilizado) {
        super(numerosDeFrente, codigoDeSeguridad, fechaExpiracion);
        this.campoLimite = campoLimite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public void procesarCredito(double montoACreditar){

        if (chequearFechaExpiracion(this.getFechaExpiracion())){

            if (campoLimite >= montoACreditar + saldoUtilizado){
                saldoUtilizado -= montoACreditar;
                System.out.println("PAGO REALIZADO CON EXITO - SALDO UTILIZADO = $ "+ saldoUtilizado);
            }
            else {
                System.out.println("El pago no se puede realizar : Limite excedido");
            }
        }
        else {
            System.out.println("Tarjeta Expirada");
        }

    }


}
