import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //ArrayList<String> dias = new ArrayList<String>();
        //dias.add("Lunes");
        //dias.add("Martes");
        //dias.add("Miercoles");
        //dias.add("Jueves");
        //System.out.println(dias.size());

        ArrayList<Persona> personas = new ArrayList<Persona>();
        Persona p = new Persona("Pedro", 20);
        personas.add(p);

        Scanner entrada = new Scanner(System.in);
        int op=0;
        String nom="";
        int eda=0;
        double pro=0;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1.-Agregar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Promedio edad");
            System.out.println("4.-Edad mayor y menor");
            System.out.println("5.-Salir");
            System.out.print("op: ");
            op=entrada.nextInt();
            switch (op){
                case 1:
                    Operacion.ingresar(personas);
                    break;
                case 2:
                    Operacion.mostrar(personas);
                    break;
                case 3:
                    Operacion.promedio(personas);
                    break;
                case 4:
                    Operacion.mayormenor(personas);
                    break;
                default:
            }
        }while (op !=5);
    }

}