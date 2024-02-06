package com.c2.ClinicaOdontologica.service;

import com.c2.ClinicaOdontologica.dao.OdontologoDAOH2;
import com.c2.ClinicaOdontologica.dao.iDao;
import com.c2.ClinicaOdontologica.model.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;//relacion de asociacion

    public OdontologoService(){
        odontologoiDao= new OdontologoDAOH2();
    }
    //metodos manuales
    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }
    public Odontologo buscarPorID(Integer id){
        return odontologoiDao.buscar(id);
    }
    public Odontologo buscarPorMatricula(String matricula){
        return odontologoiDao.buscarPorString(matricula);
    }
    public void actualizarOdontologo(Odontologo odontologo){
        odontologoiDao.actualizar(odontologo);
    }
    public List<Odontologo> listarOdontologos(){
        return odontologoiDao.buscarTodos();
    }
    public void eliminarOdontologo(Integer id){
        odontologoiDao.eliminar(id);
    }

}
