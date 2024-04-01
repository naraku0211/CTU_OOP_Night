package main;

public class PolymorphismParentClass {

    private String poly1, poly2, poly3;
    private int polyInt1, polyInt2;

    public PolymorphismParentClass() {
    }

    public PolymorphismParentClass(String poly1, String poly2, String poly3) {
        this.poly1 = poly1;
        this.poly2 = poly2;
        this.poly3 = poly3;
    }

    public PolymorphismParentClass(int polyInt1, int polyInt2) {
        this.polyInt1 = polyInt1;
        this.polyInt2 = polyInt2;
    }

    public PolymorphismParentClass(String poly1, String poly2, String poly3, int polyInt1, int polyInt2) {
        this.poly1 = poly1;
        this.poly2 = poly2;
        this.poly3 = poly3;
        this.polyInt1 = polyInt1;
        this.polyInt2 = polyInt2;
    }

    public int getPolyInt2() {
        return polyInt2;
    }

    public void setPolyInt2(int polyInt2) {
        this.polyInt2 = polyInt2;
    }

    public String getPoly1() {
        return poly1;
    }

    public void setPoly1(String poly1) {
        this.poly1 = poly1;
    }

    public String getPoly2() {
        return poly2;
    }

    public void setPoly2(String poly2) {
        this.poly2 = poly2;
    }

    public String getPoly3() {
        return poly3;
    }

    public void setPoly3(String poly3) {
        this.poly3 = poly3;
    }

    public int getPolyInt1() {
        return polyInt1;
    }

    public void setPolyInt1(int polyInt1) {
        this.polyInt1 = polyInt1;
    }
    
    public void printStringPolies(){
        System.out.println("Value of poly1: " + getPoly1() + 
                "\nValue of poly2: " + getPoly2() +
                "\nValue of poly3: " + getPoly3());
    }
    
    public void printStringPolies(String poly1, String poly2, String poly3){
        
    }
    
    
    
}
