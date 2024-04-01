package test;

import main.*;

public class PolymorphismTest {
    
    public static void main(String[] args) {
        
        PolymorphismChildClass childClass = new PolymorphismChildClass();
        childClass.setPoly1("Hi.");
        childClass.printStringPolies();
        childClass.printStringPolies("Hi", "Hello", "");
        childClass.setPolyInt1(5);
        childClass.setPolyInt2(10);
        
        PolymorphismParentClass parentClass = new PolymorphismParentClass();
        parentClass.setPoly1("Hello.");
        parentClass.printStringPolies();
        parentClass.printStringPolies("Hi", "Hello", "");
        parentClass.setPolyInt1(10);
        parentClass.setPolyInt2(20);
        
        PolymorphismParentClass class1 = new PolymorphismChildClass();
        class1.setPoly1("Hello CTU.");
        class1.printStringPolies();
        class1.printStringPolies("Hi", "Hello", "CTU.");
        class1.setPolyInt1(10);
        class1.setPolyInt2(20);
        
        //PolymorphismChildClass class2 = new PolymorphismParentClass();
        
        System.out.println("Squared Polies: " + childClass.squaredPolies());
        //System.out.println("Squared Polies: " + parentClass.squaredPolies());
        //System.out.println("Squared Polies: " + class1.squaredPolies());
    }
}
