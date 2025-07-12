package controllers;

import models.Empleado;

public class ControllerDAOTree {

    private EmpleadoDAO empleadoDAO;

    public ControllerDAOTree() {
        this.empleadoDAO = new EmpleadoDAOTree(); // siempre usa TreeMap
    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void listarEmpleados() {
        empleadoDAO.list();
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }
}

