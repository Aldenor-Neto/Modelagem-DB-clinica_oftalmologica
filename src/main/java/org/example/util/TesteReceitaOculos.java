package org.example.util;

import org.example.dao.ReceitaOculosDAO;
import org.example.model.ReceitaOculos;

import java.sql.SQLException;
import java.util.List;

public class TesteReceitaOculos {

    static ReceitaOculosDAO receitaOculosDao = new ReceitaOculosDAO();

    public static void main(String[] args) throws SQLException {

        ReceitaOculos receitaOculos = new ReceitaOculos(1, "detalhamento do oculos de grau", java.sql.Date.valueOf("2023-12-24"), 1);
        receitaOculosDao.insertReceitaOculos(receitaOculos);
        receitaOculos = receitaOculosDao.selectReceitaOculos(4);
        System.out.println(receitaOculos);

        //receitaOculos.setDetalhamento("update no detalhamento do oculos");
        //receitaOculosDao.updateReceitaOculos(receitaOculos);
        //System.out.println(receitaOculos);

        List<ReceitaOculos> listReceitaOculos = receitaOculosDao.selectAllReceitaOculos();
        //listReceitaOculos.forEach(System.out::println);

        //receitaOculosDao.deleteReceitaOculos(3);
        //listReceitaOculos = receitaOculosDao.selectAllReceitaOculos();
        listReceitaOculos.forEach(System.out::println);

    }
}
