
package org.example.dao;
import org.example.config.ConexaoDB;
import org.example.model.AtributosEstruturaLente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtributosEstruturaLenteDAO extends ConexaoDB {

    private static final String INSERT_ATRIBUTO_ESTRUTURA_LENTE_SQL = "INSERT INTO atributos_estrutura_lente (descricao, lado_olho) VALUES (?, ?);";
    private static final String SELECT_ATRIBUTO_ESTRUTURA_LENTE_BY_ID = "SELECT id, descricao, lado_olho FROM atributos_estrutura_lente WHERE id = ?";
    private static final String SELECT_ALL_ATRIBUTO_ESTRUTURA_LENTE = "SELECT * FROM atributos_estrutura_lente;";
    private static final String DELETE_ATRIBUTO_ESTRUTURA_LENTE_SQL = "DELETE FROM atributos_estrutura_lente WHERE id = ?;";
    private static final String UPDATE_ATRIBUTO_ESTRUTURA_LENTE_SQL = "UPDATE atributos_estrutura_lente SET descricao = ?, lado_olho = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM atributos_estrutura_lente ;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepareSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertAtributoEstruturaLente(AtributosEstruturaLente entidade) {
        try (PreparedStatement preparedStatement = prepareSQL(INSERT_ATRIBUTO_ESTRUTURA_LENTE_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setString(2, entidade.getLadoOlho());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public AtributosEstruturaLente selectAtributoEstruturaLente(int id) {
        AtributosEstruturaLente entidade = null;
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ATRIBUTO_ESTRUTURA_LENTE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                String ladoOlho = rs.getString("lado_olho");
                entidade = new AtributosEstruturaLente(id, descricao, ladoOlho);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<AtributosEstruturaLente> selectAllAtributoEstruturaLente() {
        List<AtributosEstruturaLente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ALL_ATRIBUTO_ESTRUTURA_LENTE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String ladoOlho = rs.getString("lado_olho");
                entidades.add(new AtributosEstruturaLente(id, descricao, ladoOlho));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteAtributoEstruturaLente(int id) throws SQLException {
        try (PreparedStatement statement = prepareSQL(DELETE_ATRIBUTO_ESTRUTURA_LENTE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateAtributoEstruturaLente(AtributosEstruturaLente entidade) throws SQLException {
        try (PreparedStatement statement = prepareSQL(UPDATE_ATRIBUTO_ESTRUTURA_LENTE_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setString(2, entidade.getLadoOlho());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
