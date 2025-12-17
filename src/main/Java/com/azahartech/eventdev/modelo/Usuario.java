package com.azahartech.eventdev.modelo;

import java.util.UUID;

public class Usuario {
    private String id;
    private String nombreUsuario;
    private String email;
    private DetallePago detallePago;

    public Usuario(String nuevoNombreUsuario, String nuevoEmail){
       id = UUID.randomUUID().toString();
       nombreUsuario = nuevoNombreUsuario;
       email = nuevoEmail;
    }
    
    public String consultarId() {
        return id;
    }

    public String consultarNombreUsuario() {
        return nombreUsuario;
    }

    public void cambiarNombreUsuario(String nuevoNombreUsuario) {
        nombreUsuario = nuevoNombreUsuario;
    }

    public String consultarEmail() {
        return email;
    }

    public void cambiarEmail(String nuevoEmail) {
        email = nuevoEmail;
    }

    public void añadirDetallePago(DetallePago nuevoDetallePago){
        detallePago = nuevoDetallePago;
    }

    public DetallePago consultarDetallePago(){
        return detallePago;
    }

    public void mostrarInformacion(){
        System.out.printf("El ID es %s%nEl nombre de usuario es %s y el email es %s%n",id,nombreUsuario,email);
        if (!(detallePago==null)){
            detallePago.mostrarInformacion();
        }
    }

}
