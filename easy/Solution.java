import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
            Map<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int total = 0;
            int previousValue = 0;

            for (char c : s.toCharArray()){
                int currentValue = romanMap.get(c);
                if (currentValue > previousValue){
                    total += currentValue - (2 * previousValue);
                } else {
                    total += currentValue;
                }
                previousValue = currentValue;
            }
            return total;
        }
    }