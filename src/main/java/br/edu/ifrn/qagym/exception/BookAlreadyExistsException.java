package br.edu.ifrn.qagym.exception;

public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(String isbn) {
        super("Já existe um livro cadastrado com o ISBN: " + isbn);
    }
}
