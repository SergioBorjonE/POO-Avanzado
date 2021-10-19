package com.generation.ejercicio;

public class Person {
    //atributos
    private String name;
    private int age;
    private String id;

    //Constructor con variables
    //En caso de que no existan validaciones no es necesario usar
    //los métodos set y podemos poner en cambio el this.atributo
    public Person(String name, int age, String id) {
        setName(name);
        setAge(age);
        setId(id);
    }

    //Constructor vacío (por si acaso)
    public Person(){
    }

    //Método get y set para atributo Name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Método get y set para atributo Age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age<0){
            this.age=0;
        }else {
            this.age = age;
        }
    }

    //Método get y set para atributo Id
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if (id.length()<9){
            this.id="Este Id no es valido";
        }else{
            this.id = id;
        }

    }
}
