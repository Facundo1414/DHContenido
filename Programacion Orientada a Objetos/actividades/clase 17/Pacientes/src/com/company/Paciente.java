package com.company;

import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private String historiaClinica;
    private Date fechaInternacion;
    private Date fechaAlta;

    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException{
        Date hoy = new Date();
        System.out.println(hoy);
        if (fechaInternacion.after(hoy)){
            throw  new PacienteException("La fecha no puede ser posterior al dia de Hoy" );
        }
        else this.fechaInternacion = fechaInternacion;
        this.nombre=nombre;
        this.apellido=apellido;
        this.historiaClinica=historiaClinica;
        fechaAlta=null;
    }
    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException
    {
        if ((fechaAlta.after((fechaInternacion)))) {
                throw new PacienteException("VALORES INVALIDOS");
//            throw new PacienteException("No se puede dar de alta al paciente por error en la fecha");
        }
        else this.fechaAlta = fechaAlta;
    }



}
