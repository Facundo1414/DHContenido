package service;

import dao.iDao;
import model.Odontologo;

public class OdontologoService {
    private iDao odontologoIdao;

    public OdontologoService(iDao odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return (Odontologo) odontologoIdao.guardar(odontologo);
    }

    public void listarOdontologos(){
        odontologoIdao.buscarTodos();
    }

}
