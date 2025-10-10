import exe1.Funcionario;
import exe1.FuncionarioCLT;
import exe1.FuncionarioPJ;

import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioCLT("Izadora", 3500));
        funcionarios.add(new FuncionarioPJ("Felipe", 4000));

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
