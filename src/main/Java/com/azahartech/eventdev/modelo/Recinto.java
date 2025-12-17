package com.azahartech.eventdev.modelo;

public class Recinto {
    private String nombre;
    private String direccion;
    private int aforoMaximo;
    private boolean[] asientosVip;


    public Recinto(String nuevoNombre, String nuevoDireccion, int nuevoAforoMaximo){
        nombre = nuevoNombre;
        direccion = nuevoDireccion;
        aforoMaximo = nuevoAforoMaximo;
        this.asientosVip = new boolean[10];
        for (int i = 0; i < asientosVip.length; i++){
            asientosVip[i] = false;
        }
    }

    public String consultarNombre(){
        return nombre;
    }
    public String consultarDireccion(){
        return direccion;
    }
    public int consultarAforoMaximo(){
        return aforoMaximo;
    }

    public void mostrarInformacion(){
        System.out.printf("El nombre del recinto es %s, la direccion es %s y el aforo maximo es %d%n",nombre,direccion,aforoMaximo);
        System.out.println("Quedan " + contarAsientosVipLibres() + " asientos vips libres");
    }

    public boolean reservarAsientoVip(int numeroAsiento){
        if (numeroAsiento < 1 || numeroAsiento > 10){
            System.out.println("El numero de asiento no esta en el rango");
            return false;
        } if (asientosVip[numeroAsiento -1]){
            System.out.println("Este asiento ya esta reservado");
            return false;
        }
        asientosVip[numeroAsiento - 1] = true;
        return true;
    }

    public int contarAsientosVipLibres(){
        int contador = 0;
        for (int i = 0; i < asientosVip.length; i++){
            if(asientosVip[i] == false){
                contador++;
            }
        }
        return contador;
    }
}

