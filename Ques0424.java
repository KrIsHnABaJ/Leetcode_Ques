class Solution {
    public int characterReplacement(String s, int k) {
        int ans= 0;
        HashMap<Character,Integer>map = new HashMap<>();
        int r =0;
        int l =0;
        int max =0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r), 0)+1);
            max =Math.max(max, map.get(s.charAt(r)));
            if(r-l+1 - max > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if(r-l+1 - max<=k){
                ans = Math.max(ans, r-l+1);
            }
            r++;
        }
        return ans;
    }
}
