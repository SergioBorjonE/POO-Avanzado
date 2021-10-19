package com.generation;
import com.generation.paquete2.Animal;
import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Person;

public class Main {

    public static void main(String[] args) {
        Person person= new Person("Santiago", 33, "102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());


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
