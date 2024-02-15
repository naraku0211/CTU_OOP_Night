package main;

import java.util.Scanner;

public class Main {

    //BufferedReader, Scanner
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.print("Input value: ");
        int value = input.nextInt();
        System.out.println("Print value: " + value);
        //System.out.printf("%d", value);
        
    }
    
}
