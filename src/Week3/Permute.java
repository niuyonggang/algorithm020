package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permute {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList();

    List<Integer> output = new ArrayList();
    for (int num : nums) {
      output.add(num);
    }

    int n = nums.length;
    backtrack(n, output, result, 0);
    return result;
  }

  public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
    if (first == n) {
      res.add(new ArrayList(output));
    }
    for (int i = first; i < n; i++) {
      Collections.swap(output, first, i);
      backtrack(n, output, res, first + 1);
      Collections.swap(output, first, i);
    }
  }

}
