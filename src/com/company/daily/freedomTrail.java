package com.company.daily;

import java.util.ArrayList;
import java.util.HashMap;

public class freedomTrail {
    public static void main(String[] args) {
        freedomTrail freedomTrail = new freedomTrail();
        String ring = "godding";
        String key = "gd";
        System.out.println(freedomTrail.findRotateSteps(ring, key));
    }
    public int findRotateSteps(String ring, String key) {
        int len = ring.length();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(ring.charAt(i))) {
                ArrayList<Integer> newArray = map.get(ring.charAt(i));
                newArray.add(i);
            } else {
                ArrayList<Integer> newArray = new ArrayList<>();
                newArray.add(i);
                map.put(ring.charAt(i), newArray);
            }
        }
        int[][] mem = new int[key.length()][ring.length()];

        return recursive(0,0, ring, key, map, mem);
    }
    public int recursive(int keyIndex, int ringIndex, String ring, String key,HashMap<Character, ArrayList<Integer>> map, int[][] mem){
        if (keyIndex == key.length()) {
            return 0;
        }
        if (mem[keyIndex][ringIndex] > 0) return mem[keyIndex][ringIndex];
        ArrayList<Integer> positions = map.get(key.charAt(keyIndex));
        int minDist = Integer.MAX_VALUE;
        for (int pos : positions) {
            int distance = distBetween(pos, ringIndex, ring.length());
            minDist = Integer.min(minDist, distance + recursive(keyIndex+1, pos, ring, key, map,mem));
        }
        mem[keyIndex][ringIndex] = minDist + 1;
        return minDist + 1;
    }
    public static int distBetween(int x, int y, int arrLen){
        int max = Integer.max(x,y);
        int min = Integer.min(x,y);
        int midDist = max-min;
        int outDist = (arrLen - max) + min;
        return Integer.min(midDist,outDist);
    }
}
