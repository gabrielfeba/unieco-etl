package com.unieco.etl.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateUtils {


    public static LocalDate stringToLocalDateHyphen(String string) {
        if (string == null) return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(string, formatter);
    }



    public static LocalDate convertGenericDate(String genericDate) {
        return stringToLocalDateHyphen(String.format("%02d-%02d-%04d",
                Stream.of(genericDate.split("-"))
                .map(Long::parseLong).toArray()));
    }
}


