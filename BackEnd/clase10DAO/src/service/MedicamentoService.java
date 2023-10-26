package service;

import dao.IDao;
import dao.MedicamentoDAOH2;
import model.Medicamento;

import java.util.ArrayList;

public class MedicamentoService implements IDao {
    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    @Override
    public Medicamento guardar(Object o) {
        return this.medicamentoIDao;
    }


}
