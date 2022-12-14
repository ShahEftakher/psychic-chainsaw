import java.util.HashMap;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            if (hashMap.containsKey(nums[i]))
                return true;
            hashMap.put(nums[i], 1);
        }
        return false;
    }
}