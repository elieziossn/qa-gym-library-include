package br.edu.ifrn.qagym.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookTest {

    @Test
    void deveSerCriadoComoDisponivelPorPadrao() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(book.isAvailable()).isTrue();
    }

    @Test
    void devePermitirMarcarLivroComoIndisponivel() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        book.setAvailable(false);
        assertThat(book.isAvailable()).isFalse();
    }

    @Test
    void devePermitirMarcarLivroComoDisponivel() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        book.setAvailable(false);
        book.setAvailable(true);
        assertThat(book.isAvailable()).isTrue();
    }

    @Test
    void deveRetornarIsbnCorretamente() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(book.getIsbn()).isEqualTo("978-0-13-468599-1");
    }

    @Test
    void deveRetornarTituloCorretamente() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(book.getTitle()).isEqualTo("Clean Code");
    }

    @Test
    void deveRetornarAutorCorretamente() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(book.getAuthor()).isEqualTo("Robert C. Martin");
    }

    @Test
    void deveRetornarAnoDePublicacaoCorretamente() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        assertThat(book.getPublicationYear()).isEqualTo(2008);
    }
}
