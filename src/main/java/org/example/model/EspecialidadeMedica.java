package org.example.model;

import java.sql.Date;

public class EspecialidadeMedica extends  GenericModel{

    private  String observacao;
    private  java.sql.Date dtConclusao;
    private int idEspecialidade;
    private  int idMedico;

    public EspecialidadeMedica(Integer id, String observacao, java.sql.Date dtConclusao, int idEspecialidade, int idMedico) {
        super(id);
        this.observacao = observacao;
        this.dtConclusao = dtConclusao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDtConclusao() {
        return dtConclusao;
    }

    public void setDtConclusao(Date dtConclusao) {
        this.dtConclusao = dtConclusao;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "EspecialidadeMedica{" +
                "observacao='" + observacao + '\'' +
                ", dtConclusao=" + dtConclusao +
                ", idEspecialidade=" + idEspecialidade +
                ", idMedico=" + idMedico +
                '}';
    }
}
