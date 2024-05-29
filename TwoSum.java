import java.util.*;


public class TwoSum {
    public static Boolean twoSum(int[] arr, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (numToIndex.containsKey(target - arr[i]))
                return true;
            numToIndex.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,-1,2,-3,1};
        int target1 = -2;
        System.out.println(twoSum(arr1, target1));

        int[] arr2 = {1,-2,1,0,5};
        int target2 = 0;
        System.out.println(twoSum(arr2, target2));
    }
}
