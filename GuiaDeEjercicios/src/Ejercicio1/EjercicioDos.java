package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioDos {

    // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla
    public static void main(String[] args) {
       
       
        Scanner escribir = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.ENGLISH);
        System.out.println("Ingrese su nombre ");
        String nombre = escribir.next();
        
        System.out.println("Su nombre es "+ nombre );
        
        
    }

}
