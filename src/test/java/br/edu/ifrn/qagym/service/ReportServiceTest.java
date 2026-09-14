package br.edu.ifrn.qagym.service;

import br.edu.ifrn.qagym.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ReportServiceTest {

    private ReportService reportService;

    @BeforeEach
    void setUp() {
        reportService = new ReportService();
    }

    @Test
    void deveContarTotalDeLivros() {
        List<Book> books = List.of(
            new Book("ISBN-1", "Livro A", "Autor A", 2000),
            new Book("ISBN-2", "Livro B", "Autor B", 2001)
        );
        assertThat(reportService.total(books)).isEqualTo(2);
    }

    @Test
    void deveRetornarZeroParaListaVazia() {
        assertThat(reportService.total(List.of())).isEqualTo(0);
    }
}
