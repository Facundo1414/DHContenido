package dao;

import model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MedicamentoDAOH2 implements IDao{
    private static final String SQL_INSERT = "INSERT INTO MEDICAMENTOS VALUES (?,?,?,?,?)";

    @Override
    public void guardar(Object o) {
        Connection connection = null;

        try {
            connection = BD.getconnection();
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

        }catch (Exception e){}
    }


}
