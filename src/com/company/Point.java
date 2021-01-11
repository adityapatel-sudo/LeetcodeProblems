package com.company;

import java.util.Scanner;

public class Point {
    private int x, y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getQuadrant() {
        if (this.x == 0 || this.y == 0) return 0;
        if (this.x > 0 && this.y > 0) return 1;
        if (this.x < 0 && this.y > 0) return 2;
        if (this.x < 0) return 3;
        return 4;
    }

    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double slope(Point other){
        double slope = 0;
        if(other.x==this.x || other.y==this.y) return slope;
        slope = this.y-other.y;
        slope /= this.x-other.x;
        return slope;
    }

}