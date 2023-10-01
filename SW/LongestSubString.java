import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestSubString(s));
    }

    public static int LongestSubString(String s) {
       
        int maxlength = 0;
        int j = 0;
        int i = 0;
        int count = 0;
        HashSet<Character> mp = new HashSet<>();
        while (i < s.length()) {

            if (!mp.contains(s.charAt(i))) {
                mp.add(s.charAt(i));
                count = i - j + 1;
                maxlength = Math.max(maxlength, count);
                i++;
            } else {
                mp.remove(s.charAt(i));
                j++;
            }

        }
        return maxlength;
    }
}
