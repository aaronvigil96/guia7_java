package ejercicio_1;

import service.PersonaService;
import entidad.Persona;

public class Ejercicio_1 {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        ps.mostrarAtributos(persona);
    }
    
}
