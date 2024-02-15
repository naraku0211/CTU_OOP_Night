package main;

//Conditional Statements/Structures

import java.util.Scanner;

public class Main {
    
    static Scanner inputData = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Input value1: ");
        int value1 = inputData.nextInt();
        //if statement
        if(value1 == 5){
            System.out.println("Hello World!!!");
        }
        
        System.out.print("Input value2: ");
        int value2 = inputData.nextInt();
        //if-else statement
        if(value2 == 10){
            System.out.println("Hello Java!!!");
        }
        else{
            System.err.println("The input value is not equal 10.");
        }
        
        String place, food;
        System.out.print("Input value3: ");
        int value3 = inputData.nextInt();
        //nested if-else statement
        if(value3 == 20){
            System.out.print("Enter place: ");
            place = inputData.next();
            if(place.equals("cebu")){
                System.out.println(place);
            }
            else{
                System.err.println("Wrong input.");
            }
        }
        else{
            System.out.print("Enter food: ");
            food = inputData.next();
            if(food.equals("chickenjoy")){
                System.out.println(food);
            }
            else{
                System.err.println("Wrong input.");
            }
        }
        
        //switch statement
        System.out.print("Input value4: ");
        int value4 = inputData.nextInt();
        
        switch(value4){//integer, character, strings, boolean
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                break;
        }
    }
    
}
