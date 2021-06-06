package com.company;
import com.company.SchoolProblems.SortDetective;
import com.company.arrayandstring.PascalsTriangle2DArray;

import javax.swing.*;
import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.*;

import static com.company.SchoolProblems.SortDetective.isSorted;

public class Main {

    public static void main(String[] args) {
        Animal b = new Bear();
        ((Bear) b).growl();
    }
}
class Animal{
    public Animal(){}
    public void eat(){}
}
class Bear extends Animal{
    public Bear(){
    }
    public void growl(){}
}
