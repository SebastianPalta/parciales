
package menumain;


import java.util.Scanner;


public class GestionEstudiante {
    private Estudiante[] estudiantes;
    private int cantidadActual;
    private final int capacidadMaxima;

public GestionEstudiante(int capacidadMaximaDeEstudiantes) {
        this.capacidadMaxima   = capacidadMaximaDeEstudiantes;
        this.estudiantes =new Estudiante[capacidadMaxima];
        this.cantidadActual = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadActual <capacidadMaxima) {
            estudiantes[cantidadActual] = estudiante;
            cantidadActual++;
        } else {
            System.out.println("No hay cupos para mas estudiantes.");
        }
    }
    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No se encuentran estudiantes registrados.");
        } else {
            for (int i = 0; i < cantidadActual; i++) {
                Estudiante estudiante = estudiantes[i];
                System.out.println("Nombre: "+ estudiante.getNombre());
                System.out.println("edad: " +   estudiante.getEdad());
                System.out.println("Promedio: " + estudiante.getPromedio());
            }
        }
    }
    public void buscarEstudiantePorNombre(String nombre) {
        boolean encontrado=false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                Estudiante estudiante = estudiantes[i];
                System.out.println("Estudiante identificado:");
                System.out.println("Nombre: " +  estudiante.getNombre());
                System.out.println("Edad: "+ estudiante.getEdad());
                System.out.println("Promedio: "  + estudiante.getPromedio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado en el sistema.");
        }
    }
    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No se encuentran estudiantes registrados");
            return;
        }
        double sumaPromedios = 0;
        for (int i = 0; i < cantidadActual; i++) {
            sumaPromedios += estudiantes[i].getPromedio();
        }
        double promedioGeneral = sumaPromedios / cantidadActual;
        System.out.println("Promedio general: " + promedioGeneral);
    }
}

    

