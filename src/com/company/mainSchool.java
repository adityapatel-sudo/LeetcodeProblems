package com.company;
import com.company.SchoolProblems.Person;

import java.util.*;

public class mainSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();

        while(true){
            String name = sc.next();
            if(name.equals("stop")) break;
            int age = sc.nextInt();
            double weight = sc.nextDouble();

            people.add(new Person(name,age,weight));
        }
        System.out.println("Original list: \n"+people.toString());

        Collections.sort(people);

        System.out.println("\nSorted list: \n"+people.toString());
    }
}

