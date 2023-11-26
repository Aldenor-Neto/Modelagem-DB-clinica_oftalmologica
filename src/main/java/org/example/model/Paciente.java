package org.example.model;

import java.sql.Date;

public class Paciente extends GenericModel {

    private String nome;
    private String cpf;
    private java.sql.Date dtNascimento;

    public Paciente(Integer id, String nome, String cpf, java.sql.Date dtNascimento) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }
}
