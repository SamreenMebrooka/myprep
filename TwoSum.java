import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int [] nums={2,7,8,11};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[]twoSum(int[] nums, int target) {
            Map<Integer,Integer> map =new HashMap();
            for(int i =0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    return new int[]{map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }
            return new int[2];
        }
    }

