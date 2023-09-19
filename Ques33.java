class Solution {
    public static void main(String[] args){
        int[] arr ={#any array};
        System.out.println(search(arr,#any int));
    }
    public static int search(int[] nums, int target) {
        int pivot =rbs(nums);
        if(pivot==-1){
            return bsearch(nums, target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return bsearch(nums, target, 0, pivot-1);
        }
        if(target<nums[0]){
            return bsearch(nums, target, pivot+1, nums.length-1);
        }
        return -1;
    }
    public static int rbs(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
                
            }
            else{
                start =mid+1;
            }
        }
        return -1;
    }
    public static int bsearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
