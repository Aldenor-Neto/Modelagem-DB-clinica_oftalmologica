package org.example.util;

import org.example.dao.MedicoDAO;
import org.example.model.Medico;

import java.sql.SQLException;
import java.util.List;

public class TesteMedico {

    static MedicoDAO medicoDao = new MedicoDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println(medicoDao.count());

        Medico medico = new Medico(3, "Fabrícia", "05");
        //medicoDao.insertMedico(medico);

        medico = medicoDao.selectMedico(1);
        System.out.println(medico);

        medico.setNome("Aldenor Neto");
        medicoDao.updateMedico(medico);
        medico = medicoDao.selectMedico(1);
        System.out.println(medico);

        List<Medico> medicos = medicoDao.selectAllMedico();
        medicos.forEach(System.out::println);

        //medicoDao.deleteMedico(5);
        medicos.forEach(System.out::println);

    }
}
