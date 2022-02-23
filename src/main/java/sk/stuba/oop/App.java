package sk.stuba.oop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Ahoj svet");
        int[] pole = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<pole.length; i++  ){
            System.out.println("Napis cislo do pola");
            pole[i]=sc.nextInt();
        }
        vypis(pole);
        System.out.println();
        int[] pole2 = {5,5,5,5};
        vypis(pole2);
    }

    private static void vypis(int[] x) {
        for(int i = 0; i<x.length; i++  ){
            System.out.print(x[i]+" ");
        }
    }
}
