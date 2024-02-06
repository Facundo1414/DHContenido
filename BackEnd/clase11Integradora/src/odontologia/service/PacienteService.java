package odontologia.service;

import odontologia.dao.idao;

public class PacienteService {
    private idao daoestrategia;

    public PacienteService(idao daoestrategia) {
        this.daoestrategia = daoestrategia;
    }

    public void guardar(Object o) {
        daoestrategia.guardar(o);
    }
    public Object buscar(Long id) {
        return daoestrategia.buscar(id);
    }
    public void buscarTodos(){
        daoestrategia.buscarTodos();
    }

    public void eliminar(Long id) {
        daoestrategia.eliminar(id);
    }



}
