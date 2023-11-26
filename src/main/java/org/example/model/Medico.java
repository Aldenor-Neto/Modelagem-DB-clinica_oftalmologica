package org.example.model;

public class Medico  extends  GenericModel{

    private String nome;
    private String crm;

    public Medico(Integer id, String nome, String crm) {
        super(id);
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}
