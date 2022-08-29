package com.company;

import java.io.Serializable;
import java.security.PrivateKey;

public class Dog <T, E extends Number & Serializable>{ // <псевдоним  существубщего типа> любое английское слово (буква)
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
