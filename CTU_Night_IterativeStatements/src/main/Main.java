package main;
import java.util.Scanner;

//Iterative Statements
public class Main {
    
    static Scanner inputData = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter value1: ");
        int value1 = inputData.nextInt();
        //do-while loop
        //pre - implementary loop
        do{
            System.out.println("Hello World!!!");
            value1++;//value1 = value1 + 1;
        }while(value1<=5);
        
        System.out.print("Enter value2: ");
        int value2 = inputData.nextInt();
        //while loop
        //post - implementary loop
        while(value2<=5){
            System.out.println("Hello Java!!!!");
            value2++;
        }
        
        System.out.print("Enter value3: ");
        int value3 = inputData.nextInt();
        //for loop
        //initialization; condition; updation
        for(int i = value3; i <= 5; i++){
            System.out.println("Hello me!!!!");
        }
        
        int[] arr = {1, 2, 3, 4, 5};
        //for-each loop
        //arrays
        for (int i : arr) {
            System.out.println(i); 
        }
    }
}
