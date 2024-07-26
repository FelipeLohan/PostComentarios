package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Post {
    
    Scanner teclado = new Scanner(System.in);
    private LocalDate momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private int id;

    List<Comentario> comentarios = new ArrayList<>();
    
    //constructor
    public Post(LocalDate momento, String titulo, String conteudo, Integer likes, int id) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
        this.id = id;
    }

    //methods

    public void comentar(){
        System.out.println("Escreva seu comentário: ");
         String texto = teclado.nextLine();
            Comentario comentario = new Comentario(texto); 
                comentarios.add(comentario);
    }

    


    //getters setters
    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post [teclado=" + teclado + ", momento=" + momento + ", titulo=" + titulo + ", conteudo=" + conteudo
                + ", likes=" + likes + "]";
    }

    

    

    

    
}
