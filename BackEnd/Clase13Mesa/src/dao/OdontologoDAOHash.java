package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.util.*;


public class OdontologoDAOHash implements iDao<Odontologo>{
    private final HashMap <Integer, Odontologo> odontologoHashMap = new HashMap<>();
    private static final org.apache.log4j.Logger logger = Logger.getLogger(OdontologoDAOHash.class);


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("Guardando en HashMap");
        odontologoHashMap.put(odontologoHashMap.size(),odontologo);
        odontologo.setId(odontologoHashMap.size());

        return odontologo;
    }

    @Override
    public Odontologo buscar(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("Buscando en HashMap");

        List<Odontologo> odontologos = new ArrayList<>();

        for (Map.Entry<Integer, Odontologo> entry : odontologoHashMap.entrySet()) {
            Odontologo odontologo = entry.getValue();

            System.out.println("id = " + odontologo.getId() + " - matricula = " + odontologo.getNumeroMatricula()
                    + " - nombre = " + odontologo.getNombre() + " - apellido = " + odontologo.getApellido());

            odontologos.add(odontologo);
        }

        return odontologos;
    }}
