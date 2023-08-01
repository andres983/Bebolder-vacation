package com.beboldervacation.domain.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BusinessDaysUtil {

    public static int calcularDiasHabiles(String fechaInicialStr, String fechaFinalStr) {

        LocalDate fechaInicial = LocalDate.parse(fechaInicialStr);
        LocalDate fechaFinal = LocalDate.parse(fechaFinalStr);

        int diasHabiles = 0;
        LocalDate fechaActual = fechaInicial;

        // Iterar desde la fecha inicial hasta la fecha final
        while (!fechaActual.isAfter(fechaFinal)) {
            // Verificar si el día actual es un día laboral (lunes a viernes)
            if (fechaActual.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    fechaActual.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasHabiles++;
            }
            // Incrementar la fecha actual en un día
            fechaActual = fechaActual.plus(1, ChronoUnit.DAYS);
        }

        return diasHabiles;
    }
}
