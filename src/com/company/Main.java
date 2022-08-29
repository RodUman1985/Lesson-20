package com.company;

import java.util.Calendar;

public class Main {
    class  F extends Number{

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }



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
        Dog<Integer, Long> d4= new Dog<>();


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
