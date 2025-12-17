package com.azahartech.eventdev.modelo;
import java.time.LocalDate;
import java.util.UUID;


public class Tique {
        private String id;
        private Evento evento;
        private Usuario comprador;
        private LocalDate fechaCompra;
        private static int numeroDeTiques = 0;

        public Tique(Evento nuevoEvento, Usuario nuevoComprador){
            id = UUID.randomUUID().toString();
            evento = nuevoEvento;
            comprador = nuevoComprador;
            fechaCompra = LocalDate.now();
            numeroDeTiques++;

        }

        public static int obtenerTotalTiques(){
            return numeroDeTiques;
        }

        public void mostrarInformacion(){
            System.out.printf("El dia de la compra es %s y el id de la compra es %s\n", fechaCompra, id);
            evento.mostrarInformacion();
            comprador.mostrarInformacion();
        }

}
