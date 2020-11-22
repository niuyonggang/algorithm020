package Week1;

public class Rotate {

  public void rotate1(int[] nums, int k) {
    if (k == 0) {
      return;
    }
    int temp,pre;
    for (int j = 0; j < k; j++) {
      pre = nums[nums.length - 1];
      for (int i = 0; i < nums.length; i++) {
        temp = nums[i];
        nums[i] = pre;
        pre = temp;
      }
    }
  }

  public void rotate2(int[] nums, int k) {
    if (k == 0) {
      return;
    }
    int n = nums.length;
    k %= n;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k -1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }


}
