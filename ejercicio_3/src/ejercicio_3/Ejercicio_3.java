/*
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
*/
package ejercicio_3;

import entidad.Cafetera;
import java.util.Scanner;
import service.CafeteraService;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        CafeteraService cafeteraService = new CafeteraService();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Llenar cafetera");
            System.out.println("2)- Servir taza");
            System.out.println("3)- Vaciar cafetera");
            System.out.println("4)- Agregar cafe");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    cafeteraService.llenarCafetera(cafetera);
                    break;
                }
                case 2: {
                    System.out.println("Ingresa el tamaño de la taza");
                    cafeteraService.servirTaza(entrada.nextInt(),cafetera);
                    break;
                }
                case 3: {
                    cafeteraService.vaciarCafetera(cafetera);
                    break;
                }
                case 4: {
                    System.out.println("Ingresá la cantidad de cafe a agregar");
                    cafeteraService.agregarCafe(cafetera, entrada.nextInt());
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
        System.out.println("Gracias por utilizar la aplicación");
    }
    
}
