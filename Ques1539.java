class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s =0;
        int e =arr.length-1;
        while(s<=e){
            int m =s+(e-s)/2;
            int miss =arr[m]-(m+1);
            if(miss>=k){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return s+k;
    }
}
