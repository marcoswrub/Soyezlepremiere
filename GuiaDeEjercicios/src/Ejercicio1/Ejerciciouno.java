package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma */
public class Ejerciciouno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese dos valores para sumar");
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        System.out.println("La suma de los valores da " + sumar(A, B));

    }

    public static int sumar(int A, int B) {
        return (A + B);
    }

}
