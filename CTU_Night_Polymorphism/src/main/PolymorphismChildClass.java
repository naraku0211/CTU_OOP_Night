package main;

public class PolymorphismChildClass extends PolymorphismParentClass {

    public PolymorphismChildClass() {
    }

    public PolymorphismChildClass(String poly1, String poly2, String poly3) {
        super(poly1, poly2, poly3);
    }

    public PolymorphismChildClass(int polyInt1, int polyInt2) {
        super(polyInt1, polyInt2);
    }

    @Override
    public void printStringPolies(String poly1, String poly2, String poly3) {
        System.out.printf("Value of poly1, poly2 and poly3: %s, %s, %s\n"
                ,poly1
                ,poly2
                , poly3);
    }
    
    public double squaredPolies(int polyInt1, int polyInt2){
        //return (polyInt1 + polyInt2) * (polyInt1 + polyInt2);
        return Math.pow((polyInt1 + polyInt2), 2);
    }
    
    public double squaredPolies(){
        return Math.pow((super.getPolyInt1() + super.getPolyInt2()), 2);
    }
}
