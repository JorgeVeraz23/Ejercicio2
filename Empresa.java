/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Empresa{
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private Scanner scanner = new Scanner(System.in);
    
    public void agregarEmpleado(){
        System.out.println("Ingrese el nombre del empleado");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del empleado");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del empleaod");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el salario del empleado");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el cargo del empleado");
        String cargo = scanner.nextLine();
        
        Empleado empleado = new Empleado(nombre, apellido, edad, salario, cargo);
        empleados.add(empleado);
        System.out.println("El empleado ha sido agregado correctamente.");
    }
    
    public void mostrarEmpleado(){
        if(empleados.size() == 0){
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("Lista de empleados: ");
        for(Empleado empleado : empleados){
            System.out.println(empleado.getNombre()+""+empleado.getApellido()+ "-"+empleado.getCargo());
        }
    }
    
    public void buscarEmpleado(){
        System.out.println("Ingrese el nombre o apellido del empleado: ");
        String busqueda = scanner.nextLine();
        
        boolean encontrado = false;
        for(Empleado empleado : empleados){
            if(empleado.getNombre().equalsIgnoreCase(busqueda)||empleado.getApellido().equalsIgnoreCase(busqueda)){
                System.out.println("Empleado encontrado: ");
                System.out.println(empleado.getNombre()+" "+empleado.getApellido()+ " - "+ empleado.getCargo());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro ningun empleado con ese nombre o apellido");
        }
    }
    
    public void eliminarEmpleado(){
        System.out.println("Ingrese el nombre o apellido del empleado a eliminar: ");
        String busqueda = scanner.nextLine();
        
        boolean encontrado = false;
        for(Empleado empleado : empleados){
            if(empleado.getNombre().equalsIgnoreCase(busqueda)||empleado.getApellido().equalsIgnoreCase(busqueda)){
                empleados.remove(empleado);
                System.out.println("El empleado ha sido eliminado correctamente.");
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("No se encontro ningun empleado con ese nombre o apellido");
        }
    }
    
    public void salarioPromedio(){
        if(empleados.size() == 0){
            System.out.println("No hay empleados registrados.");
            return;
        }
        double salarioTotal = 0;
        for(Empleado empleado : empleados){
            salarioTotal += empleado.getSalario();
        }
        double salarioPromedio = salarioTotal / empleados.size();
        System.out.println("El salario promedio de los empleados es: "+salarioPromedio);
    }
   
}
