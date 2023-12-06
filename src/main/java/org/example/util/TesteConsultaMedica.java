package org.example.util;

import org.example.dao.ConsultaMedicaDAO;
import org.example.model.ConsultaMedica;

import java.sql.SQLException;
import java.util.List;

public class TesteConsultaMedica {

    static ConsultaMedicaDAO consultaMedicaDao = new ConsultaMedicaDAO();

    public static void main(String[] args) throws SQLException {

        ConsultaMedica consultaMedica = new ConsultaMedica(1, "Fabricia Maria", java.sql.Date.valueOf("1989-04-14"), 1, 1);
        consultaMedicaDao.insertConsultaMedica(consultaMedica);
        consultaMedica = consultaMedicaDao.selectConsultaMedica(5);
        System.out.println(consultaMedica);

        //consultaMedica.setAssinatura("Aldenor");
        //consultaMedicaDao.updateConsultaMedica(consultaMedica);
        //consultaMedica = consultaMedicaDao.selectConsultaMedica(5);
        //System.out.println(consultaMedica);

        List<ConsultaMedica> listaConsultas = consultaMedicaDao.selectAllConsultaMedica();
        listaConsultas.forEach(System.out::println);

        //consultaMedicaDao.deleteConsultaMedica(3);
        //listaConsultas = consultaMedicaDao.selectAllConsultaMedica();
        listaConsultas.forEach(System.out::println);

    }
}
