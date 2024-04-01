package ctu_night_exceptions;

import java.util.Scanner;
import test.DivisibleByZero;


public class CTU_Night_Exceptions {


    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        
        switch(inputData.nextInt()){
            case 1:
                System.out.println("Input for dividend and divisor (integer): ");
                int value1 = 0, value2 = 0;
                try{
                    value1 = inputData.nextInt();
                    value2 = inputData.nextInt();
                    DivisibleByZero test1 = new DivisibleByZero(value1, value2);
                    System.out.println("Quotient: " + test1.intQuotient());
                }catch(Exception e){
                    //main(args);
                    System.err.println(e.getStackTrace());
                }finally{
                    //main(args);
                }
                break;
            case 2:
                System.out.println("Input for dividend and divisor (double): ");
                DivisibleByZero test2 = new DivisibleByZero(inputData.nextDouble(), inputData.nextDouble());
                System.out.println("Quotient: " + test2.doubleQuotient());
            default:
                break;
        }
    }
    
}
