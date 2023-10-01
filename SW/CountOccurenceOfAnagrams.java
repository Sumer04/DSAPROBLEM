import java.util.HashMap;

public class CountOccurenceOfAnagrams {
    public static void main(String[] args) {
        String s = "aabaabaa";
        String p = "aaba";
        System.out.println(Search(s, p));
    }

    public static int Search(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int start = 0;
     

        for (int i = 0; i < p.length(); i++) {
            if (map.containsKey(p.charAt(i))) {
                map.put(p.charAt(i), map.get(p.charAt(i)) + 1);
            } else {
                map.put(p.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) - 1);

                if (map.get(currentChar) >= 0) {
                    count++;
                }

                while (i - start + 1 == p.length()) {
                    if (count == p.length()) {
                        max++;
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
            } else {

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
        return max;
    }
}