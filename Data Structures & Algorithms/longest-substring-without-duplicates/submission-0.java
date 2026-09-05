class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int count=0;
        Set<Character> res = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            while(res.contains(s.charAt(i))){
                res.remove(s.charAt(count));
                count++;
            }
            res.add(s.charAt(i));
            len=Math.max(len,i-count+1);
        }
        return len;
    }
}
