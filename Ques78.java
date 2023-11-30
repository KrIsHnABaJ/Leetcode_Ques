import java.util.ArrayList;
import java.util.List;

public class Ques78 {
    public static void main(String[] args) {
        int [] nums ={#array};
        List<List<Integer>> ans =list(nums);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> list(int [] nums){
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int a:nums){
            int n= outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner =new ArrayList<>(outer.get(i));
                inner.add(a);
                outer.add(inner);
            }
        }

        return outer;
    }
}
