package org.example.model;

import java.sql.Date;

public class ReceitaOculos extends GenericModel {

    private String detalhamento;
    private java.sql.Date dtConsulta;
    private int idConsultaMedica;

    public ReceitaOculos(Integer id, String detalhamento, java.sql.Date dtConsulta, int idConsultaMedica) {
        super(id);
        this.detalhamento = detalhamento;
        this.dtConsulta = dtConsulta;
        this.idConsultaMedica = idConsultaMedica;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public int getIdConsultaMedica() {
        return idConsultaMedica;
    }

    public void setIdConsultaMedica(int idConsultaMedica) {
        this.idConsultaMedica = idConsultaMedica;
    }

    @Override
    public String toString() {
        return "ReceitaOculos{" +
                "detalhamento='" + detalhamento + '\'' +
                ", dtConsulta=" + dtConsulta +
                ", idConsultaMedica=" + idConsultaMedica +
                '}';
    }
}
