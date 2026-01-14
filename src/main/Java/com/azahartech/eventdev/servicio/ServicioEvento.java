package com.azahartech.eventdev.servicio;
import com.azahartech.eventdev.modelo.*;

import java.time.LocalDate;

public class ServicioEvento {
        private Evento eventoDePrueba;
        private Usuario usuarioDePrueba;
        private Evento[] carteleraDestacados;


        public ServicioEvento() {
            eventoDePrueba = new Evento("Evento de Rock", LocalDate.of(2025,12,12), new Recinto("Ferial", "C/ Gobernador", 23), 12, 12, 12);
            usuarioDePrueba = new Usuario("Jonathan", "jonatahn@gmail.com");
            usuarioDePrueba.añadirDetallePago(new DetallePago("VISA", "2312313"));
            carteleraDestacados = new Evento[5];
            for (int i = 0; i < carteleraDestacados.length; i++){
                Evento carteleraDestacado = carteleraDestacados[i];
            }
        }

        public Tique realizarCompra(int cantidad){
            Tique tique = new Tique(eventoDePrueba, usuarioDePrueba);
            double costeTotal = eventoDePrueba.consultarPrecio()*cantidad;
            System.out.println("El precio de la entrada es: " + eventoDePrueba.consultarPrecio());
            System.out.println("El coste total de las entradas a comprar es: "+ eventoDePrueba.consultarPrecio()*cantidad);;
            usuarioDePrueba.consultarDetallePago().realizarPago(costeTotal, "VISA");
            eventoDePrueba.registrarVenta(cantidad);
            return tique;
        }

        public boolean añadirDestacado(Evento evento, int posicion){
            if(posicion >=0|| posicion <=4){
                carteleraDestacados[posicion] = evento ;
                return true;
            } else{
                return false;
            }
        }

        public void mostrarCartelera(){
            for(int i = 0; i < carteleraDestacados.length ; i++){
                if(carteleraDestacados[i] !=null){
                    carteleraDestacados[i].mostrarInformacion();
                } else {
                    System.out.println("Espacio disponible");
                }
            }
        }

        public Evento buscarDestadoMasCaro(){
            double precioMasCaro = 0;
            Evento eventoMasCaro = null;
            for (int i = 0; i < carteleraDestacados.length; i++){
                if (carteleraDestacados[i] !=null){
                  if (carteleraDestacados[i].consultarPrecio()>precioMasCaro){
                      precioMasCaro = carteleraDestacados[i].consultarPrecio();
                      eventoMasCaro = carteleraDestacados[i];
                  }
                }
            }
            return eventoMasCaro;
        }

}

