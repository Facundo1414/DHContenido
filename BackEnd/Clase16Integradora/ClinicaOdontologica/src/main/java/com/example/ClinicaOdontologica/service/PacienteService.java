package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.dao.PacienteDAOH2;
import com.example.ClinicaOdontologica.dao.iDao;
import com.example.ClinicaOdontologica.model.Paciente;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    private iDao<Paciente> pacienteiDao;

    public PacienteService() {
        pacienteiDao= new PacienteDAOH2();
    }

    //se generan manuales los metodos
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteiDao.guardar(paciente);
    }
    public Paciente buscarPorId(Integer id){
        return pacienteiDao.buscar(id);
    }
    public void actualizarPaciente(Paciente paciente){
        pacienteiDao.actualizar(paciente);
    }
    public void eliminarPaciente(Integer id){
        pacienteiDao.eliminar(id);
    }
    public Paciente buscarPacientePorMail(String mail){
        return ((PacienteDAOH2) pacienteiDao).buscarPacientePorMail(mail);
    }



}
