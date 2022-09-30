import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1 };
        int[] result = twoSum(arr, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int _target = target - nums[i];
            if (hashMap.containsKey(_target)) {
                return new int[] { i, hashMap.get(_target) };
            }
            hashMap.put(nums[i], i);
        }
        return nums;
    }
}
