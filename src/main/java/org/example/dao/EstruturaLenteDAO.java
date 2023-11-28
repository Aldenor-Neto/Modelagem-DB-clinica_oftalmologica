package org.example.dao;

import org.example.config.ConexaoDB;
import org.example.model.EstruturaLente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstruturaLenteDAO extends ConexaoDB {

    private static final String INSERT_ESTRUTURA_LENTE_SQL = "INSERT INTO estruturas_lentes (tipo_correcao, distancia_pupilar, id_receita_oculos) VALUES (?, ?, ?);";
    private static final String SELECT_ESTRUTURA_LENTE_BY_ID = "SELECT id, tipo_correcao, distancia_pupilar, id_receita_oculos FROM estruturas_lentes WHERE id = ?";
    private static final String SELECT_ALL_ESTRUTURA_LENTE = "SELECT * FROM estruturas_lentes;";
    private static final String DELETE_ESTRUTURA_LENTE_SQL = "DELETE FROM estruturas_lentes WHERE id = ?;";
    private static final String UPDATE_ESTRUTURA_LENTE_SQL = "UPDATE estruturas_lentes SET tipo_correcao = ?, distancia_pupilar = ?, id_receita_oculos = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM estruturas_lentes ;";

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

    public void insertEstruturaLente(EstruturaLente entidade) {
        try (PreparedStatement preparedStatement = prepareSQL(INSERT_ESTRUTURA_LENTE_SQL)) {
            preparedStatement.setString(1, entidade.getTipoCorrecao());
            preparedStatement.setInt(2, entidade.getDistanciaPupilar());
            preparedStatement.setInt(3, entidade.getIdReceitaOculos());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public EstruturaLente selectEstruturaLente(int id) {
        EstruturaLente entidade = null;
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ESTRUTURA_LENTE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String tipoCorrecao = rs.getString("tipo_correcao");
                int distanciaPupilar = rs.getInt("distancia_pupilar");
                int idReceitaOculos = rs.getInt("id_receita_oculos");
                entidade = new EstruturaLente(id, tipoCorrecao, distanciaPupilar, idReceitaOculos);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<EstruturaLente> selectAllEstruturaLente() {
        List<EstruturaLente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepareSQL(SELECT_ALL_ESTRUTURA_LENTE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String tipoCorrecao = rs.getString("tipo_correcao");
                int distanciaPupilar = rs.getInt("distancia_pupilar");
                int idReceitaOculos = rs.getInt("id_receita_oculos");
                entidades.add(new EstruturaLente(id, tipoCorrecao, distanciaPupilar, idReceitaOculos));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteEstruturaLente(int id) throws SQLException {
        try (PreparedStatement statement = prepareSQL(DELETE_ESTRUTURA_LENTE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateEstruturaLente(EstruturaLente entidade) throws SQLException {
        try (PreparedStatement statement = prepareSQL(UPDATE_ESTRUTURA_LENTE_SQL)) {
            statement.setString(1, entidade.getTipoCorrecao());
            statement.setInt(2, entidade.getDistanciaPupilar());
            statement.setInt(3, entidade.getIdReceitaOculos());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
