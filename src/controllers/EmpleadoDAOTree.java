package controllers;

import models.Empleado;

public class EmpleadoDAOTree implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTree() {
        this.empleados = Map;
    }

    @Override
    public void add(Empleado emp) {
        emp.add();

    }

    @Override
    public void list() {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(int id) {
        // TODO Auto-generated method stub

    }

}
