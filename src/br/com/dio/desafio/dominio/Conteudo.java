package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //atributos
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public  abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao(String descricaoCursoJavascript) {
        return descricaoCursoJavascript;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
