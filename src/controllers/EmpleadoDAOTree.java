package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTree implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTree() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado emp : empleados.keySet()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado encontrado = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                encontrado = emp;
                break;
            }
        }

        if (encontrado != null) {
            empleados.remove(encontrado);
            System.out.println("Empleado eliminado.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}
