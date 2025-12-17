package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Partido extends Evento{
    private String equipoLocal;
    private String equipoVisitante;

    public Partido(String nuevoNombre, LocalDate nuevoFecha, Recinto nuevoRecinto, int nuevoPrecio, String nuevoEquipoLocal, String nuevoEquipoVisitante){
        super(nuevoNombre, nuevoFecha, nuevoRecinto, nuevoPrecio);
        equipoLocal = nuevoEquipoLocal;
        equipoVisitante = nuevoEquipoVisitante;
    }

    public String consultarEquipoLocal(){
        return equipoLocal;
    }
    public String consultarEquipoVisitante(){
        return equipoVisitante;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.printf("Los equipos que se enfrentan son: %s",equipoLocal + " y " + equipoVisitante);
    }
}


