package com.azahartech.eventdev.modelo;

public class ReporteDiario {
    private int idReporte = 1;
    // Violación: Nombre de variable en mayúsculas (parece constante)

    public void generar() {
        // Violación: Variable local definida pero no usada

        try {
            System.out.println("Generando reporte " +
                    idReporte);
            if (idReporte == 1) {
                System.out.println("Primer reporte");
            }// Violación: Falta de llaves {}
        } catch (Exception e) {
            e.printStackTrace();
            // Violación: Bloque catch vacío (muy grave)
        }
    }

    public boolean chequear(int x) {
        return x == 1;
        // Violación: Simplificable a 'return x == 1;'
    }
}
