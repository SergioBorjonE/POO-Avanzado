package com.generation.banco;
import java.util.Scanner;

public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    //Cuando comenzamos el encapsulamiento nos permite ocultar los atributos de clase

    /*Se pueden crear los métodos get y set muy rapido dando click derecho>generate>getter y setter*/

    //Encapsulamineto

    //Metodos get para leer un atributo

    public String getNombre(){
        return this.nombre;
    }

    public String getClave(){
        return this.clave;
    }

    public float getSaldo(){
        return  this.saldo;
    }

    //Metodos set
    //Para modificar el valor del atributo

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSaldo(float saldo) {
        if (saldo<0){
            this.saldo = 0;
        }else{
            this.saldo=saldo;
        }
    }



    //Métodos de funcionalidad
    public void mostrarSaldo(){
        System.out.println("Tu saldo actual es:"+this.saldo);
    }

    public void deposito(){
        System.out.println("Cantidad que va a depositar");
        Scanner sc=new Scanner(System.in);
        float cantidad=sc.nextFloat();
        if (cantidad<0) {
            cantidad = 0;
        }
       float act = getSaldo();
       setSaldo(act + cantidad);
    }

    public void pagar(){
        System.out.println("Cantidad que va a pagar");
        Scanner sc=new Scanner(System.in);
        float cantidad=sc.nextFloat();
       if (cantidad<0) {
           cantidad = 0;
       }
        float act=getSaldo();
        setSaldo(act-cantidad);
    }

}
