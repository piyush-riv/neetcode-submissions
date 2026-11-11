class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int longest=0;
        for(int i:s){
            if(!s.contains(i-1)){
                int len=1;
                while(s.contains(i+len)){
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}
