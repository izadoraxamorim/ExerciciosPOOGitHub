import exe0.Funcionario;
import exe01.Caminhao;
import exe01.Carro;
import exe01.Moto;
import exe01.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculos {


    private static void exibir(Veiculo veiculo) {
        System.out.println(veiculo.toString());

    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("ABC1", "Ônix", 50000, 4);
        Moto moto1 = new Moto("ABC2", "CG Titan", 15000, 300);
        Caminhao caminhao1 = new Caminhao("CPI0", "Mercedes Benz", 120000, 6);

        exibir(carro1);
        exibir(moto1);
        exibir(caminhao1);

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(carro1);
        veiculos.add(moto1);
        veiculos.add(caminhao1);

        double total = 0;
        for (Veiculo veiculo : veiculos) { //para cada veículo
            total += veiculo.calcularImposto();
        }
        System.out.println("Total de Impostos: R$" + Math.round(total));
    }
}