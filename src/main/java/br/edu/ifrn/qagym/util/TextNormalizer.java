package br.edu.ifrn.qagym.util;

public class TextNormalizer {

    public String normalize(String text) {
        if (text == null) {
            return "";
        }
        return text.trim().toLowerCase();
    }

    public boolean containsIgnoreCase(String text, String search) {
        // TODO: implementar busca parcial ignorando maiúsculas/minúsculas
        return false;
    }
}
