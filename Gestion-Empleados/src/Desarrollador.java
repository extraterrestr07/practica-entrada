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
        if(lenguajes.size()<4)
            return 
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
        Scanner entrada=new Scanner(System.in);
        int valorEmpleado=-1;
        do{
        System.out.println("Ingrese la cantidad de estrellas del empleado de 1 a 10: ");
        valorEmpleado=entrada.nextInt();
        }
        while(valorEmpleado>10||valorEmpleado<0);

        if (len>=7) 
            return "BUENO";
        else if (valorEmpleado<=4) 
            return "REGULAR";
        else
            return "NADA";

    }

    

}
