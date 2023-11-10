package org.example;

public class EnTendencia implements IPopularidad {
    @Override
    public void popularizar(Cancion tema) {
        if (tema.getRep24h() == 0) {
            tema.setPopularidad(new Normal());
        }

    }

    @Override
    public String getEstado(Cancion tema) {
        return Icono.FIRE.texto() + " " +
                tema.getTitulo() + " - " +
                tema.getArtista() + " (" +
                tema.getAlbum() + " - " +
                tema.getAnio() + ")";
    }
}
