package org.example.model;

public class ObservacaoLaudo extends GenericModel {

    private String descricao;
    private int idReceitaOculos;

    public ObservacaoLaudo(Integer id, String descricao, int idReceitaOculos) {
        super(id);
        this.descricao = descricao;
        this.idReceitaOculos = idReceitaOculos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdReceitaOculos() {
        return idReceitaOculos;
    }

    public void setIdReceitaOculos(int idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "ObservacaoLaudo{" +
                "descricao='" + descricao + '\'' +
                ", idReceitaOculos=" + idReceitaOculos +
                '}';
    }
}
