package com.generation;
import com.generation.paquete2.Animal;
import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Person;

public class Main {
    public static float numerador=10;
    public static int denominador=0;
    public static float division;

    public static void main(String[] args) {

        //Bloques try y catch
        try{
            System.out.println("Antes de hacer la division");
            division=numerador/denominador;
        } catch (ArithmeticException ex){
            division=0;
            System.out.println("Acabas de obtener un gran error " +ex.getMessage());
        }catch(NullPointerException ex){
            division=0;
            System.out.println("Acabas de obtener un gran error " +ex.getMessage());
        }finally {
            System.out.println(division);
            System.out.println("Después de la division");
        }




        //Ejercicio de encapsulamiento
        /*Person person= new Person("Santiago", 33, "102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());*/


        /*CuentaBancaria cuenta=new CuentaBancaria();
        cuenta.setNombre("Sergio");
        cuenta.setClave("TCOS-329");
        cuenta.setSaldo(-5000);
        cuenta.mostrarSaldo();
        cuenta.deposito();
        cuenta.mostrarSaldo();
        cuenta.pagar();
        cuenta.mostrarSaldo();*/

       /*Animal animal=new Animal();
       animal.nombre="Iguana";
       animal.edad=18;
       animal.info();*/

        /*Persona persona=new Persona();
        persona.nombre="Sergio";
        persona.edad=22;
        persona.saludar();*/
    }
}
