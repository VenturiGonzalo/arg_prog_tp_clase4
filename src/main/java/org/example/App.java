package org.example;


import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args ) {
        //Cargo el tema
        Cancion theScientist = new Cancion("The Scientist", "A Rush of Blood to the head","Coldplay",2002);

        // 1. “The Scientist” recién se lanza (tiene popularidad normal).
        System.out.println("Se lanza el tema:");
        System.out.println(theScientist.getEstado() + "\n");

        // 2. “The Scientist” está en auge por superar el mínimo de reproducciones esperadas.
        System.out.println("Supera las 10000 reproducciones totales:");
        theScientist.setRepTotales(10001);
        System.out.println(theScientist.getEstado() + "\n");

        // 3. “The Scientist” baja del auge por tener muchos dislikes.
        System.out.println("LLega a los 5000 dislikes porque es un corchazo:");
        theScientist.setDislikes(5000);
        System.out.println(theScientist.getEstado() + "\n");

        // 4. “The Scientist” es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema
        System.out.println("Bajan los dislikes, suben los likes y las reproducciones!!!!");
        theScientist.setDislikes(4999);
        theScientist.setRepTotales(50001);
        theScientist.setLikes(20001);
        System.out.println(theScientist.getEstado() + "\n");

        //5. “The Scientist” era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas.
        System.out.println("Ya nadie lo escucha para no deprimirse");
        theScientist.setRep24h(0);
        System.out.println(theScientist.getEstado() + "\n");

    }

}
