class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=1;
        int overlapp=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(overlapp<=intervals[i][0]){
                count++;
                overlapp= intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}
