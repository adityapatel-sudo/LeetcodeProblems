package com.company.SchoolProblems;


public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString(){
        return "{"+name+", "+age+", "+weight+"}";
    }

    @Override
    public int compareTo( Person o) {
        int compareName = name.compareTo(o.name);
        if(compareName>0)return 1;
        if(compareName<0)return -1;

        if(age>o.age)return 1;
        if(o.age>age)return -1;

        if(weight>o.weight)return 1;
        if(o.weight>weight)return -1;

        return 0;
    }
}
