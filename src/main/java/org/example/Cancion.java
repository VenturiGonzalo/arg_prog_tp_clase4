package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cancion {
    private String titulo;
    private String album;
    private String artista;
    private int anio;
    private int repTotales;
    private int rep24h;
    private int likes;
    private int dislikes;
    private IPopularidad popularidad;


    public Cancion(String titulo, String album, String artista, int anio) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.anio = anio;
        this.repTotales = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.popularidad = new Normal();
    }

    public String getEstado(){
        //actualizo la popularidad
        this.popularidad.popularizar(this);

        //devuelvo el estado del tema
        return this.popularidad.getEstado(this);
    }

}
