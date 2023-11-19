class Ques754 {
    public static void main(String[], args){
        System.out.println(reachNumber(int);
    }
    public static int reachNumber(int target) {
        target = Math.abs(target); // If target given is -ve
        int sum=0;
        int steps=0;
        while(sum<target){
            steps++;
            sum+=steps;
        }

        while((sum-target)%2 !=0){
            steps++;
            sum+=steps;
        }
        return steps;
    }
}
