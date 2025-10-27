import java.util.*;

class Solution {
    public static Map<Character, Integer> getStringFrequency(String str){
        Map<Character, Integer> m1 = new HashMap<>();
        for(char c : str.toCharArray()){
            if(! m1.keySet().contains(c))
                m1.put(c, 1);
            else
                m1.put(c, m1.get(c)+1);
        }
        return m1;
    }
    public boolean isAnagram(String s, String t) {
        if(!getStringFrequency(s).equals(getStringFrequency(t)))
            return false;
        else
            return true;
    }
}