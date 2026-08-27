class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> in = new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(in.contains(nums[i])){
            return true;
        }
        else{
            in.add(nums[i]);
        }
      }  
      return false;
    }
}