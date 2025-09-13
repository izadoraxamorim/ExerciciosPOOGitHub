package exe02;

public class LoanItem {
    private int id;
    private int days; // quantidade de dias do empréstimo
    private Book book;

    public LoanItem() {
    }

    //UMA AGREGAÇÃO
    public LoanItem(int id, int days, Book book) {
        this.id = id;
        this.days = days;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "\nLoanItem{" +
                "id=" + id +
                ", days=" + days +
                ", book=" + book +
                '}';
    }
}