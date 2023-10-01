import java.util.HashMap;

public class SmallDistinctWindow {
    public static void main(String[] args) {
        String str ="AABBBCBBAC";
        System.out.println(FindSubString(str));
    }
    public static int FindSubString(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
      
        for (int i = 0; i < s.length(); i++) {
          if (!map.containsKey(s.charAt(i))) {
                 map.put(s.charAt(i), 1);
          } 
      }
      
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
      
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) - 1);
      
                if (map.get(currentChar) >= 0) {
                    count++;
                }
      
                while (count == map.size()) {
                    if (minLength > i - start + 1) {
                        minLength = i - start + 1;
                        left = start;
                    }
      
                    char startChar = s.charAt(start);
      
                    if (map.containsKey(startChar)) {
                        map.put(startChar, map.get(startChar) + 1);
      
                        if (map.get(startChar) > 0) {
                            count--;
                        }
                    }
      
                    start++;
                }
    }
}
return minLength;
    }
}