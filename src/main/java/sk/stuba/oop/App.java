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
        for(int i = 0; i<pole.length; i++  ){
            System.out.print(pole[i]+" ");
        }
    }
}
