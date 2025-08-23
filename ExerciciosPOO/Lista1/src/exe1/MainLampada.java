package exe1;

import java.util.Scanner;

public class MainLampada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Lampada lampada1 = new Lampada();
        lampada1.marca = "Marca 1";
        lampada1.cor = "Branca";
        lampada1.ligada = false;
        lampada1.brilho = 0;

        System.out.println("Estado inicial da Lampada 1:");
        lampada1.exibe();

        lampada1.ligar();
        lampada1.ajustarBrilho(80);
        lampada1.mudarCor("Amarela");

        System.out.println("Estado da Lampada 1");
        lampada1.exibe();

        System.out.println("Digite a marca da lampada:");
        String marca = sc.nextLine();

        System.out.println("Digite a cor inicial da lampada:");
        String cor = sc.nextLine();

        System.out.println("Está ligada? (true/false):");
        boolean ligada = sc.nextBoolean();

        System.out.println("Digite o brilho (0 a 100):");
        int brilho = sc.nextInt();

        Lampada lampada2 = new Lampada(marca, cor, ligada, brilho);

        System.out.println("Estado inicial da Lampada 2");
        lampada2.exibe();

        // Alterações
        lampada2.desligar();
        lampada2.ajustarBrilho(100);
        lampada2.ligar();
        lampada2.ajustarBrilho(100);
        lampada2.mudarCor("Azul");

        System.out.println("Estado da Lampada 2 após alterações");
        lampada2.exibe();

        sc.close();
    }
}
