import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {

        int[] nums = {-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(twoSum(nums, -8)));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] resultArr = new int[2];

        int intSize = nums.length;

        int sum = 0;
        for (int i = 0; i < intSize; ++i) {
            for (int j = 0; j < intSize; ++j) {

                if (i != j) {
                    sum = nums[i] + nums[j];

                    if (sum == target) {
                        resultArr[0] = i;
                        resultArr[1] = j;
                        return resultArr;
                    }
                }
            }
        }
        return null;
    }
}
