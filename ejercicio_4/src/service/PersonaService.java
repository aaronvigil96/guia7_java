/*
    Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
    nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
    Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.

    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
*/

package service;

import entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        //Nombre
        do{
            System.out.println("Ingresá un nombre válido:");
            persona.setNombre(entrada.next());
        }while(persona.getNombre() == null);
        //Edad
        do{
            System.out.println("Ingresá una edad válida:");
            persona.setEdad(entrada.nextInt());
        }while(persona.getEdad() == 0);
        //Sexo
        do{
            System.out.println("Ingresá el sexo (H, M o O):");
            persona.setSexo(entrada.next());
        }while(persona.getSexo() == null);
        //Peso
        do{
            System.out.println("Ingresá un peso válido:");
            persona.setPeso(entrada.nextDouble());
        }while(persona.getPeso() == 0.0);
        //Altura
        do{
            System.out.println("Ingresá una altura válida");
            persona.setAltura(entrada.nextDouble());
        }while(persona.getAltura() == 0.0);
        System.out.println("USUARIO CREADO CON ÉXITO");
        return persona;
    }
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >= 18;
    }
    
    public double calcularIMC(Persona persona){
        double imc = persona.getPeso() / (Math.sqrt(persona.getAltura()));
        System.out.println("IMC: " + imc);
        if(imc < 20){
            System.out.println("La persona está por debajo de su peso ideal");
            return -1;
        }else if(imc >= 20 && imc <= 25){
            System.out.println("La persona está en su peso ideal");
            return 0;
        }else {
            System.out.println("La persona tiene sobrepeso");
            return 1;
        }
    }
}
