package org.example.util;

import org.example.dao.ObservacaoLaudoDAO;
import org.example.model.ObservacaoLaudo;

import java.sql.SQLException;
import java.util.List;

public class TesteObservacaoLaudo {

    static ObservacaoLaudoDAO observacaoLaudoDao = new ObservacaoLaudoDAO();

    public static void main(String[] args) throws SQLException {

        ObservacaoLaudo observacaoLaudo = new ObservacaoLaudo(1, "nova observação", 1);
        //observacaoLaudoDao.insertObservacaoLaudo(observacaoLaudo);
        observacaoLaudo = observacaoLaudoDao.selectObservacaoLaudo(4);
//        System.out.println(observacaoLaudo);

        observacaoLaudo.setDescricao("atualizando  a observação");
        observacaoLaudoDao.updateObservacaoLaudo(observacaoLaudo);

        List<ObservacaoLaudo> listObservacoesLaudos = observacaoLaudoDao.selectAllObservacaoLaudo();
        listObservacoesLaudos.forEach(System.out::println);

        //observacaoLaudoDao.deleteObservacaoLaudo(3);
        //listObservacoesLaudos = observacaoLaudoDao.selectAllObservacaoLaudo();
        //listObservacoesLaudos.forEach(System.out::println);

    }
}
