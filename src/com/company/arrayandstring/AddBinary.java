package com.company.arrayandstring;
public class AddBinary {
/*
    String a = "1";
    String b = "11";
    AddBinary.addBinary(a, b);
    */

    public static String addBinary(String a, String b) {
        int carry = 0;
        int length = 0;
        StringBuilder aStringBuilder = new StringBuilder(a);
        StringBuilder bStringBuilder = new StringBuilder(b);

        if (a.length() > b.length()){
            length = a.length();
            bStringBuilder.reverse();
            for(int i = b.length();i<a.length();i++){
                bStringBuilder.append("0");
            }
            bStringBuilder.reverse();
            }else {
            length = b.length();
            aStringBuilder.reverse();
            for(int i = a.length();i<b.length();i++){
                aStringBuilder.append("0");
            }
            aStringBuilder.reverse();
        }

        StringBuilder binarySum = new StringBuilder(length);

        int cursor = length-1;

        System.out.println(aStringBuilder+"  "+bStringBuilder+"  "+carry+"  "+cursor+ "  " + cursor+ " "+ binarySum.toString());

        while(binarySum.length() < length){
            if(carry==1){
                if(aStringBuilder.charAt(cursor)=='1' && bStringBuilder.charAt(cursor)=='1'){
                    binarySum.append('1');
                }else if(aStringBuilder.charAt(cursor)=='0' && bStringBuilder.charAt(cursor)=='1' || aStringBuilder.charAt(cursor)=='1' && bStringBuilder.charAt(cursor)=='0'){
                    binarySum.append('0');
                }else{
                    binarySum.append('1');
                    carry=0;
                }
            }else{
                if(aStringBuilder.charAt(cursor)=='1' && bStringBuilder.charAt(cursor)=='1'){
                    binarySum.append('0');
                    carry=1;
                }else if(aStringBuilder.charAt(cursor)=='0' && bStringBuilder.charAt(cursor)=='1' || aStringBuilder.charAt(cursor)=='1' && bStringBuilder.charAt(cursor)=='0'){
                    binarySum.append('1');
                }else{
                    binarySum.append('0');
                }
            }


            System.out.println(aStringBuilder+"  "+bStringBuilder+"  "+carry+"  "+cursor+ "  " + cursor+ " "+ binarySum.toString());

            cursor--;

        }

        if(carry==1){
            binarySum.append('1');
        }

        System.out.println(aStringBuilder+"  "+bStringBuilder+"  "+carry+"  "+cursor+ "  " + cursor+ " "+ binarySum.toString());

        return binarySum.reverse().toString();


    }
}
