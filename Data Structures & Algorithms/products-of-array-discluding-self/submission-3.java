class Solution {
    public int[] productExceptSelf(int[] ar) {
        int a[]= new int[ar.length];
        int mul=1;
        int z=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                mul*=ar[i];
            }
            else{
                z++;
            }
        }
        if(z>1) return new int[ar.length];
        for(int i=0;i<ar.length;i++){
            if(z==1){
                if(ar[i]==0){
                    a[i]=mul;
                }
                else{
                    a[i]=0;
                }
            }else{
                    a[i]=mul/ar[i];
            }
           
        }
        return a;
    }
}  
