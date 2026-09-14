package br.edu.ifrn.qagym.service;

import br.edu.ifrn.qagym.model.Book;
import br.edu.ifrn.qagym.model.Loan;
import br.edu.ifrn.qagym.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanService {

    private final List<Loan> loans = new ArrayList<>();

    public Loan borrowBook(Book book, User user, LocalDate date) {
        book.setAvailable(false);
        Loan loan = new Loan(book, user, date);
        loans.add(loan);
        return loan;
    }

    public void returnBook(Loan loan, LocalDate returnDate) {
        loan.setReturnDate(returnDate);
        loan.getBook().setAvailable(true);
    }

    public List<Loan> getAllLoans() {
        return new ArrayList<>(loans);
    }

    public List<Loan> getActiveLoans() {
        List<Loan> active = new ArrayList<>();
        for (Loan loan : loans) {
            if (!loan.isReturned()) {
                active.add(loan);
            }
        }
        return active;
    }

    public List<Loan> getLateLoans(LocalDate currentDate) {
        // TODO: retornar lista de empréstimos atrasados
        return List.of();
    }
}
