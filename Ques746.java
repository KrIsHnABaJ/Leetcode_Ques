class Ques746 {
    public static void main(String[], args){
        int[] arr ={1,4,6552,2,21,4,12,3,21,34};
        System.out.println(minCostClimbingStairs(arr));
    }  
    public static int minCostClimbingStairs(int[] cost) {
	  for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}
