public class EmpleadoPermanente extends Empleado {
    private double bonoAnual;

    public EmpleadoPermanente(String nombre, double salarioBase, double bonoAnual) {
        super(nombre, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonoAnual;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de Contrato: Permanente");
        System.out.println("Bono por año: $" + String.format("%.2f", bonoAnual));
        System.out.println("Salario : $" + String.format("%.2f", calcularSalarioFinal()));
        System.out.println("_________________________________");
    }
}
