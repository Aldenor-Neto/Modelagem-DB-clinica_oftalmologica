package org.example.model;

import java.sql.Date;

public class ConsultaMedica extends  GenericModel{

    private  String  assinatura;
    java.sql.Date dtConsulta;
    private  int idPaciente;
    private  int idMedico;

    public ConsultaMedica(Integer id, String assinatura, java.sql.Date dtConsulta, int idPaciente, int idMedico) {
        super(id);
        this.assinatura = assinatura;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "ConsultaMedica{" +
                "assinatura='" + assinatura + '\'' +
                ", dtConsulta=" + dtConsulta +
                ", idPaciente=" + idPaciente +
                ", idMedico=" + idMedico +
                '}';
    }
}
