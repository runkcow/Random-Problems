import java.util.HashMap;

class Solution
{
    public int[] twoSum (int[] nums, int target)
    {
        // BRIAN SNAP GO AGANE
        HashMap<Integer, Integer> diff = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if (diff.get(nums[i]) != null)
            {
                return new int[]{i, diff.get(nums[i])};
            }
            diff.put(target - nums[i], i);
        }
        return new int[]{0, 1};
    }
}