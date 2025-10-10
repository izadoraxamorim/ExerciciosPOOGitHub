import exe3.CarroEletrico;
import exe3.Eletrico;
import exe3.PatineteEletrico;
import exe3.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();

        veiculos.add(new CarroEletrico("Tesla 1"));
        veiculos.add(new PatineteEletrico("Foston"));

        System.out.println("Movendo os veículos:");
        for (Veiculo v : veiculos) {
            v.mover();
        }

        System.out.println("\nCarregando baterias:");
        for (Veiculo v : veiculos) {
            if (v instanceof Eletrico) {
                ((Eletrico) v).carregarBateria();
            }
        }
    }
}