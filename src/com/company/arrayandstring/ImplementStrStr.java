package com.company.arrayandstring;

public class ImplementStrStr {
/*
    String a = "mississippi";
    String b = "issipi";
    ImplementStrStr.strStr(a,b);
    */
    public static int strStr(String haystack, String needle){



        if(needle.length()==0){
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int cursor = 0; cursor<haystack.length(); cursor++){
            int needleCursor = 0;
            if(haystack.charAt(cursor) == needle.charAt(needleCursor) && haystack.length()-cursor>=needle.length()){
                while(needleCursor < needle.length()){
                    if(haystack.charAt(cursor+needleCursor) != needle.charAt(needleCursor)){
                        break;
                    }

                    System.out.println(haystack + "  " + needle + "  " + cursor + "  " + needleCursor);
                    needleCursor++;



                    if(needleCursor==needle.length()){
                        System.out.println(cursor + "   found!");
                        return cursor;
                    }
                }
            }

            System.out.println(haystack + "  " + needle + "  " + cursor);
        }


        System.out.println("FAILURE...FAILURE...FAILURE");
        return -1;
    }
}
