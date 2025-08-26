package exe2;

public class Cafeteira {
    private int agua;
    private int poCafe;
    private boolean ligada;

    public Cafeteira(){
        this.ligada = false;
        this.agua = 0;
        this.poCafe = 0;
    }

    public Cafeteira(int agua, int poCafe, boolean ligada){
        this.setAgua(agua);
        this.setPoCafe(poCafe);
        this.ligada = ligada;
    }

    public void setAgua(int agua){
        if (agua >= 0 && agua <= 2000){
            this.agua = agua;
        } else {
            System.out.println("Água deve ser entre 0 e 2000ml.");
        }
    }

    public void setPoCafe(int poCafe){
        if (poCafe >= 0 && poCafe <= 100){
            this.poCafe = poCafe;
        } else{
            System.out.println("Pó de café deve estar entre 0 até 100g.");
        }
    }
    public int getAgua(){
        return this.agua;
    }
    public int getPoCafe(){
        return this.poCafe;
    }
    public void ligar(){
        if (!this.ligada){
            this.ligada = true;
            System.out.println("Cafeteira ligada. ");
        }
    }
    public void desligar(){
        if (this.ligada){
            this.ligada = false;
            System.out.println("Cafeteira desligada. ");
        }
    }
    public void adicionarAgua(int ml){
        if (ml>0){
            this.setAgua(this.agua+ml);
            } else {
                System.out.println("Agua deve ser entre 0 e 2000ml.");
            }
        }

    public void adicionarCafe(int gramas){
        if (gramas > 0){
           this.setPoCafe(this.poCafe + gramas);
            } else {
                System.out.println("Pó de café deve estar entre 0 e 100g. ");
            }
        }
    public void prepararCafe(){
        if (!this.ligada || this.agua < 100 || this.poCafe < 10){
            System.out.println("Cafeteira desligada ou pó ou água insuficientes.");
        } else {
            this.setAgua(agua-100);
            this.setPoCafe(poCafe-10);
            System.out.println("Café preparado! ");
        }
    }
    public void exibe() {
        System.out.println("Cafeteira está ligada? True Or False:" + this.ligada +
                "\nQuantidade de água: " + this.agua + "ml." +
                "\nQuantidade de pó: " + this.poCafe + "gramas.");
    }
}

