package Pagos;

public abstract class Tarjeta {
    private String numerosDeFrente;
    private String codigoDeSeguridad;
    private int fechaExpiracion;

    public Tarjeta(String numerosDeFrente, String codigoDeSeguridad, int fechaExpiracion) {
        this.numerosDeFrente = numerosDeFrente;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    protected boolean chequearFechaExpiracion(int fechaExpiracion){
        return fechaExpiracion > 2023;
    }

    public int getFechaExpiracion() {
        return fechaExpiracion;
    }
}
