import java.util.HashMap;

public class SmallWINDofContacharOfOtherString {
  public static void main(String[] args) {
    String s = "timetopractice";
    String p = "toc";
    System.out.println(smallestWindow(s, p));
  }
  public static String smallestWindow(String s, String p)
  {
      
  if (s.length() == 0 || s.length() < p.length()) {
      return "-1";
  }

  HashMap<Character, Integer> map = new HashMap<>();
  int count = 0;
  int start = 0;
  int minLength = Integer.MAX_VALUE;
  int left = 0;

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

          while (count == p.length()) {
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

  if (minLength > s.length()) {
      return "-1";
  }

  return s.substring(left, left + minLength);
}


}
