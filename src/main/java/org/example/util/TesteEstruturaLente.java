package org.example.util;

import org.example.dao.EstruturaLenteDAO;
import org.example.model.EstruturaLente;

import java.sql.SQLException;
import java.util.List;

public class TesteEstruturaLente {

    static EstruturaLenteDAO estruturaLenteDao = new EstruturaLenteDAO();

    public static void main(String[] args) throws SQLException {

        EstruturaLente estruturaLente = new EstruturaLente(1, "estrutura de aço com nylon", 1, 1);
        estruturaLenteDao.insertEstruturaLente(estruturaLente);
        estruturaLente = estruturaLenteDao.selectEstruturaLente(4);
        //estruturaLente.setTipoCorrecao("update estrutura lente");
        //estruturaLenteDao.updateEstruturaLente(estruturaLente);
        //estruturaLente = estruturaLenteDao.selectEstruturaLente(2);
        //System.out.println(estruturaLente);

        List<EstruturaLente> listEstruturaLente = estruturaLenteDao.selectAllEstruturaLente();
        listEstruturaLente.forEach(System.out::println);

//        estruturaLenteDao.deleteEstruturaLente(3);

//        listEstruturaLente = estruturaLenteDao.selectAllEstruturaLente();
//        listEstruturaLente.forEach(System.out::println);

    }
}
