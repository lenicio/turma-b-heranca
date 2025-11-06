public class Carro extends Veiculo {
    private Boolean ehAutomatico;

    public Carro(String modelo, String nrPlaca, String cor, Integer peso, Integer cavalos, Boolean ehAutomatico) {
        super(modelo, nrPlaca, cor, peso, cavalos);
        this.ehAutomatico = ehAutomatico;
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
                super.toString() +
                "ehAutomatico=" + ehAutomatico +
                '}';
    }
}
