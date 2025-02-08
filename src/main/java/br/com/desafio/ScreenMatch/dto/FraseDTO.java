package br.com.desafio.ScreenMatch.dto;

import br.com.desafio.ScreenMatch.model.Frase;

public class FraseDTO {

    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public FraseDTO(String frase, String poster, String personagem, String titulo) {
        this.frase = frase;
        this.poster = poster;
        this.personagem = personagem;
        this.titulo = titulo;
    }

    public FraseDTO(Frase f) {
        this.frase = f.getFrase();
        this.poster = f.getPoster();
        this.personagem = f.getPersonagem();
        this.titulo = f.getTitulo();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
