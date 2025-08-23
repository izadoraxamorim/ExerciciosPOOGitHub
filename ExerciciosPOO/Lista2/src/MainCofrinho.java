import exe1.Cofrinho;

public class MainCofrinho {
    public static void main(String[] args) {

        Cofrinho obj1 = new Cofrinho();
        obj1.setSaldo(500);
        obj1.exibe();
        obj1.fechar();
        obj1.depositar(200);
        obj1.abrir();
        obj1.retirarTudo();
        obj1.exibe();
        obj1.setFechado(true);

        Cofrinho obj2 = new Cofrinho();
        obj2.setSaldo(200);
        obj2.exibe();
        obj2.depositar(200);
        obj2.exibe();
        obj2.fechar();
        obj2.depositar(50);
        obj2.abrir();

        obj1.exibirSaldo();
        obj2.exibirSaldo();
    }


}
