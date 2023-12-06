package org.example.util;

import org.example.dao.EspecialidadeMedicaDAO;
import org.example.model.EspecialidadeMedica;

import java.sql.SQLException;
import java.util.List;

public class TesteEspecialidadeMedica {

    static EspecialidadeMedicaDAO especialidadeMedicaDao = new EspecialidadeMedicaDAO();

    public static void main(String[] args) throws SQLException {

        EspecialidadeMedica especialidadeMedica = new EspecialidadeMedica(1, "retinoplastia", new java.sql.Date(2023 - 01 - 20), 1, 1);
//especialidadeMedicaDao.insertEspecialidadeMedica(especialidadeMedica);
        especialidadeMedica = especialidadeMedicaDao.selectEspecialidadeMedica(1);
        System.out.println(especialidadeMedica);

        especialidadeMedica.setObservacao("retinoplastia com glaucoma severo");
        especialidadeMedicaDao.updateEspecialidadeMedica(especialidadeMedica);
        especialidadeMedica = especialidadeMedicaDao.selectEspecialidadeMedica(1);
        System.out.println(especialidadeMedica);

        List<EspecialidadeMedica> listEspecialidadeMedica = especialidadeMedicaDao.selectAllEspecialidadeMedica();
        listEspecialidadeMedica.forEach(System.out::println);

        //especialidadeMedicaDao.deleteEspecialidadeMedica(3);
        //listEspecialidadeMedica = especialidadeMedicaDao.selectAllEspecialidadeMedica();
        //listEspecialidadeMedica.forEach(System.out::println);
        System.out.println(especialidadeMedicaDao.count());

    }
}
