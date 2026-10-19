package br.edu.ifrn.qagym.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifrn.qagym.model.Book;

class LibraryServiceTest {

    private LibraryService service;

    @BeforeEach
    void setUp() {
        service = new LibraryService();
    }

    @Test
    void deveAdicionarLivroNaBiblioteca() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        service.addBook(book);
        assertThat(service.getAllBooks()).contains(book);
    }

    @Test
    void deveBuscarLivroPorIsbn() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        service.addBook(book);
        Book found = service.findBookByIsbn("978-0-13-468599-1");
        assertThat(found).isEqualTo(book);
    }

    @Test
    void deveRetornarNullParaIsbnInexistente() {
        Book found = service.findBookByIsbn("000-0-00-000000-0");
        assertThat(found).isNull();
    }

    @Test
    void deveBuscarLivrosPorTituloExato() {
        Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
        service.addBook(book);
        List<Book> found = service.findBooksByTitle("Clean Code");
        assertThat(found).contains(book);
    }

    @Test
    void deveRetornarListaVaziaParaTituloInexistente() {
        List<Book> found = service.findBooksByTitle("Titulo Inexistente");
        assertThat(found).isEmpty();
    }

    @Test
    void deveListarTodosOsLivros() {
        Book b1 = new Book("ISBN-1", "Livro A", "Autor A", 2000);
        Book b2 = new Book("ISBN-2", "Livro B", "Autor B", 2001);
        service.addBook(b1);
        service.addBook(b2);
        assertThat(service.getAllBooks()).hasSize(2);
    }

    @Test
    void deveRetornarListagemDeLivrosPorAutor() {
        String author = "Graciliano Ramos";
        Book book1 = new Book("978-8501114785", "Vidas Secas", "Graciliano Ramos", 1938);
        Book book2 = new Book("978-6586655612", "A Chinela Turca", "Machado de Assis", 1875);
        Book book3 = new Book("978-8501116413", "Memórias do Cárcere", "Graciliano Ramos", 1953);

        List<Book> livrosEsperados = List.of(book1, book3);

        service.addBook(book1);
        service.addBook(book2);
        service.addBook(book3);

        List<Book> livrosRetornados = service.findBooksByAuthor(author);

        assertEquals(livrosEsperados, livrosRetornados);
    }
}
