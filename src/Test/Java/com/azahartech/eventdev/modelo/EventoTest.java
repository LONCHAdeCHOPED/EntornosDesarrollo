package com.azahartech.eventdev.modelo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void estaLleno_DebeDevolverFalse_CuandoHayPlazasDisponibles() {
        // Arrange
        Evento evento = new Evento("Evento1", LocalDate.of(2025,12,12),new Recinto("Ferial","Calle gobernador",12),12,100,50); // Aforo 100, inscritos 50
        // Act & Assert
        assertFalse(evento.estaLleno(), "El evento no debería estar lleno");
    }

    @Test
    void estaLleno_DebeDevolverTrue_CuandoLosInscritosIgualanElAforo() {
        // Arrange
        Evento evento = new Evento("Evento2", LocalDate.of(2025,12,12),new Recinto("Ferial","Calle gobernador",12),12,100,100); // Aforo 100, inscritos 100
        // Act & Assert
        assertTrue(evento.estaLleno(), "El evento debería estar lleno en el limite");
    }

    @Test
    void estaLleno_DebeDevolverTrue_CuandoHayMasInscritosQueAforo() {
        // Arrange
        Evento evento = new Evento("Evento3", LocalDate.of(2025,12,12),new Recinto("Ferial","Calle gobernador",12),12,100,101); // Aforo 100, inscritos 101
        // Act & Assert
        assertTrue(evento.estaLleno(), "Un evento sobrepasado debe considerarse lleno");
    }
}
