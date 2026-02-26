import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        char[] arr = {'a','b','a','c','b','a'};
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : arr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}