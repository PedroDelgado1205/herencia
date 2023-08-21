import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

public class Operacion {

    public static void ingresar(ArrayList<Persona> miarray){
        Scanner entrada = new Scanner(System.in);
        String nom;
        int eda;
        System.out.print("Nombre: ");
        nom = entrada.nextLine();
        nom = entrada.nextLine();
        System.out.print("Edad: ");
        eda = entrada.nextInt();
        miarray.add(new Persona(nom, eda));
        System.out.println("Hay "+miarray.size()+" agregadas");
    }

    public static void mostrar(ArrayList<Persona> miarray){
        for (Persona obj : miarray){
            System.out.println(obj.nombre+" "+obj.edad);
        }
    }

    public static void promedio(ArrayList<Persona> miarray){
        double pro=0;
        for (Persona obj : miarray){
            pro=pro+ obj.edad;
        }
        double promedio=pro/miarray.size();
        System.out.println("El promedio de edades es "+promedio);
    }

    public static void mayormenor(ArrayList<Persona> miarray){
        int may= miarray.get(0).edad;
        int men= miarray.get(0).edad;
        for (Persona obj : miarray){
            int edad = obj.edad;
            if (edad > may){
                may=edad;
            }
            if (edad < men){
                men = edad;
            }
        }
        System.out.println("la edad mayor es "+may);
        System.out.println("la edad menor es "+men);
    }
}
