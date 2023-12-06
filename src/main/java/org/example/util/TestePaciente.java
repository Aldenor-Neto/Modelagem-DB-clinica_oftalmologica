package org.example.util;

import org.example.dao.PacienteDAO;
import org.example.model.Paciente;

import java.sql.SQLException;
import java.util.List;

public class TestePaciente {

    static PacienteDAO pacienteDao = new PacienteDAO();

    public static void main(String[] args) throws SQLException {

        Paciente paciente = new Paciente(1, "Francisco de Lima", "17", java.sql.Date.valueOf("1987-01-30"));
        pacienteDao.insertPaciente(paciente);
        paciente = pacienteDao.selectPaciente(7);
        System.out.println(paciente);

        //paciente.setNome("Pedro Cardoso");
        //paciente.setCpf("00011100011");
        //pacienteDao.updatePaciente(paciente);
        //paciente = pacienteDao.selectPaciente(1);
        //System.out.println(paciente);

        List<Paciente> listPacientes = pacienteDao.selectAllPaciente();
        //listPacientes.forEach(System.out::println);

        //pacienteDao.deletePaciente(3);
        //listPacientes = pacienteDao.selectAllPaciente();
        listPacientes.forEach(System.out::println);

    }
}
