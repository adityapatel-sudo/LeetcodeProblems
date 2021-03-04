package com.company.SchoolProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvensForReal {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Removes strings of even length from an array.");
        System.out.print("Enter filename for file containing strings: ");
        File file = new File(scanner.next());
        System.out.println("Enter two indices for range of odd words to be printed out: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();
        scanner = new Scanner(file);
        ArrayList<String> array = new ArrayList<>();
        while(scanner.hasNext()){
            array.add(scanner.next());
        }
        System.out.println("initial list.size(): "+array.size());
        array.removeIf(x -> x.length() % 2 == 0);
        System.out.println("final   list.size(): "+array.size());

        System.out.println("odd words from index "+start+" to "+end+":");
        while(start<=end){
            System.out.println(array.get(start));
            start++;
        }
    }
}
