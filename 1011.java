class Solution {
    public int shipWithinDays(int[] weights, int d) {
        int sum=0;
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];
            max =Math.max(weights[i],max);
        }
        
        int s=max;
        int e=sum;
        while(s<=e){
            int m = s+(e-s)/2;
            if(possible(weights, d, m)){
                e =m-1;
            }else{
                s= m+1;
            }
        }
        return s;
    }
    public boolean possible(int[] weight,int d,int mid){
        int count =0;
        int ans =1;
        for (int i = 0; i < weight.length; i++) {
            if(count+weight[i]>mid){
                ans+=1;
                count = weight[i];
            }
            else{
                count +=weight[i];
            }
        }
        return ans<=d;
    }
}
