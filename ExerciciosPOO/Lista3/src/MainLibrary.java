import exe02.LibraryUser;
import exe02.Book;
import exe02.LoanItem;

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Dom Casmurro", "Machado de Assis", 1899, 123);
        Book book2 = new Book("O Pequeno Príncipe", "Saint-Exupery", 1943, 1234);
        Book book3 = new Book("O Senhor dos Anéis", "Tolkien", 1937, 12345);
        Book book4 = new Book("A Guerra dos Tronos", "George R. R. Martin",1998, 123456);

       LibraryUser user = new LibraryUser(1, "Izadora");
       user.addLoan(11, 7, book1);
       user.addLoan(3, 5, book2);

       System.out.println(user.toString());

       user.removeLoan(3);

       System.out.println(user.toString());
       user.totalDaysBorrowed();
       user.clearLoans();
        System.out.println(user.toString());
    }
}
