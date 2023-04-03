package service;

import entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    private Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingresa el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingresa el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingresa la edad");
        int edad = entrada.nextInt();
        return new Persona(nombre,apellido,edad);
    }
    
    public void mostrarAtributos(Persona persona){
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad());
    }
}
