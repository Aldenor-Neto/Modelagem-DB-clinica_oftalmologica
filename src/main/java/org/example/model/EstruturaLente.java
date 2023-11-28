package org.example.model;

public class EstruturaLente extends GenericModel {

    private String tipoCorrecao;
    private int distanciaPupilar;
    private int idReceitaOculos;

    public EstruturaLente(Integer id, String tipoCorrecao, int distanciaPupilar, int idReceitaOculos) {
        super(id);
        this.tipoCorrecao = tipoCorrecao;
        this.distanciaPupilar = distanciaPupilar;
        this.idReceitaOculos = idReceitaOculos;
    }

    public String getTipoCorrecao() {
        return tipoCorrecao;
    }

    public void setTipoCorrecao(String tipoCorrecao) {
        this.tipoCorrecao = tipoCorrecao;
    }

    public int getDistanciaPupilar() {
        return distanciaPupilar;
    }

    public void setDistanciaPupilar(int distanciaPupilar) {
        this.distanciaPupilar = distanciaPupilar;
    }

    public int getIdReceitaOculos() {
        return idReceitaOculos;
    }

    public void setIdReceitaOculos(int idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "EstruturaLente{" +
                "tipoCorrecao='" + tipoCorrecao + '\'' +
                ", distanciaPupilar=" + distanciaPupilar +
                ", idReceitaOculos=" + idReceitaOculos +
                '}';
    }
}
