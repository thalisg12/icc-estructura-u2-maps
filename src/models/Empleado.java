package models;

import controllers.EmpleadoDAOHashMap;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;

    }

    @Override
    public int hashCode() {
        return id + name.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        return true;
    }

    @Override
    public int compareTo(Empleado o) {

        int comparacionId = Integer.compare(id, o.id);
        if (comparacionId != o.id) {
            return comparacionId;
        }
        return name.compareToIgnoreCase(o.name);

    }

    public void add(EmpleadoDAOHashMap empleadoDAOHashMap) {
        empleadoDAOHashMap.empleados.put(this, this);

    }

}