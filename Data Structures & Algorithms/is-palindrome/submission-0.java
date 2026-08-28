class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        String t=s.toLowerCase();
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(t.charAt(left))){
               left++;
            }
            while(left<right && !Character.isLetterOrDigit(t.charAt(right))){
                right--;
            }
            if(t.charAt(left)!=t.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
