
package menumain;

import java.util.Scanner;

public class MenuMain {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionEstudiante gestionEstudiantes1 = new GestionEstudiante (5);

        while(true) {
            System.out.println("ADMINISTRADOR DE ESTUDIANTES");
            System.out.println("por favor, seleccione una opcion de 1-5 ");
            System.out.println("1 Agregar estudiante");
            System.out.println("2 Mostrar todos los estudiantes");
            System.out.println("3 Buscar Estudiante por Nombre");
            System.out.println("4 Calcular el promedio general");
            System.out.println("5 Salir del menu");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();  

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese el promedio del estudiante: ");
                    double promedio = sc.nextDouble();
                    sc.nextLine(); 
                    
                    Estudiante estudiante = new Estudiante(nombre, edad, promedio);
                    gestionEstudiantes1.agregarEstudiante(estudiante);
                    break;

                case 2:
                    gestionEstudiantes1.mostrarEstudiantes();
                    break;

                case 3:

                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    gestionEstudiantes1.buscarEstudiantePorNombre(nombreBuscar);
                    break;
                case 4:
                    
                    gestionEstudiantes1.calcularPromedioGeneral();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    return;
                default:
                    System.out.println("Opcion no valida. Dale de nuevo.");
            }
        }
    }
}

   
    