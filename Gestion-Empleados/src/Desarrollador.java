import java.util.ArrayList;
import java.util.Scanner;

public class Desarrollador extends Base_Empleado implements EvaluacionDesempeno{
    ArrayList<String> lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario, ArrayList<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    double calcularBono() {
        if(evaluarDesempeno().equals("BUENO"))
            return salario;
        else if(evaluarDesempeno().equals("REGULAR"))
            return salario/2;
        else
            return 0;
    }

    @Override
    void mostrarDetalles() {
        // TODO Auto-generated method stub
        super.mostrarDetalles();
        System.out.println("Lenguajes dominados: ");
        for (String string : lenguajes) {
            System.out.println("->"+string);
        }
    }

    @Override
    public String evaluarDesempeno() {
        if (lenguajes.size()>=7) 
            return "BUENO";
        else if (lenguajes.size()>=4) 
            return "REGULAR";
        else
            return "NADA";
    }

    

}
