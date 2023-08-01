package com.beboldervacation.persistence.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UtilDate {

    public static LocalDate convertStringToDate(String fechaIngreso) throws ParseException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaIngreso, formato);

        System.out.println("fecha >>>>>> " + fecha);
        return fecha;

    }


}
