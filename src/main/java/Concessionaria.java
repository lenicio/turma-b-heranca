import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria() {
        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
            System.out.println("\n--------------------------\n");
        }
    }

}
