/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


public class Ques276 extends VersionControl {


  
    public static void main(String[], args){
        System.out.println(firstBadVersion(#int));
    }


    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
            else if(isBadVersion(mid)==false ) low = mid+1;
            else high= mid;
        }     
        return -1;
    }
}
