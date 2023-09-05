import java.util.Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr ={1};
        int[] a ={2};
        System.out.println(findMedianSortedArrays(arr, a));
    }
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fal =nums1.length;
        int sal=nums2.length;
        int[]narr =new int[fal+sal];
        System.arraycopy(nums1, 0, narr, 0, fal);
        System.arraycopy(nums2, 0, narr, fal, sal);
        Arrays.sort(narr);
        System.out.println(Arrays.toString(narr));
        int end=narr.length-1;
        int start=0;
        int mid =start+(end-start)/2;
        if(narr.length%2==0){            
            double a =2.0;
            double ans =(narr[mid]+narr[mid+1])/a;
            return ans;
        }else{
            return narr[mid];
            
        }
        
        
       
    }
}
