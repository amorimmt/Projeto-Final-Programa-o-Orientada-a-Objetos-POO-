package modelo;

import java.util.ArrayList;
import java.util.List;

public enum Categoria {

    // Categorias de receita
    SALARIOS("Salários", true),
    HONORARIOS("Honorários", true),
    RENDIMENTOS("Rendimentos", true),
    OUTRAS_RECEITAS("Outras receitas", true),

    // Categorias de despesa
    MORADIA("Moradia", false),
    LUZ("Luz", false),
    AGUA("Água", false),
    COMUNICACOES("Comunicações", false),
    ALIMENTACAO("Alimentação", false),
    TRANSPORTE("Transporte", false),
    SAUDE("Saúde", false),
    EDUCACAO("Educação", false),
    LAZER("Lazer", false),
    OUTRAS_DESPESAS("Outras despesas", false);

    private final String nome;
    private final boolean receita;

    Categoria(String nome, boolean receita) {
        this.nome = nome;
        this.receita = receita;
    }

    public String getNome() {
        return nome;
    }

    public boolean ehReceita() {
        return receita;
    }

    public boolean ehDespesa() {
        return !receita;
    }

    // Usado pelo menu: só as categorias de receita
    public static List<Categoria> listarReceitas() {
        return listarPorTipo(true);
    }

    // Usado pelo menu: só as categorias de despesa
    public static List<Categoria> listarDespesas() {
        return listarPorTipo(false);
    }

    private static List<Categoria> listarPorTipo(boolean receita) {
        List<Categoria> lista = new ArrayList<>();
        for (Categoria c : values()) {
            if (c.receita == receita) {
                lista.add(c);
            }
        }
        return lista;
    }

    @Override
    public String toString() {
        return nome;
    }
}