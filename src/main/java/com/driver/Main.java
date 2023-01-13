package com.driver;

public class Main {

     public static class A{
         public static String meth(){
             return "Invoking method from class A";
         }
     }
     public static class B extends A{
         public static String meth(){
             return "Method is overridden in Extendend class B";
         }
    }
    public void main(String[] args) {
        B x = new B();
        System.out.println(x.meth());
    }

}