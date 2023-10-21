import java.util.HashMap;
import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roman = sc.next();
        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int num = 0;
        int prvious = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue >= prvious) {
                num += currentValue;
            } else {
                num -= currentValue;
            }

            prvious = currentValue;
        }

        return num;
    }
}

