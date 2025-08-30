import exe2.Cafeteira;
public class MainCafeteira {
    public static void main(String[] args) {
        Cafeteira obj1 = new Cafeteira();

        System.out.println("Estado inicial da cafeteira:");
        obj1.exibe();

        obj1.prepararCafe();

        obj1.ligar();
        obj1.exibe();

        obj1.adicionarAgua(2000);
        obj1.adicionarCafe(100);
        obj1.prepararCafe();
        obj1.exibe();
        obj1.quantosCafesPossiveis();
    }
}
