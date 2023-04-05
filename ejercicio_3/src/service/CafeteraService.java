/*
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package service;

import entidad.Cafetera;

public class CafeteraService {
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera");
    }
    
    public void servirTaza(int taza, Cafetera cafetera){
        if(taza <= cafetera.getCantidadActual()){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Sirviendo el cafe...");
        }else {
            cafetera.setCantidadActual(0);
            System.out.println("No alcanza para llenar");
        }
        System.out.println("Le quedan " + cafetera.getCantidadActual());
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        System.out.println("Vaciando cafetera...");
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera, int cantidad){
        System.out.println("La capacidad maxima actual es: " + cafetera.getCapacidadMaxima());
        System.out.println("La suma sería: " + (cafetera.getCantidadActual() + cantidad));
        if(cafetera.getCapacidadMaxima() > cafetera.getCantidadActual() + cantidad){
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
            System.out.println("El café disponible es " + cafetera.getCantidadActual());
        }else {
            System.out.println("No se puede agregar, capacidad maxima alcanzada");
        }
    }
}
