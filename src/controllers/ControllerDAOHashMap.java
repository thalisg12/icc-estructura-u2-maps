package controllers;

import models.Empleado;

public class ControllerDAOHashMap {
  private EmpleadoDAO empleadoDAO;

  public ControllerDAOHashMap(EmpleadoDAO empleadoDAO) {
    this.empleadoDAO = new EmpleadoDAOHashMap();
  }

  /**
   * @param emp
   */
  public void agregarEmpleado(Empleado emp) {
    empleadoDAO.add(emp);
  }

  public void list() {
    empleadoDAO.list();
  }

  public void eliminarEmpleado(int id) {
    empleadoDAO.remove(id);
  }
}
