class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target-nums[i];
            if(x.containsKey(res)){
                return new int[]{x.get(res),i};
            }
            x.put(nums[i],i);
        }
        return new int[]{};
    }
}
