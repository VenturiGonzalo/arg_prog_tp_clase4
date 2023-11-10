package org.example;

public class Normal implements IPopularidad{
    @Override
    public void popularizar(Cancion tema) {
        if(tema.getRepTotales() > 50000 && tema.getLikes() > 20000 && tema.getDislikes() < 5000) {
            tema.setPopularidad(new EnTendencia());
        } else if(tema.getRepTotales() > 1000) {
            tema.setPopularidad(new EnAuge());
        }


    }

    @Override
    public String getEstado(Cancion tema){
        return Icono.MUSICAL_NOTE.texto() + " " +
            tema.getArtista() + " - " +
            tema.getAlbum() + " - " +
            tema.getTitulo();
    }
}
