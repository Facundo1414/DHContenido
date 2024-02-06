package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.dao.OdontologoDAOH2;
import com.example.ClinicaOdontologica.dao.iDao;
import com.example.ClinicaOdontologica.model.Odontologo;
import org.springframework.stereotype.Service;

@Service
public class OdontologoService {
    private iDao odontologoIdao ;

    public OdontologoService() {
        this.odontologoIdao = new OdontologoDAOH2();
    }

    public Object buscarPorID(Integer id){
        return odontologoIdao.buscar(id);
    }

    public Odontologo guardar(Odontologo odontologo){
        return (Odontologo) odontologoIdao.guardar(odontologo);
    }

    public void listarOdontologos(){
        odontologoIdao.buscarTodos();
    }

}
