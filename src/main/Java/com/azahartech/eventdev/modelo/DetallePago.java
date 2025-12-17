package com.azahartech.eventdev.modelo;

public class DetallePago {
        private String tipoTarjeta;
        private String numeroTarjeta;


        public DetallePago(String nuevoTipoTarjeta, String nuevoNumeroTarjeta){
            tipoTarjeta = nuevoTipoTarjeta;
            numeroTarjeta = nuevoNumeroTarjeta;
        }

        public String consultarTipoTarjeta(){
            return tipoTarjeta;
        }

        public String consultarNumeroTarjeta(){
            return numeroTarjeta;
        }

        public void cambiarTipoTarjeta(String nuevoTipoTarjeta){
            tipoTarjeta= nuevoTipoTarjeta;
        }

        public void cambiarNumeroTarjeta(String nuevoNumeroTarjeta){
            numeroTarjeta = nuevoNumeroTarjeta;
        }

         public void realizarPago(double costeTotal){

        }

         public void realizarPago(double costeTotal, String tipoTarjeta){
            this.realizarPago(costeTotal);
        }



        public void mostrarInformacion(){
            System.out.printf("El tipo de tarjeta es %s y el numero de tarjeta es %s%n",tipoTarjeta, numeroTarjeta);
        }
}
