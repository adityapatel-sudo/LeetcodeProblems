package com.company.SchoolProblems;
import java.util.*;

public class SentenceStatic {
    public static String sentence;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();
        System.out.println(getBlankPositions());
        System.out.println(countWords());
        String[] words = getWords();
        char x = 'a';
        
        System.out.print("{");
        for(int i = 0; i < words.length;i++)
            if(i == words.length-1)
                System.out.print(words[i]);
            else
                System.out.print(words[i] + ", ");
        System.out.println("}");
    }
    public static ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blanks = new ArrayList<>();
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                blanks.add(i);
            }
        }
        return blanks;
    }


    public static int countWords() {
        int temp = 1;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                temp++;
            }
        }
        return temp;
    }


    public static String[] getWords() {
        String[] ans = new String[countWords()];
        ArrayList<Integer> spaces = getBlankPositions();
        int start = 0;
        if(ans.length == 1){
            ans[0] = sentence;
            return ans;
        }
        for(int i = 0; i < ans.length; i++){
            if(i == ans.length - 1){
                ans[i] = sentence.substring(spaces.get(i - 1) + 1);
                break;
            }
            ans[i] = sentence.substring(start, spaces.get(i));
            start = spaces.get(i) + 1;
        }
        return ans;
    }

}
