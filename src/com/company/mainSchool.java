package com.company;
import java.util.*;

public class mainSchool {
    public static void main(String[] args) {

        Point point = new Point();
        System.out.println("mooDefault = "+point.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x-value: ");
        point.setXY(scanner.nextInt(),point.getY());
        System.out.print("Enter y-value: ");
        point.setXY(point.getX(),scanner.nextInt());
        System.out.println("Quadrant: "+point.getQuadrant());
        System.out.println("Distance to origin: "+point.distanceToOrigin());
        System.out.println();

    }


}
