/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelfollowers;

/**
 *
 * @author estudiantelis
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HotelFollowers {
    static Scanner sc = new Scanner(System.in);
    static List<Empleado> listaDeEmpleados = new ArrayList<>();

    public static void main(String[] args) {
        int options = 0;
        while (options != 3) {
            System.out.println("¿Qué desea hacer? \n1) Agregar personal \n2) Consultar personal \n3) Salir");
            options = sc.nextInt();  // Obtener la opción del usuario

            if (options == 1) {
                System.out.println("Minimo 3 empleados por rol");
                // Crear una instancia de la clase Empleado
                Empleado nuevoEmpleado = new Empleado();

                // Obtener los datos del usuario para el nuevo empleado
                System.out.println("Ingrese el nombre del empleado:");
                nuevoEmpleado.setName(sc.next());

                System.out.println("Ingrese el ID del empleado:");
                nuevoEmpleado.setId(sc.nextInt());

                System.out.println("Ingrese el número de teléfono del empleado:");
                nuevoEmpleado.setPhoneNo(sc.nextInt());

                System.out.println("Ingrese la ubicación del empleado:");
                nuevoEmpleado.setLocation(sc.next());

                System.out.println("Ingrese el rol del empleado:");
                nuevoEmpleado.setRole(sc.next());
                
                System.out.println("Ingrese el horario de lunes a domingo del empleado 6-14, 14-22, 22-6:");
                nuevoEmpleado.setSchedule(sc.next());
                
                listaDeEmpleados.add(nuevoEmpleado);
                System.out.println("Empleado agregado exitosamente!");

            }
            if (options == 2){
                for (Empleado empleado : listaDeEmpleados){
                    System.out.println(empleado);
                }
            
            }
        }
    }
}
