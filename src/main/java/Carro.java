public class Carro {
    private String modelo;
    private String nrPlaca;
    private String cor;
    private Integer qtdPortas;
    private Integer peso;
    private Integer cavalos;
    private Boolean ehAutomatico;

    public Carro(String modelo, String nrPlaca, String cor, Integer qtdPortas, Integer peso, Integer cavalos, Boolean ehAutomatico) {
        this.modelo = modelo;
        this.nrPlaca = nrPlaca;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
        this.peso = peso;
        this.cavalos = cavalos;
        this.ehAutomatico = ehAutomatico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNrPlaca() {
        return nrPlaca;
    }

    public void setNrPlaca(String nrPlaca) {
        this.nrPlaca = nrPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Boolean getEhAutomatico() {
        return ehAutomatico;
    }

    public void setEhAutomatico(Boolean ehAutomatico) {
        this.ehAutomatico = ehAutomatico;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", nrPlaca='" + nrPlaca + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdPortas=" + qtdPortas +
                ", peso=" + peso +
                ", cavalos=" + cavalos +
                ", ehAutomatico=" + ehAutomatico +
                '}';
    }
}
