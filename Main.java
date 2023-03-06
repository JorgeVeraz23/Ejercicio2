/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Agregar empleados");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Calcular salario promedio");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    empresa.agregarEmpleado();
                    break;
                case 2:
                    empresa.mostrarEmpleado();
                    break;
                case 3:
                    empresa.buscarEmpleado();
                    break;
                case 4:
                    empresa.eliminarEmpleado();
                    break;
                case 5:
                    empresa.salarioPromedio();
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opcion Invalida.");
            }
            
        }
        
    }
}
