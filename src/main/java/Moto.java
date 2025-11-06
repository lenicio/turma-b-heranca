public class Moto extends Veiculo {

    private String tipoCorrente;

    public Moto(String modelo, String nrPlaca, String cor, Integer peso, Integer cavalos, String tipoCorrente) {
        super(modelo, nrPlaca, cor, peso, cavalos);
        this.tipoCorrente = tipoCorrente;
    }

    @Override
    public String toString() {
        return "Moto{" +
                super.toString() +
                "tipoCorrente='" + tipoCorrente + '\'' +
                '}';
    }
}
