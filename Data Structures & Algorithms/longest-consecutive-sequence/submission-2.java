class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int maxx=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                curr++;
            }
            else{
                maxx=Math.max(maxx,curr);
                curr=1;
            }
        }
        return Math.max(maxx,curr);
    }
}
