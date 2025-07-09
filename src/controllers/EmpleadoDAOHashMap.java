package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    public Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        this.empleados.put(emp, emp);
    }

    @Override
    public void list() {
        System.out.println(empleados);

    }

    @Override
    public void remove(int id) {
        Empleado temporal = new Empleado(id);
        empleados.remove(temporal);

    }

}
