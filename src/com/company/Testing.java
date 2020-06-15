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
}
