package it.unimi.di.prog2.h07;

import java.util.Scanner;

/** Classse client per {@link MathFunctions} */
public class MathFunctionsClient {

    /** . */
    private MathFunctionsClient() {}

    /**
     * <p> Legge da standard input una sequenza di numeri in virgola mobile e stampa, quando
     * possibile, un'approssimazione della relativa radice quadrata.
     * 
    */
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            while(sc.hasNextDouble()) {
                double radicand = sc.nextDouble();
                try {
                    double root = MathFunctions.sqrt(radicand);
                    System.out.println(root);
                } catch (IllegalArgumentException e){
                    System.out.println("Non è positivo: " + radicand);
                }
                

            }
        }
    }
}
