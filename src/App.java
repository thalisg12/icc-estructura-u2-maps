import controllers.ControllerDAOHashMap;
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTree;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Thalia Sagbay"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {

        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        ControllerDAOHashMap empleadoControllerHash = new ControllerDAOHashMap(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTree();
        EmpleadoContoller empleadoControllerTree = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(4, "Pedro", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(5, "Juan", "Dev");
        Empleado emp4 = new Empleado(3, "Maria", "Dev");
        Empleado emp5 = new Empleado(1, "Juan", "Dev");



        empleadoControllerHash.agregarEmpleado(emp1);
        empleadoControllerHash.agregarEmpleado(emp2);
        empleadoControllerHash.agregarEmpleado(emp3);
        empleadoControllerHash.agregarEmpleado(emp4);
        empleadoControllerHash.agregarEmpleado(emp5);

        empleadoControllerTree.agregarEmpleado(emp1);
        empleadoControllerTree.agregarEmpleado(emp2);
        empleadoControllerTree.agregarEmpleado(emp3);
        empleadoControllerTree.agregarEmpleado(emp4);
        empleadoControllerTree.agregarEmpleado(emp5);

        empleadoControllerHash.list();
        empleadoControllerHash.remove(2);
        empleadoControllerHash.list();

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
