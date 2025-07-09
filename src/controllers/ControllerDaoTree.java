package controllers;

public class ControllerDAOTree {

    private EmpleadoDAO empleadoDAO;

    public ControllerDAOHashMap(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = new EmpleadoDAOTree();
    }

    /**
     * @param emp
     */
    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void ListarEmpleados() {
        empleadoDAO.list();
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }

}
