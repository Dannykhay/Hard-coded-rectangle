package assignment;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {

        // Here, the Parameterised constructor is used.
        Rectangle rec1 = new Rectangle(20, 10);
        System.out.println("Area of Rectangle One(1) => "+rec1.getWidth()+ " + " +rec1.getHeight()+ " = " +rec1.Area());
        // I added perimeter in case we are ask to add it.
        System.out.println("Perimeter of Rec One(1) => "+"2("+rec1.getWidth()+ " + " +rec1.getHeight()+")"+ " = " +rec1.Perimeter());
        System.out.println("");

        // Here, the Default constructor is used.
        Rectangle rec2 = new Rectangle();
        rec2.setWidth(40);
        rec2.setHeight(20);
        System.out.println("Area of Rectangle Two(2) => "+rec2.getWidth()+ " + "+ rec2.getHeight()+" + "+rec2.Area());
        // I added perimeter in case we are ask to add it.
        System.out.println("Perimeter of Rec One(2) => "+"2("+rec2.getWidth()+ " + " +rec2.getHeight()+")"+ " = " +rec2.Perimeter());

    }
}
