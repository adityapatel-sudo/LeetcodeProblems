package com.company.arrayandstring;

public class FindSubstringInCircularArray {
    public static void findSubstring(String string, String subString){
        if(string.contains(subString)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        for(int i = string.length()-subString.length()+1; i<subString.length(); i++){


            if(i == string.length()-1){
                i = -1;
            }
        }
    }
}
