class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        int x=0;
        for(int i:nums){
            if(result.contains(i)){
                return i;
            }
            else{
                result.add(i);
            }
        }
        return -1;
    }
}
