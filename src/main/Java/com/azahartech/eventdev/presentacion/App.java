package com.azahartech.eventdev.presentacion;
import com.azahartech.eventdev.modelo.*;
import com.azahartech.eventdev.servicio.ServicioEvento;
import com.azahartech.eventdev.util.UtilidadValidacion;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * El proposito de la clase App es:
 * Gestionar eventos que incluye venta y compra de entradas, detalles del evento y la compra.
 * Simular un login, verificar que todos los datos sean correctos.
 *
 *
 * @author Antonio de la torre
 * @version 1.0.
 *
 * */

public class App {
    public static void main(String[] args) {
 /**
        // CONSULTAS USUARIO
        System.out.println("----------- DETALLES DEL USUARIO -----------");
        Usuario pedro = new Usuario("Pedro", "pedro@gmail");
        System.out.println("Consulta del nombre de usuario: "+pedro.consultarNombreUsuario());
        System.out.println("Consulta del Email: "+pedro.consultarEmail());
        System.out.println("Consulta del ID del usuario: "+pedro.consultarId());
        System.out.println("- - - - - - - - - - - - - - - - - -");
        pedro.mostrarInformacion();
        pedro.cambiarEmail("jonathan@gmail");
        pedro.cambiarNombreUsuario("Jonathan");
        System.out.println("El nombre de usuario ha cambiado a: "+pedro.consultarNombreUsuario());
        System.out.println("El email ha cambiado a "+pedro.consultarEmail());
        System.out.println("- - - - - - - - - - - - - - - - - -");

        // CONSULTAS RECINTO
        System.out.println("----------- DETALLES DEL RECINTO -----------");
        Recinto recinto = new Recinto("Recinto Ferial", "Calle gobernador", 40);
        System.out.println("Consulta nombre de recinto: "+recinto.consultarNombre());
        System.out.println("Consulta direccion del recinto: "+recinto.consultarDireccion());
        System.out.println("Consulta aforo maximo del recinto: "+recinto.consultarAforoMaximo());
        recinto.mostrarInformacion();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        // CONSULATAS ENVENTO
        System.out.println("----------- DETALLES DEL EVENTO -----------");
        Evento rock = new Evento("Evento de Rock", LocalDate.of(2025,12,12), recinto, 12);
        System.out.println("El nombre del evento es: "+rock.consultarNombre());
        System.out.println("La fecha del evento es: "+rock.consultarFecha());
        System.out.println("El recinto del evento es: "+rock.consultarRecinto().consultarNombre());
        rock.mostrarInformacion();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        //CONSULTAS DETELLES PAGO
        System.out.println("----------- DETALLES DE PAGO -----------");
        DetallePago pago = new DetallePago("VISA","2313131313");
        System.out.println("El tipo de tarjeta es: "+pago.consultarTipoTarjeta());
        System.out.println("El numero de tarjeta es: "+pago.consultarNumeroTarjeta());
        pedro.añadirDetallePago(pago);
        pedro.mostrarInformacion();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        System.out.println("----------- CAMBIO DE TARJETA -----------");
        pago.cambiarTipoTarjeta("MASTERCARD");
        pago.cambiarNumeroTarjeta("7777");
        System.out.println("El numero de tarjeta ahora es " + pago.consultarNumeroTarjeta());
        System.out.println("El tipo de tarjeta ahora es " + pago.consultarTipoTarjeta());
        System.out.println("- - - - - - - - - - - - - - - - - -");


        System.out.println("----------- TIQUE -----------");
        Tique tique = new Tique(rock, pedro);
        Comentario comentario = new Comentario(rock, pedro, 2, "No me ha gustado");
        System.out.println("- - - - - - - - - - - - - - - - - -");
        tique.mostrarInformacion();
        System.out.println("El numero de tiques creados es: "+Tique.obtenerTotalTiques());
        System.out.println("- - - - - - - - - - - - - - - - - -");
        comentario.mostrarInformacion();

        ServicioEvento servicio = new ServicioEvento();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta una cantidad de entradas a comprar: ");
        Tique tique3 = servicio.realizarCompra(teclado.nextInt());
        tique3.mostrarInformacion();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Concierto ConciertoRock = new Concierto("Rock",LocalDate.of(2025,12,12),recinto,12,"Zeppelin");
        ConciertoRock.mostrarInformacion();
        System.out.println("El nombre del concierto es: " + ConciertoRock.consultarNombre());
        System.out.println("La banda principal es: "+ ConciertoRock.consularBandaPrincipal());
        System.out.println("- - - - - - - - - - - - - - - - - -");
        Partido futbol = new Partido("Champions", LocalDate.of(2025,12,12),recinto,20,"Vila-real", "Castellón");
        futbol.mostrarInformacion();
        System.out.println("El nombre del partido es: " + futbol.consultarNombre());
        System.out.println("El equipo local es: " + futbol.consultarEquipoLocal());

**/

/**
        Scanner teclado = new Scanner(System.in);
        int seleccion;

        System.out.println("- - - - - - - - - - - - - -");
        System.out.println("- - CREACION DE EVENTO - - ");
        System.out.println("- - - - - - - - - - - - - -");

        do {
            System.out.println("Selecciona una opcion del tipo de evento para crear");
            System.out.println("1. Crear concierto");
            System.out.println("2. Crear Partido");
            System.out.print("Elige una opcion: ");
            seleccion = teclado.nextInt();
            teclado.nextLine();
            if (seleccion != 1 || seleccion !=2);{
                System.out.println("Opcion no valida");
            }
        } while (seleccion != 1 || seleccion != 2);

        System.out.println("Nombre del evento: ");
        String nombre = teclado.nextLine();
        System.out.println("Fecha del evento ");
        LocalDate fecha = LocalDate.parse(teclado.nextLine());
        boolean validacionFecha = UtilidadValidacion.esFechaFutura(fecha);
        System.out.println("La fecha es válida: " +validacionFecha);
        System.out.println("Nombre del recinto: ");
        String nombreRecinto = teclado.nextLine();
        System.out.println("Direccion del recinto");
        String direccionRecinto = teclado.nextLine();
        System.out.println("Aforo del recinto: ");
        int aforoRecinto = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Precio del evento: ");
        int precioEvento = teclado.nextInt();
        teclado.nextLine();

        Recinto recinto = new Recinto(nombreRecinto, direccionRecinto, aforoRecinto);
        Evento nuevoEvento = null;

        switch (seleccion){
            case 1:
                System.out.println("Nombre de la banda: ");
                String bandaPrincipal = teclado.nextLine();
                nuevoEvento = new Concierto(nombre, fecha, recinto, precioEvento, bandaPrincipal);
                break;

            case 2:
                System.out.println("Dime el equipo local: ");
                String equipoLocal = teclado.nextLine();
                System.out.println("Dime el equipo visitante: ");
                String equipoVisitante = teclado.nextLine();
                nuevoEvento = new Partido(nombre, fecha, recinto, precioEvento, equipoLocal, equipoVisitante);
                break;

            default:
                System.out.println("Opción no valida");
                return;
        }
        System.out.println("El evento ha sido creado");
        nuevoEvento.mostrarInformacion();

        

        teclado.close();


**/
        Recinto recintoprueba = new Recinto("Ferial","Gobernador",12);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos asientos a reservar");
        int numeroAsiento = teclado.nextInt();
        int asiento;
        while (numeroAsiento>0){
            System.out.println("Asientos a reservar: ");
            asiento = teclado.nextInt();
            teclado.nextLine();
            if (recintoprueba.reservarAsientoVip(asiento)){
                numeroAsiento--;
            }
        }
        recintoprueba.mostrarInformacion();

        ServicioEvento servicioPrueba = new ServicioEvento();
        Evento evento1 = new Evento("Evento 1",LocalDate.of(2025,12,12),recintoprueba,12);
        Evento evento2 = new Evento("Evento 2",LocalDate.of(2025,12,12),recintoprueba,21);
        Evento evento3 = new Evento("Evento 3",LocalDate.of(2025,12,12),recintoprueba,31);
        servicioPrueba.añadirDestacado(evento1,0);
        servicioPrueba.añadirDestacado(evento2,2);
        servicioPrueba.añadirDestacado(evento3,4);
        servicioPrueba.mostrarCartelera();

    }
}