public class EmpleadoTemporal extends Empleado {
    private int duracionContratoMeses;

    public EmpleadoTemporal(String nombre, double salarioBase, int duracionContratoMeses) {
        super(nombre, salarioBase);
        this.duracionContratoMeses = duracionContratoMeses;
    }

    public int getDuracionContratoMeses() {
        return duracionContratoMeses;
    }

    public void setDuracionContratoMeses(int duracionContratoMeses) {
        this.duracionContratoMeses = duracionContratoMeses;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase; 
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de Contrato: Temporal");
        System.out.println("Duración del Contrato: " + duracionContratoMeses + " meses");
        System.out.println("Salario : $" + String.format("%.2f", calcularSalarioFinal()));
        System.out.println("______________________________");
    }
}
