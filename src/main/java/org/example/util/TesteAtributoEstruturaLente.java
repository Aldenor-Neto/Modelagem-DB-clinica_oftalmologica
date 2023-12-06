package org.example.util;

import org.example.dao.AtributosEstruturaLenteDAO;
import org.example.model.AtributosEstruturaLente;

import java.sql.SQLException;
import java.util.List;

public class TesteAtributoEstruturaLente {

    static AtributosEstruturaLenteDAO atributoEstruturaLenteDao = new AtributosEstruturaLenteDAO();

    public static void main(String[] args) throws SQLException {

        AtributosEstruturaLente atributoEstruturaLente = new AtributosEstruturaLente(1, "lente de resina", "direito");

        //atributoEstruturaLenteDao.insertAtributoEstruturaLente(atributoEstruturaLente);
        atributoEstruturaLente = atributoEstruturaLenteDao.selectAtributoEstruturaLente(5);
        System.out.println(atributoEstruturaLente);

        atributoEstruturaLente.setDescricao("lente bi-focal com transiction");
        atributoEstruturaLenteDao.updateAtributoEstruturaLente(atributoEstruturaLente);
        atributoEstruturaLente = atributoEstruturaLenteDao.selectAtributoEstruturaLente(5);
        System.out.println(atributoEstruturaLente);

        List<AtributosEstruturaLente> listaAtributos = atributoEstruturaLenteDao.selectAllAtributoEstruturaLente();
        // listaAtributos.forEach(System.out::println);

        //atributoEstruturaLenteDao.deleteAtributoEstruturaLente(6);
        //listaAtributos = atributoEstruturaLenteDao.selectAllAtributoEstruturaLente();
        listaAtributos.forEach(System.out::println);

    }
}
