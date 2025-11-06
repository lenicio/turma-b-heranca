public class Veiculo {
    private String modelo;
    private String nrPlaca;
    private String cor;
    private Integer peso;
    private Integer cavalos;

    public Veiculo(String modelo, String nrPlaca, String cor, Integer peso, Integer cavalos) {
        this.modelo = modelo;
        this.nrPlaca = nrPlaca;
        this.cor = cor;
        this.peso = peso;
        this.cavalos = cavalos;
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

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", nrPlaca='" + nrPlaca + '\'' +
                ", cor='" + cor + '\'' +
                ", peso=" + peso +
                ", cavalos=" + cavalos +
                '}';
    }
}
