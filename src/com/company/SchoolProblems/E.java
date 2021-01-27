package com.company.SchoolProblems;



class G{
    public void method1(){
        System.out.println("G1");
    }
    public void method2(){
        System.out.println("G2");
    }
    public String toString(){
        return "G";
    }
}
class F extends G{
    public void method2(){
        System.out.println("F2");
        super.method2();
    }
    public String toString(){
        return "F";
    }
}
public class E extends G{
    public String toString(){
        return new F().toString();
    }
    public void method2(){
        System.out.println("E2");
        method1();
    }
}
class H extends E{
    public void method1(){
        System.out.println("H1");
    }
}


class GFEHClient{
    public static void main(String[] args){
        G[] elements = {new G(), new F(), new E(), new H()};
        for (int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}