package org.example.dao;

import org.example.config.ConexaoDB;
import org.example.model.Especialidade;
import org.example.model.EspecificacaoLente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecificacaoLenteDAO extends ConexaoDB {

    private static final String INSERT_ESPECIFICACAO_LENTE_SQL = "INSERT INTO especificacoes_lente (valor, id_estrutura_lente, id_atributo_estrutura_lente) VALUES (?, ?, ?);";
    private static final String SELECT_ESPECIFICACAO_LENTE_BY_ID = "SELECT id, valor, id_estrutura_lente, id_atributo_estrutura_lente FROM especificacoes_lente WHERE id = ?";
    private static final String SELECT_ALL_ESPECIFICACAO_LENTE = "SELECT * FROM especificacoes_lente;";
    private static final String DELETE_ESPECIFICACAO_LENTE_SQL = "DELETE FROM especificacoes_lente WHERE id = ?;";
    private static final String UPDATE_ESPECIFICACAO_LENTE_SQL = "UPDATE especificacoes_lente SET valor = ?, id_estrutura_lente = ?, id_atributo_estrutura_lente = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM especificacoes_lente ;";

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

    public void insertEspecificacaoLente(EspecificacaoLente entidade) {
        try (PreparedStatement preparedStatement = prepareSQL(INSERT_ESPECIFICACAO_LENTE_SQL)) {
            preparedStatement.setFloat(1, entidade.getValor());
            preparedStatement.setInt(2, entidade.getIdEstruturaLente());
            preparedStatement.setInt(3, entidade.getIdAtributoEstruturaLente());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public EspecificacaoLente selectEspecificacaoLente(int id) {
        EspecificacaoLente entidade = null;
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ESPECIFICACAO_LENTE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                float valor = rs.getFloat("valor");
                int idEstruturaLente = rs.getInt("id_estrutura_lente");
                int idAtributoEstruturaLente = rs.getInt("id_atributo_estrutura_lente");
                entidade = new EspecificacaoLente(id, valor, idEstruturaLente, idAtributoEstruturaLente);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<EspecificacaoLente> selectAllEspecificacaoLente() {
        List<EspecificacaoLente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ALL_ESPECIFICACAO_LENTE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                float valor = rs.getFloat("valor");
                int idEstruturaLente = rs.getInt("id_estrutura_lente");
                int idAtributoEstruturaLente = rs.getInt("id_atributo_estrutura_lente");
                entidades.add(new EspecificacaoLente(id, valor, idEstruturaLente, idAtributoEstruturaLente));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteEspecificacaoLente(int id) throws SQLException {
        try (PreparedStatement statement = prepareSQL(DELETE_ESPECIFICACAO_LENTE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateEspecificacaoLente(EspecificacaoLente entidade) throws SQLException {
        try (PreparedStatement statement = prepareSQL(UPDATE_ESPECIFICACAO_LENTE_SQL)) {
            statement.setFloat(1, entidade.getValor());
            statement.setInt(2, entidade.getIdEstruturaLente());
            statement.setInt(3, entidade.getIdAtributoEstruturaLente());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
