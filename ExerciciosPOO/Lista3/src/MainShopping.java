import exe1.CarItem;
import exe1.Product;
import exe1.ShoppingCart;


public class MainShopping {
    public static void main(String[] args) {
        Product prod1 = new Product(7, "A", 100);
        Product prod2 = new Product(8, "B", 200);
        Product prod3 = new Product(9, "C", 300);

        ShoppingCart cart = new ShoppingCart(1);
        cart.addCarItem(11, 5, prod1);
        cart.addCarItem(12, 10, prod2);
        cart.addCarItem(13, 2, prod3);

        System.out.println(cart.toString());

        cart.removeCarItem(12);

        System.out.println(cart.toString());
    }
}
