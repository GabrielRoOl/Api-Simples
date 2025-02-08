package br.com.desafio.ScreenMatch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_frase")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Frase(){}

    public Frase(Long id, String poster, String personagem, String titulo, String frase) {
        this.id = id;
        this.poster = poster;
        this.personagem = personagem;
        this.titulo = titulo;
        this.frase = frase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
