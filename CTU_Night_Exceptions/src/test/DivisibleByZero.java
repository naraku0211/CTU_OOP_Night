package test;

import java.io.IOException;

public class DivisibleByZero {
    
    private int intDividend, intDivisor, intQuotient;
    private double doubleDividend, doubleDivisor, doubleQuotient;

    public DivisibleByZero() {
    }

    public DivisibleByZero(int intDividend, int intDivisor) {
        this.intDividend = intDividend;
        this.intDivisor = intDivisor;
    }

    public DivisibleByZero(double doubleDividend, double doubleDivisor) {
        this.doubleDividend = doubleDividend;
        this.doubleDivisor = doubleDivisor;
    }

    public int getIntDividend() {
        return intDividend;
    }

    public void setIntDividend(int intDividend) {
        try{
            this.intDividend = intDividend;
        }catch(Exception e){
            System.err.println("Exception: " + e);
        }  
    }

    public int getIntDivisor() {
        return intDivisor;
    }

    public void setIntDivisor(int intDivisor) {
        this.intDivisor = intDivisor;
    }

    public double getDoubleDividend() {
        return doubleDividend;
    }

    public void setDoubleDividend(double doubleDividend) {
        this.doubleDividend = doubleDividend;
    }

    public double getDoubleDivisor() {
        return doubleDivisor;
    }

    public void setDoubleDivisor(double doubleDivisor) {
        this.doubleDivisor = doubleDivisor;
    }
    
    public int intQuotient() throws ArithmeticException, IOException{
       
        intQuotient = getIntDividend() / getIntDivisor();
        return intQuotient;      
    }
    
    public double doubleQuotient(){
        doubleQuotient = getDoubleDividend() / getDoubleDivisor();
        return doubleQuotient;
    }
    
    
}
