package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private Recinto recinto;
    private int precio;
    private int aforoMaximo;
    private int inscritos;

    public Evento(String nuevoNombre, LocalDate nuevoFecha, Recinto nuevoRecinto, int nuevoPrecio, int nuevoAforoMaximo, int nuevoInscritos){
        nombre = nuevoNombre;
        fecha = nuevoFecha;
        recinto = nuevoRecinto;
        precio = nuevoPrecio;
        aforoMaximo = nuevoAforoMaximo;
        inscritos = nuevoInscritos;
    }

    public String consultarNombre(){
        return nombre;
    }
    public LocalDate consultarFecha(){
        return fecha;
    }
    public Recinto consultarRecinto(){
        return recinto;
    }

    public int consultarPrecio(){
        return precio;
    }

    public void registrarVenta(int cantidad){
        System.out.printf("Has vendido %d entradas\n", cantidad);
    }

    public void mostrarInformacion(){
        System.out.printf("El nombre del evento es %s, la fecha del evento es el %s%n",nombre,fecha);
        recinto.mostrarInformacion();
    }

    public boolean estaLleno() {
        return inscritos >= aforoMaximo;
    }

}
