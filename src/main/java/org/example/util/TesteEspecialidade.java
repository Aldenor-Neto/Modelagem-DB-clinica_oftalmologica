package org.example.util;

import org.example.dao.EspecialidadeDAO;
import org.example.model.Especialidade;

import java.sql.SQLException;
import java.util.List;

public class TesteEspecialidade {

    static EspecialidadeDAO especialidadeDao = new EspecialidadeDAO();

    public static void main(String[] args) throws SQLException {

        Especialidade especialidade = new Especialidade(1, "clinico", "COCe");

        //especialidadeDao.insertEspecialidade(especialidade);
        especialidade = especialidadeDao.selectEspecialidade(1);
        System.out.println(especialidade);

        especialidade.setConselho("consenho nacional de oftalmologia pediatrica");
        especialidadeDao.updateEspecialidade(especialidade);
        especialidade = especialidadeDao.selectEspecialidade(1);
        System.out.println(especialidade);

        List<Especialidade> listEspecialidades = especialidadeDao.selectAllEspecialidade();
        listEspecialidades.forEach(System.out::println);

        //especialidadeDao.deleteEspecialidade(6);
        listEspecialidades = especialidadeDao.selectAllEspecialidade();
        listEspecialidades.forEach(System.out::println);

    }
}
