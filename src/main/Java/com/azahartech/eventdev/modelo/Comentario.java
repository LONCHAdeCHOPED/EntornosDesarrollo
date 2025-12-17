package com.azahartech.eventdev.modelo;

public class Comentario {
    private Evento evento;
    private Usuario autor;
    private int puntuacion;
    private String comentario;

    public Comentario(Evento nuevoEvento, Usuario nuevoAutor, int nuevoPuntuacion, String nuevoComentario){
        evento = nuevoEvento;
        autor = nuevoAutor;
            if(puntuacion <=5 || puntuacion >=1){
                puntuacion = nuevoPuntuacion;
            } else {
                System.out.println("La puntuacion no es correcta, tiene que se del 1 al 5");
            }
            comentario = nuevoComentario;
    }

    public Evento consultarEvento(){
        return evento;
    }

    public Usuario consultarAutor(){
        return autor;
    }

    public int consultarPuntuacion(){
        return puntuacion;
    }

    public String consultarComentario(){
        return comentario;
    }

    public void mostrarInformacion(){
        System.out.printf("La puntuacion del evento es %d y el comentario es '%s'\n", puntuacion, comentario);
        evento.mostrarInformacion();
        autor.mostrarInformacion();
    }
}
