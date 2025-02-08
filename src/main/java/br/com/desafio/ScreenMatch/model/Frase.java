package br.com.desafio.ScreenMatch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_frase")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String personagem;
    private String imgUrl;

    public Frase(){}

    public Frase(Long id, String imgUrl, String personagem, String titulo) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.personagem = personagem;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
