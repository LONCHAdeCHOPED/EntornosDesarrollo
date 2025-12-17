package com.azahartech.eventdev.util;

import java.time.LocalDate;

public class UtilidadValidacion {

    public static boolean esEmailValido(String email) {
        if (email.contains("@") && !email.startsWith("@") && email.contains(".")){
            return true;
        }else{
            return false;
        }
    }
    public static boolean esPuntuacionValida(int puntuacion){
        if(puntuacion >= 1 && puntuacion <=5){
            return true;
        } else{
            return false;
        }

    }
    public static boolean esFechaFutura(LocalDate fecha) {
        if (fecha == null) {
            return false;
        } else {
            fecha.isAfter(LocalDate.now());
            return true;
        }
    }
}