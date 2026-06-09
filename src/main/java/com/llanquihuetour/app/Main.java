package com.llanquihuetour.app;

import com.llanquihuetour.model.Direccion;
import com.llanquihuetour.model.Empleado;

import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Los alerces", 987, "Santiago", "Maipu");
        Empleado empleado1 = new Empleado(1234, LocalDate.of(2025, Month.JANUARY, 12), true, direccion1);
        empleado1.setNombre("Yerko");
        empleado1.setApellido("Cortes");
        empleado1.setEdad(28);
        empleado1.setGenero("Masculino");

        Direccion direccion2 = new Direccion("Los alerces", 987, "Santiago", "Maipu");
        Empleado empleado2 = new Empleado("Javiera", "Arancibia", 25, "Femenino", 1234, LocalDate.of(2022, Month.AUGUST, 1), true, direccion2);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
    }
}
