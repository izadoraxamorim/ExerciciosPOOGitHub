import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

public class Main {
    public static void main(String[] args) {

        Assistente ass1 = new Assistente("Mateus", "Rua Alagoas","123", 3000, 12);
        System.out.println(ass1.toString());

        Gerente gerente1 = new Gerente("Daniela", "Rua das Acácias", "2345", 5000, 2000);
        System.out.println(gerente1.toString());

        Diretor diretor1 = new Diretor("Flávia", "Rua da Água", "47000", 5000, 3000);
        System.out.println(diretor1.toString());
    }
}

