class Solution {
    public int[] getConcatenation(int[] nums) {
        int ar[]=new int[2*nums.length];
        int i=0;
        for(i=0;i<nums.length;i++){
            ar[i]=nums[i];
        }
        for(i=0;i<nums.length;i++){
            ar[nums.length+i]=nums[i];
        }
        return ar;
    }
}