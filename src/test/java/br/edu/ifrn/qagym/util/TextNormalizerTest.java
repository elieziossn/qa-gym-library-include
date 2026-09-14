package br.edu.ifrn.qagym.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextNormalizerTest {

    private final TextNormalizer normalizer = new TextNormalizer();

    @Test
    void deveConverterParaMinusculas() {
        assertThat(normalizer.normalize("CLEAN CODE")).isEqualTo("clean code");
    }

    @Test
    void deveRemoverEspacosNasExtremidades() {
        assertThat(normalizer.normalize("  Clean Code  ")).isEqualTo("clean code");
    }

    @Test
    void deveRetornarStringVaziaParaNull() {
        assertThat(normalizer.normalize(null)).isEqualTo("");
    }

    @Test
    void deveNormalizarTextoComMaiusculasEEspacos() {
        assertThat(normalizer.normalize("  Robert C. Martin  ")).isEqualTo("robert c. martin");
    }
}
