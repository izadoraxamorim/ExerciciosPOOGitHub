import exe0.Lampada;

public class Main {
    public static void main(String[] args) {

        Lampada obj1 = new Lampada();
        obj1.setBrilho(50);
        obj1.setLigada(false);
        obj1.exibe();
        Lampada obj2 = new Lampada();
        obj2.setBrilho(50);
        obj2.setLigada(true);
        obj2.setCor("branca");
        obj2.setMarca("phillips");

        System.out.println("Cor: " + obj2.getCor() +
        "\nBrilho: " + obj2.getBrilho() +
        "\nMarca: " + obj2.getMarca() +
                "\nLigada: " + obj2.getLigada());
        obj2.exibe();

        Lampada obj3 = new Lampada("Elgin", "Branca", true, 240);
        obj3.exibe();
            }
}
