package exe1;

public class Lampada {
    // Atributos
    public boolean ligada;
    public int brilho;
    public String cor;
    public String marca;

    // Construtor vazio
    public Lampada() {
    }

    // Construtor completo
    public Lampada(String marca, String cor, boolean ligada, int brilho) {
        this.marca = marca;
        this.cor = cor;
        this.ligada = ligada;
        if (brilho >= 0 && brilho <= 100) {
            this.brilho = brilho;
        } else {
            this.brilho = 0;
        }
    }

    // Métodos
    public void exibe() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ligada: " + ligada);
        System.out.println("Brilho: " + brilho);
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            if (brilho == 0) {
                brilho = 50;
            }
        }
    }

    public void desligar() {
        ligada = false;
        brilho = 0;
    }

    public void ajustarBrilho(int valor) {
        if (ligada) {
            if (valor < 0) valor = 0;
            if (valor > 100) valor = 100;
            brilho = valor;
        } else {
            System.out.println("Não é possível ajustar brilho com a lâmpada desligada");
        }
    }

    public void mudarCor(String novaCor) {
        if (ligada) {
            cor = novaCor;
        } else {
            System.out.println("Não é possível mudar a cor com a lâmpada desligada);
        }
    }
}
