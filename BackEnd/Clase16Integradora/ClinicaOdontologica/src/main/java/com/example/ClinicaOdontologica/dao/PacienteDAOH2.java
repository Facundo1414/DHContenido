package com.example.ClinicaOdontologica.dao;

import com.example.ClinicaOdontologica.model.Domicilio;
import com.example.ClinicaOdontologica.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAOH2 implements iDao<Paciente>{
    private static final Logger logger= Logger.getLogger(PacienteDAOH2.class);
    private static  final String SQL_INSERT="INSERT INTO PACIENTES ( APELLIDO,NOMBRE, EMAIL, DNI, FECHA_INGRESO, DOMICILIO_ID) VALUES(?,?,?,?,?,?)";
    private static final String SQL_SELECT_ALL="SELECT * FROM PACIENTES";
    private static final String SQL_SELECT_BY_EMAIL="SELECT * FROM PACIENTES WHERE EMAIL=?";
    private static final String SQL_SELECT_BY="SELECT * FROM PACIENTES WHERE ID=?";
    private static final String SQL_DROP_BY = "DROP @ FROM PACIENTES WHERE ID=?";
    @Override
    public Paciente guardar(Paciente paciente) {
        logger.info("guardando paciente");
        Connection connection= null;
        try{
            connection= BD.getConnection(); //obtengo la conexion
            DomicilioDAOH2 daoAux= new DomicilioDAOH2(); //creo una instancia de dao domicilio para devolver un objeto domicilio
            Domicilio domicilio= daoAux.guardar(paciente.getDomicilio());
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            // seteo los datos
            psInsert.setString(1, paciente.getApellido());
            psInsert.setString(2, paciente.getNombre());
            psInsert.setString(3, paciente.getEmail());
            psInsert.setString(4,paciente.getDni());
            psInsert.setDate(5, Date.valueOf(paciente.getFechaIngreso()));
            psInsert.setInt(6,domicilio.getId());
            psInsert.execute(); //en teoria si hay claves se generan

            ResultSet clave= psInsert.getGeneratedKeys();
            while (clave.next()){
                paciente.setId(clave.getInt(1));
            }
            logger.info(" paciente guardado");


        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        logger.info("iniciando las operaciones de : buscado por id "+id);
        Connection connection= null;
        Paciente paciente=null;
        Domicilio domicilio=null;
        try{
            connection= BD.getConnection();
            PreparedStatement psSelectOne= connection.prepareStatement(SQL_SELECT_BY);
            psSelectOne.setInt(1,id);
            ResultSet rs= psSelectOne.executeQuery();
            DomicilioDAOH2 daoAux= new DomicilioDAOH2();
            while (rs.next()){
                domicilio= daoAux.buscar(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getDate(6).toLocalDate(),domicilio);

            }

        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }
        return paciente;
    }

    //TODO
    @Override
    public void eliminar(Integer id) {
        logger.info("iniciando las operaciones de Eliminar: ");
        Connection connection= null;
        Paciente paciente=null;
        Domicilio domicilio=null;
        try{
            connection= BD.getConnection();
            PreparedStatement psSelectOne= connection.prepareStatement(SQL_SELECT_BY);
            psSelectOne.setInt(1,id);
            ResultSet rs= psSelectOne.executeQuery();
            DomicilioDAOH2 daoAux= new DomicilioDAOH2();
            while (rs.next()){
                domicilio= daoAux.buscar(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getDate(6).toLocalDate(),domicilio);

            }

        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }

    }

    //TODO
    @Override
    public void actualizar(Paciente paciente) {
        logger.info("iniciando las operaciones de : ");
        Connection connection= null;
        try{

        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }

    }

    @Override
    public List<Paciente> buscarTodos() {
        logger.info("iniciando las operaciones de : listado de un paciente ");
        Connection connection= null;
        List<Paciente> pacientes= new ArrayList<>();
        Paciente paciente=null;
        Domicilio domicilio=null;
        try{

            connection= BD.getConnection();
            Statement statement= connection.createStatement();
           ResultSet rs= statement.executeQuery(SQL_SELECT_ALL);
           DomicilioDAOH2 daoAux= new DomicilioDAOH2();
           while(rs.next()){
               domicilio= daoAux.buscar(rs.getInt(6));
               paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6).toLocalDate(),domicilio);
               pacientes.add(paciente);
           }



        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }
        return pacientes;
    }

    public Paciente buscarPacientePorMail(String mail){
        logger.info("iniciando las operaciones de : buscado por mail "+mail);
        Connection connection= null;
        Paciente paciente=null;
        Domicilio domicilio=null;
        try{
            connection= BD.getConnection();
            PreparedStatement psSelectOne= connection.prepareStatement(SQL_SELECT_BY_EMAIL);
            psSelectOne.setString(1,mail);
            ResultSet rs= psSelectOne.executeQuery();
            DomicilioDAOH2 daoAux= new DomicilioDAOH2();
            while (rs.next()){
                domicilio= daoAux.buscar(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6).toLocalDate(),domicilio);
            }

        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }
        return paciente;
    }
}
