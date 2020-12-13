package Week4;

import java.util.Arrays;

public class FindContentChildren {
  public int findContentChildren(int[] g, int[] s) {
    int g0 = 0;
    int s0 = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    if (g == null || s == null){
      return 0;
    }
    while (g0 < g.length && s0 < s.length) {
      if (g[g0] <= s[s0]) {
        g0++;
      }
      s0++;
    }
    return g0;
  }
}
