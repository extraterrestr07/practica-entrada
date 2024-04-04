public abstract class Base_Empleado {
    int id;
    String nombre;
    String departamento;
    double salario;

    public Base_Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    void mostrarDetalles(){
        System.out.println("Detalles del empleado:");
        System.out.println("Id -> "+this.id);
        System.out.println("Nombre -> "+this.nombre);
        System.out.println("Departamento ->"+this.departamento);
        System.out.println("Salario ->"+this.salario);
    }

    abstract double calcularBono(double valor);

    






}
