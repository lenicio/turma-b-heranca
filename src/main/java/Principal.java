public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Kwid",
                "UAI-3434",
                "Preto",
                5,
                800,
                false
        );

        // (String modelo, String nrPlaca, String cor, Integer peso, Integer cavalos, Boolean ehFreioDisco) {

        Concessionaria concessionaria1 = new Concessionaria();

        Moto moto1 = new Moto(
                "Honda Biz",
                "OXE-8383",
                "Rosa",
                83,
                29,
                "Correia"
        );

        Moto moto2 = new Moto(
                "Honda Biz",
                "OXE-8383",
                "Rosa",
                83,
                29,
                "Correia"
        );

        concessionaria1.addVeiculo(moto1);
        concessionaria1.addVeiculo(moto2);
        concessionaria1.addVeiculo(carro1);

        concessionaria1.listarVeiculos();
    }
}
