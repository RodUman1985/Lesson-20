package com.company;

import java.security.PrivateKey;

public class Dog <T, E extends Number>{ // <псевдоним  существубщего типа> любое английское слово (буква)
   // В качестве псевдонима может использоваться только ссылочный тип (все кроме примитивных типов)
    public T id;
    private   E gender;
    public  String  name;

 public E getGender() {
     return this.gender;
 }
 public void setGender(E gender){
     this.gender=gender;
 }
 public <K> void haw (K voice){
     System.out.println(voice);

 }
}
