package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
            return true;
        }
        return false;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;

        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int n : nums) {
            if (n == 1) {
                has1 = true;
            }
            if (n == 4) {
                has4 = true;
            }
        }

        if (has1 == false || has4 == false){
            return true;
        } else {
            return false;
        }
    }

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public static void main(String[] args) {
        CodingBat obiekt = new CodingBat();

        System.out.print(obiekt.monkeyTrouble(true,true));
        System.out.print(obiekt.mixStart("pix"));
        System.out.print(obiekt.no14(new int[]{1,2,3,4}));
        System.out.print(obiekt.makeAbba("Hi","Hi"));
        System.out.print(obiekt.mapAB(new HashMap<>(Map.of("a","Hi","b","There"))));
        System.out.print(obiekt.wordLen(new String[]{"herbata","kot","krakow"}));
    }

}
