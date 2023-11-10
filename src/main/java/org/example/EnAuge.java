package org.example;

public class EnAuge implements IPopularidad{
    @Override
    public void popularizar(Cancion tema) {
        if(tema.getRepTotales() > 50000 && tema.getLikes() > 20000 && tema.getDislikes() < 5000){
            tema.setPopularidad(new EnTendencia());
        } else if (tema.getDislikes() >= 5000) {
            tema.setPopularidad(new Normal());
        }

    }

    @Override
    public String getEstado(Cancion tema){
        return Icono.ROCKET.texto() + " " +
                tema.getArtista() + " - " +
                tema.getTitulo() + " (" +
                tema.getAlbum() + " - " +
                tema.getAnio() + ")";
    }

}
