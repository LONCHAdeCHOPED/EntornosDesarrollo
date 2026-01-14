package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Concierto extends Evento{
    private String bandaPrincipal;
    public Concierto(String nuevoNombre, LocalDate nuevoFecha, Recinto nuevoRecinto, int nuevoPrecio, int nuevoAforoMaximo, int nuevoInscritos, String nuevoBandaPrincipal){
        super(nuevoNombre, nuevoFecha, nuevoRecinto, nuevoPrecio, nuevoAforoMaximo, nuevoInscritos);
        bandaPrincipal = nuevoBandaPrincipal;
    }

    public String consularBandaPrincipal(){
        return bandaPrincipal;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.printf("El banda principal es: %s",bandaPrincipal);
    }
}
