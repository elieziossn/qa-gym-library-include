package br.edu.ifrn.qagym.util;

import br.edu.ifrn.qagym.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookValidatorTest {

    private BookValidator validator;

    @BeforeEach
    void setUp() {
        validator = new BookValidator();
    }

    @Test
    void deveRetornarVerdadeiroQuandoLivroForValido() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(validator.isValid(book)).isTrue();
    }

    @Test
    void deveRetornarFalsoQuandoTituloForNulo() {
        Book book = new Book("978-0-13-468599-1", null, "Robert C. Martin", 2008);
        assertThat(validator.isValid(book)).isFalse();
    }

    @Test
    void deveRetornarFalsoQuandoTituloForVazio() {
        Book book = new Book("978-0-13-468599-1", "", "Robert C. Martin", 2008);
        assertThat(validator.isValid(book)).isFalse();
    }

    @Test
    void deveRetornarFalsoQuandoTituloConterApenasEspacos() {
        Book book = new Book("978-0-13-468599-1", "   ", "Robert C. Martin", 2008);
        assertThat(validator.isValid(book)).isFalse();
    }
}