

import java.util.ArrayList;
import java.util.UUID;
import java.util.Iterator;

public class Departamento {
    private String id;
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // --- Getters ---
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public ArrayList<Empleado> getEmpleados() { return empleados; }

    // --- Setters ---
    public void setNombre(String nombre) { this.nombre = nombre; }

    // --- Métodos de gestión ---
    public void agregarEmpleado(Empleado empleado) {
        if (!this.empleados.contains(empleado)) {
            this.empleados.add(empleado);
            empleado.asignarDepartamento(this);
        }
    }

    public void eliminarEmpleado(String idEmpleado) {
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getId().equals(idEmpleado)) {
                iterator.remove();
                empleado.asignarDepartamento(null);
                return;
            }
        }
    }
    
    public double calcularNominaTotal() {
        double sumaSalariosFinales = 0;
        for (Empleado empleado : empleados) {
            sumaSalariosFinales += empleado.calcularSalarioFinal();
        }
        return sumaSalariosFinales;
    }
    
    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }

    public void generarReporteDesempeño() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarReporteDesempeño'");
    }
}