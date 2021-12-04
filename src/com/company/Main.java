package com.company;

public class Main {

    public static void main(String[] args){
        String door = door( 12,32);
        System.out.println( door );
        door = door( 12,21);
        System.out.println( door );
        door = door ( 43 ,51);
        System.out.println( door );
        door = door (16,11);
        System.out.println( door );
        door = door (13,14);
        System.out.println( door );
    }
    public static String door ( int age , int temp  ) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30 ){
            return " можно идти гулять";
        } else {
            return " Оставайтесь дома ";

        }
    }
}