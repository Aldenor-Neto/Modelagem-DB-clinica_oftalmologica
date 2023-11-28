package org.example.dao;

import org.example.config.ConexaoDB;
import org.example.model.ObservacaoLaudo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObservacaoLaudoDAO extends ConexaoDB {

    private static final String INSERT_OBSERVACAO_LAUDO_SQL = "INSERT INTO observacoes_laudos (descricao, id_receita_oculos) VALUES (?, ?);";
    private static final String SELECT_OBSERVACAO_LAUDO_BY_ID = "SELECT id, descricao, ID_RECEITA_OCULOS FROM observacoes_laudos WHERE id = ?";
    private static final String SELECT_ALL_OBSERVACAO_LAUDO = "SELECT * FROM observacoes_laudos;";
    private static final String DELETE_OBSERVACAO_LAUDO_SQL = "DELETE FROM observacoes_laudos WHERE id = ?;";
    private static final String UPDATE_OBSERVACAO_LAUDO_SQL = "UPDATE observacoes_laudos SET descricao = ?, id_receita_oculos = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM observacoes_laudos ;";

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

    public void insertObservacaoLaudo(ObservacaoLaudo entidade) {
        try (PreparedStatement preparedStatement = prepareSQL(INSERT_OBSERVACAO_LAUDO_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setInt(2, entidade.getIdReceitaOculos());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ObservacaoLaudo selectObservacaoLaudo(int id) {
        ObservacaoLaudo entidade = null;
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_OBSERVACAO_LAUDO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                int idReceitaOculos = rs.getInt("id_receita_oculos");
                entidade = new ObservacaoLaudo(id, descricao, idReceitaOculos);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ObservacaoLaudo> selectAllObservacaoLaudo() {
        List<ObservacaoLaudo> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ALL_OBSERVACAO_LAUDO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                int idReceitaOculos = rs.getInt("id_receita_oculos");
                entidades.add(new ObservacaoLaudo(id, descricao, idReceitaOculos));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteObservacaoLaudo(int id) throws SQLException {
        try (PreparedStatement statement = prepareSQL(DELETE_OBSERVACAO_LAUDO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateObservacaoLaudo(ObservacaoLaudo entidade) throws SQLException {
        try (PreparedStatement statement = prepareSQL(UPDATE_OBSERVACAO_LAUDO_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getIdReceitaOculos());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
