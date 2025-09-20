import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void exibeNaCaixa(Funcionario funcionario) {
        //Objeto funcionário é polimórfico
        //Se a função for chamada e for passado um assistente, funcionário executa
        //toString do assistente.
        // Se a função for chamada e for passado um gerente, funcionário executa
        // toString do gerente.
        // Se a função for chamada e for passado um diretor, funcionário executa
        // toString do diretor.
        JOptionPane.showMessageDialog(null, funcionario.toString());
    }
    public static void main(String[] args) {

        Funcionario objFuncionario; // objeto da superclasse
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        objFuncionario = new Assistente("Mateus", "Rua Alagoas","123", 3000, 12);
        //obgFuncionario= ass1; //como assistente é um funcionário, objFuncionario pode receber ass1. objFuncionario é um objeto polimórfico
        funcionarios.add(objFuncionario); //Adiciona um assistente no vetor
        System.out.println(objFuncionario.toString());
        exibeNaCaixa(objFuncionario); //Estamos passando como parâmetro um assistente.

        objFuncionario = new Gerente("Daniela", "Rua das Acácias", "2345", 5000, 2000);
        funcionarios.add(objFuncionario); //Adiciona um gerente no vetor
        System.out.println(objFuncionario.toString());
        exibeNaCaixa(objFuncionario); //Estamos passando como parâmetro um gerente.

        objFuncionario = new Diretor("Flávia", "Rua da Água", "47000", 7000, 3000);
        funcionarios.add(objFuncionario); // Adiciona um diretor no vetor.
        System.out.println(objFuncionario.toString());
        exibeNaCaixa(objFuncionario); //Estamos passando como parâmetro um diretor.

        //Calcular a folha de pagamento
        float total = 0;
        //objeto funcionario, da classe Funcionario, vai percorrer o vetor
        for (Funcionario funcionario : funcionarios) { //para cada funcionário
            // objeto funcionário é polimórfico
            total = total + funcionario.getSalario();
        }
        System.out.println(total);
    }
}

