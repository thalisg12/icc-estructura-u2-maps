package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");

    }

    public void runHashMap() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop"); // las llaves deben ser unicas
        mapa.put("003", "Celular");
        mapa.put("003", "PC"); // actualiza cuando exixte la variable

        System.out.println("-----------------runHashMap---------------");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String codigo : mapa.keySet()) {
            System.out.println(mapa.get(codigo));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));

    }

    public void runLinkedHashMap() {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Steve"); // garantiza el orden de ingreso
        mapa.put(2, "Andres");
        mapa.put(3, "Daniel");
        mapa.put(4, "Erika");
        mapa.put(5, "Maria");

        System.out.println("-----------------runLinkedHashMap------------------");

        mapa.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        });

    }

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap<>();

        items.put(3, "carro"); // garantiza el orden- primitivas: orden ascendete objeto: el que diga el
                               // comparador
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println("-----------------runTreeMap------------------");

        items.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        });
    }

    public void runHashMapObj() {
        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println("-------------------runHashMapObj-----------------");

        for (Empleado emp : empleados.keySet()) {
            Integer salario = empleados.get(emp);
            System.out.println("Empleado: " + emp + ", Salario: " + salario);
        }

    }

    public void runTreeMapObj() {
        Map<Empleado, Integer> empleados = new TreeMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.println("-------------------runTreeMapObj-----------------");

        for (Empleado emp : empleados.keySet()) {
            Integer salario = empleados.get(emp);
            System.out.println("Empleado: " + emp + ", Salario: " + salario);
        }

    }

}