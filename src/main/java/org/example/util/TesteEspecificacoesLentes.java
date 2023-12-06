package org.example.util;

import org.example.dao.EspecificacaoLenteDAO;
import org.example.model.EspecificacaoLente;

import java.sql.SQLException;
import java.util.List;

public class TesteEspecificacoesLentes {

    static EspecificacaoLenteDAO especificacaoLenteDao = new EspecificacaoLenteDAO();

    public static void main(String[] args) throws SQLException {

        EspecificacaoLente especificacaoLente = new EspecificacaoLente(1, 2310, 1, 1);
        especificacaoLenteDao.insertEspecificacaoLente(especificacaoLente);
        especificacaoLente = especificacaoLenteDao.selectEspecificacaoLente(6);
        //System.out.println(especificacaoLente);

        //especificacaoLente.setValor(900f);
        //especificacaoLenteDao.updateEspecificacaoLente(especificacaoLente);
        //especificacaoLente = especificacaoLenteDao.selectEspecificacaoLente(4);
        //System.out.println(especificacaoLente);

        List<EspecificacaoLente> listEspecificacoesLente = especificacaoLenteDao.selectAllEspecificacaoLente();
        listEspecificacoesLente.forEach(System.out::println);

        //especificacaoLenteDao.deleteEspecificacaoLente(5);
        //listEspecificacoesLente = especificacaoLenteDao.selectAllEspecificacaoLente();
        //listEspecificacoesLente.forEach(System.out::println);

    }
}
