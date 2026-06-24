class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char cur = s.charAt(right);
            if(map.containsKey(cur)){
                left=Math.max(left,map.get(cur)+1);
            }
            map.put(cur,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}