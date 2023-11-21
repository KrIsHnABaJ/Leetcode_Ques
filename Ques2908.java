class Ques2908 {
    public int minimumSum(int[] arr) {
        int n = arr.length;
        int min1[] = new int[n];
        int min2[] = new int[n];

        min1[0] = arr[0];
        min2[n-1] = arr[n-1];

        for(int i=1; i<n; i++){
            min1[i] = Math.min(min1[i-1],arr[i]);
        }

        for(int i=n-2; i>=0; i--){
            min2[i] = Math.min(min2[i+1],arr[i]);
        }

        int ans = Integer.MAX_VALUE;

        for(int i=1; i<n-1; i++){
            if(min1[i-1]<arr[i] && min2[i+1]<arr[i]){
                ans = Math.min(ans,min1[i-1]+arr[i]+min2[i+1]);
            }
        }

        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}
