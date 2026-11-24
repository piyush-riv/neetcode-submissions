class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n=len(s1)
        m=len(s2)
        if m<n: 
            return False
        f1=[0]*26
        f2=[0]*26

        for ch in s1:
            f1[ord(ch)-ord('a')]+=1

        i,j=0,0
        while(j<m):
            f2[ord(s2[j])-ord('a')]+=1
            if (j-i+1)>n:
                f2[ord(s2[i])-ord('a')]-=1
                i+=1
            if f1==f2:
                return True
            j+=1
        return False