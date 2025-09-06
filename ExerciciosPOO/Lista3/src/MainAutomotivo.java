import exe0.Carro;
public class MainAutomotivo {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Onix");
        carro1.setMotor(100, true);
        System.out.println(carro1.toString());

        Carro carro2 = new Carro("Polo", 120, true);
        System.out.println(carro2.toString());
    }
}
