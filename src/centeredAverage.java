public class centeredAverage {
  public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      max = Math.max(max, nums[i]);
      min = Math.min(min,nums[i]);
    }
    return (sum - min - max) / (nums.length - 2);
  }
}
