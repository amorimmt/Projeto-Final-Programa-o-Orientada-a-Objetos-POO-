package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Transacao {
    protected int id;
    protected String nome;
    protected String descricao;
    protected double valor;
    protected LocalDate data;
    protected Categoria categoria;
    
    public Transacao(String nome, String descricao, double valor, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        LocaleDate.now();
        this.categoria = categoria;
    }
    public Transacao(int id, String nome, String descricao, double valor, LocalDate data, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public String linhaExtrato() {
    String linha = "[" + id + "] ";
    linha = linha + data + " | ";
    linha = linha + nome + " | ";
    linha = linha + categoria + " | ";
    linha = linha + "R$ " + valor;
    return linha;
     }

     @Override
    public String toString() {
        return linhaExtrato();
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
    public LocalDate getData() { return data; }
    public Categoria getCategoria() { return categoria; }

    public void setValor(double valor) { this.valor = valor; }
}


