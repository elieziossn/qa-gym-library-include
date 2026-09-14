package br.edu.ifrn.qagym.exception;

public class LoanNotAllowedException extends RuntimeException {

    public LoanNotAllowedException(String message) {
        super(message);
    }
}
