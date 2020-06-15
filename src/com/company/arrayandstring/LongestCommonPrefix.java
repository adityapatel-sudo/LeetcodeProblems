package com.company.arrayandstring;

import com.company.PrintArray;

public class LongestCommonPrefix {

/*
    String[] asdf = new String[] {"aa", "a"};
    System.out.println("answer is: "+LongestCommonPrefix.longestCommonPrefix(asdf));
    */

    public static String longestCommonPrefix(String[] strs){

        if (strs.length == 0){
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        int charCursor = 0;
        while(true){
            char newChar;
            if(strs[0].length() > charCursor){
                newChar = strs[0].charAt(charCursor);
            }else{
                PrintArray.printArray(strs);
                System.out.print("   " + prefix.toString() + "  COMPLETE THROUGH ROUTE 1");
                System.out.println();
                return prefix.toString();
            }
            for(int stringCursor = 1; stringCursor < strs.length; stringCursor++){
                if(strs[stringCursor].length()<=charCursor || newChar != strs[stringCursor].charAt(charCursor)){

                    PrintArray.printArray(strs);
                    System.out.print("  " + prefix.toString() +" "+newChar+ "  COMPLETE THROUGH ROUTE 2");
                    System.out.println();


                    return prefix.toString();
                }

            }
            prefix.append(newChar);
            charCursor++;

            PrintArray.printArray(strs);
            System.out.print("  " + prefix.toString() +" "+newChar);
            System.out.println();
        }



/*
        if (strs.length == 0){
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        return prefix;

*/


    }
}
