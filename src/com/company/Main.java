package com.company;

public class Main {

    public static void main(String[] args) {
	// Generics (обопщения)
        Dog<String,Float> d1=new Dog<>();// <> справа не обязательны
        d1.id="asd";
        d1.setGender(12);
        d1.id.toLowerCase();
        Dog<Integer,Short> d2=new Dog<>();
        d2.id=12;
        d2.setGender((short)7);
        Dog d3 = new Dog();
        d2.<String>haw("hello");// <>  слева не обязательны

        // если тип псевдонима явно не указан  при создании объекта , то будет указываться класс Object
/*Dog d1=new Dog();
d1.id=12;
Dog d2=new Dog();
d2.id= "some id";

        System.out.println(getIdLength(d1));
        System.out.println(getIdLength(d2));
    }
    public static int getIdLength(Dog dog){
        if (dog.id instanceof String){
            return ((String) dog.id).length();
        }
        return 4;*/

    }
}
