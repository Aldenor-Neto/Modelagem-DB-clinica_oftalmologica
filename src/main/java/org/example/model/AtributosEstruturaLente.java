package org.example.model;

public class AtributosEstruturaLente extends GenericModel {

    private String descricao;
    private String ladoOlho;

    public AtributosEstruturaLente(Integer id, String descricao, String ladoOlho) {
        super(id);
        this.descricao = descricao;
        this.ladoOlho = ladoOlho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLadoOlho() {
        return ladoOlho;
    }

    public void setLadoOlho(String ladoOlho) {
        this.ladoOlho = ladoOlho;
    }

    @Override
    public String toString() {
        return "AtributosEstruturaLente{" +
                "descricao='" + descricao + '\'' +
                ", ladoOlho='" + ladoOlho + '\'' +
                '}';
    }
}
