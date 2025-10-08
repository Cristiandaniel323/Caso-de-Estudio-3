import java.util.UUID;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;
    protected Departamento departamento;

    public Empleado(String nombre, double salarioBase) {
        this.id = UUID.randomUUID().toString().substring(0, 8); // metodo para generar un ID de maximo 8 Caracteres
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.departamento = null; // Inicialmente sin departamento
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public abstract double calcularSalarioFinal();

    // Mostrar detalles del Empleado
    public void mostrarDetalles() {
        String departamentoNombre = (departamento != null) ? departamento.getNombre() : "Sin asignar";
        System.out.println("------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Departamento: " + departamentoNombre);
    }
}