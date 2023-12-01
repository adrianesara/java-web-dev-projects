package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input;



    input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
    radius = input.nextDouble();
        input.close();

    area = Circle.getArea(radius);
        System.out.println("The area of your circle is: " + area);
}
}

