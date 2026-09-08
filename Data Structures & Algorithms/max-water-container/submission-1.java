class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int height=0;
        int maxx=0;
        while(low<high){
            int width=high-low;
             height=Math.min(heights[low],heights[high]);
             int area = (high - low) * Math.min(heights[low], heights[high]);
            maxx=Math.max(maxx,area);
            if(heights[low] < heights[high]) {
    low++;
} else {
    high--;
}
        }
        return maxx;
    }
}
