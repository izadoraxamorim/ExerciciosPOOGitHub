package exe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    //vetor de itens de carrinho
    private List<CarItem> itens;
    private double valorTotal;

    public ShoppingCart() {
        //aloca espaço na memória para o vetor.
        this.itens = new ArrayList<CarItem>();
        this.valorTotal = 0;
    }

    public ShoppingCart(int id) {
        //List<CarItem> e valorTotal não podem ser calculados antes do carrinho de compra estar fechado.
        this.id = id;
        this.itens = new ArrayList<CarItem>();
        this.valorTotal = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getItens() {
        return itens;
    }
    //public List<CarItem> setItens() - não pode ser usado porque o item do carrinho fica independente do carrinho de compras.

    public void addCarItem(int id, int quantity, Product product) {
        // o metodo add adiciona o item na lista
        this.itens.add(new CarItem(id, quantity, product));
        System.out.println("CarItem adicionado com sucesso.");
        calculateValorTotal();
    }

    public void removeCarItem(int id) {
        boolean removeu = false;
        for (CarItem item : itens) {
            if (item.getId() == id) {  //encontrei o item que eu quero remover
                this.itens.remove(item);
                removeu = true;
                System.out.println("CarItem removido com sucesso");
            }
        }
        if (!removeu){
            System.out.println("CarItem não foi encontrado.");
        }
        this.calculateValorTotal();
    }
    public void calculateValorTotal() {
        double soma = 0;
        for(CarItem item : this.itens){ //para cada item do vetor
           soma += item.getQuantity() * item.getProduct().getPrice();
        } this.valorTotal = soma;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
