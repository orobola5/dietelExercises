package iterator;

import java.util.TreeMap;

public class RomanNumerals {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        StringBuilder sb = new StringBuilder();

        String romanNumeral = romanNumeral(map, 900, sb);
        System.out.println(romanNumeral);
    }

    private static String romanNumeral(TreeMap<Integer, String> map, int i, StringBuilder sb) {
        if (i < 1) {
            return sb.toString();
        }
        Integer floorKey = map.floorKey(i);
        sb.append(map.get(floorKey));
        return romanNumeral(map, i-floorKey, sb);
    }
}


