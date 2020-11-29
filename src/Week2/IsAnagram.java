package Week2;

import java.util.Arrays;

public class IsAnagram {

  public boolean isAnagram(String s, String t) {
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    if (a.length != b.length) {
      return false;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a,b);
  }

  public boolean isAnagram1(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] a = new int[26];
    for (int i =0 ; i < s.length(); i++) {
      a[s.charAt(i) - 'a'] ++;
      a[t.charAt(i) - 'a'] --;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0){
        return false;
      }
    }
    return true;
  }


}
