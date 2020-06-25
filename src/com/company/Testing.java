package com.company;

public class Testing {
    public static void test(){
        String string = "aksjdfh asudhf apsoie fhjawklejh sidphsakjrh   odifh sd fd";
        bingbong(string);
        int indexOf = string.indexOf("swati");
        System.out.println(indexOf);
        String sub = string.substring(0,1);
        System.out.println(sub);
    }

    private static void bingbong(String string) {
        int thing = string.codePointCount(5,9);
        System.out.println(thing);
    }

    public static int sum(int k){
        if(k > 0) {
            System.out.println(k);
            return k * sum(k - 1);
        } else {
            System.out.println(k);
            return 0;
        }
    }
    public static void abasdf(){
        Day day = new Day(2,1234513456);
        Day oregon = day;
        System.out.println(oregon.toString());
        day.setDecade(0);
        day.setAge(-1);
        System.out.println(oregon.toString());
    }

}
class Day{
    int age;
    int decade;

    public Day(int age, int decade) {
        this.age = age;
        this.decade = decade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDecade() {
        return decade;
    }

    public void setDecade(int decade) {
        this.decade = decade;
    }

    @Override
    public String toString() {
        return "age =" + age + "  \n  decade =" + decade;
    }
}