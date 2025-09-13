package exe02;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private int id;
    private String name;
    private List<LoanItem> loans;

    public LibraryUser() {
        //aloca espaço na memória para o vetor.
        this.loans = new ArrayList<LoanItem>();
    }

    public LibraryUser(int id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLoan(int id, int days, Book book) {
        //COMPOSIÇÃO
        this.loans.add(new LoanItem(id, days, book));
        System.out.println("Empréstimo adicionado com sucesso.");
    }

    public void removeLoan(int id) {
        //percorrer o vetor
        for (LoanItem loan : this.loans) {
            if (loan.getId() == id) {
                this.loans.remove(loan);
                System.out.println("Empréstimo removido com sucesso.");
                return;
            }
        }
        System.out.println("Empréstimo não foi encontrado.");
    }

    public void clearLoans() {
        this.loans.clear();
        System.out.println("Todos os empréstimos foram removidos.");
    }

    public boolean isEmpty() {
        return this.loans.isEmpty();
    }

    public void totalDaysBorrowed() {
        int soma = 0;
        for (LoanItem loans : this.loans) {
            soma += loans.getDays();
        }
        System.out.println("Total de dias emprestados:" + soma);

    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }
}