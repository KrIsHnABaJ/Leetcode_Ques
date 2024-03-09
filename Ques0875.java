class Solution {
    public int minEatingSpeed(int[] v, int h) {
        int start =1;
        int end = max(v);
        while(start<=end){
            int mid = start+(end-start)/2;
            int totalhour = hour(v, mid);
            if(totalhour<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int hour(int[] v ,int hourly){
        int ans =0;
        for (int i = 0; i < v.length; i++) {
            ans+=Math.ceil((double)v[i]/(double)hourly);
        }
        return ans;
    }
    public static int max(int[] v){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            max=Math.max(max, v[i]);
        }
        return max;
    }
}
