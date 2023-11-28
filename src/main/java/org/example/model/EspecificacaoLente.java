package org.example.model;

public class EspecificacaoLente extends GenericModel {

    private float valor;
    private int idEstruturaLente;
    private int idAtributoEstruturaLente;

    public EspecificacaoLente(Integer id, float valor, int idEstruturaLente, int idAtributoEstruturaLente) {
        super(id);
        this.valor = valor;
        this.idEstruturaLente = idEstruturaLente;
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIdEstruturaLente() {
        return idEstruturaLente;
    }

    public void setIdEstruturaLente(int idEstruturaLente) {
        this.idEstruturaLente = idEstruturaLente;
    }

    public int getIdAtributoEstruturaLente() {
        return idAtributoEstruturaLente;
    }

    public void setIdAtributoEstruturaLente(int idAtributoEstruturaLente) {
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }

    @Override
    public String toString() {
        return "EspecificacaoLente{" +
                "valor=" + valor +
                ", idEstruturaLente=" + idEstruturaLente +
                ", idAtributoEstruturaLente=" + idAtributoEstruturaLente +
                '}';
    }
}
