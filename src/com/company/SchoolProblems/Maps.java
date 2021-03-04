package com.company.SchoolProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        for(int i = 0; i < n+k;i++){
            String key = scanner.next();
            int val = scanner.nextInt();

            map.put(key,val);
        }
        long sum = 0;

        for(int i = 0; i < q ; i++){
            sum += map.get(scanner.next());
        }

        sum += 7;
        System.out.println(sum);

    }
}
