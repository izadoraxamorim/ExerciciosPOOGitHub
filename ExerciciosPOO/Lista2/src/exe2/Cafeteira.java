package exe2;

public class Cafeteira {
    private int agua;
    private int poCafe;
    private boolean ligada;

    public Cafeteira() {
        this.ligada = false;
        this.agua = 0;
        this.poCafe = 0;
    }

    public Cafeteira(int agua, int poCafe, boolean ligada) {
        this.setAgua(agua);
        this.setPoCafe(poCafe);
        this.setLigada(ligada);
    }

    public void setAgua(int agua) {
        if (agua >= 0 && agua <= 2000) {
            this.agua = agua;
        } else {
            System.out.println("Água deve ser entre 0 e 2000ml.");
        }
    }

    public void setPoCafe(int poCafe) {
        if (poCafe >= 0 && poCafe <= 100) {
            this.poCafe = poCafe;
        } else {
            System.out.println("Pó de café deve estar entre 0 até 100g.");
        }
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getAgua() {
        return this.agua;
    }

    public int getPoCafe() {
        return this.poCafe;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        if (!this.ligada) {
            this.setLigada(true);
        } else System.out.println("Cafeteira já está ligada. ");
    }

    public void desligar() {
        if (this.ligada) {
            this.setLigada(false);
        } else System.out.println("Cafeteira já está desligada. ");
    }

    public void adicionarAgua(int ml) {
        if (ml > 0) {
            this.setAgua(this.agua + ml);
        } else System.out.println("Quantidade negativa.");
    }

    public void adicionarCafe(int gramas) {
        if (gramas > 0) {
            this.setPoCafe(this.poCafe + gramas);
        } else System.out.println("Quantidade negativa.");
    }

    public void prepararCafe() {
        if (this.ligada && this.agua >= 100 && this.poCafe >= 10) {
            this.setAgua(agua - 100);
            this.setPoCafe(poCafe - 10);
        } else System.out.println("Problema no preparo do café.");
    }

    public void exibe() {
        System.out.println("Cafeteira está ligada?" + (this.ligada ? "Sim" : "Não") +
                "\nQuantidade de água: " + this.agua + "ml." +
                "\nQuantidade de pó: " + this.poCafe + "gramas.");
    }


//DESAFIO
    public void quantosCafesPossiveis(){
        int dosesAgua = this.agua/100;
        int dosesCafe = this.poCafe/10;
        int menor;
        menor = Math.min(dosesCafe, dosesAgua);
        System.out.println("Quantidade de cafés possíveis: " + menor);
    }
}