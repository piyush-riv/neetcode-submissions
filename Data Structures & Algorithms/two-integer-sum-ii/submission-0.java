class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f=0;
        int r=numbers.length-1;
        while(f<r){
            int sum=numbers[f]+numbers[r];
            if(sum==target){
                return new int[]{f+1,r+1};
            }
            else if(sum<target){
                f++;
            }
            else{
                r--;
            }
        }
        return new int []{-1,-1};
        
    }
}
