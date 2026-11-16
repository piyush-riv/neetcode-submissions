class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        def merge(ar,l,m,r):
            left,right=ar[l:m+1],ar[m+1:r+1]
            i,j,k=l,0,0

            while j < len(left) and k< len(right):

                if left[j]<=right[k]:
                    ar[i]=left[j]
                    j+=1

                else:
                    ar[i]=right[k]
                    k+=1

                i+=1
            while j< len(left):
                ar[i]=left[j]
                j+=1
                i+=1

            while k<len(right):
                ar[i]=right[k]
                k+=1
                i+=1

        def mergeSort(ar,l,r):
            if l==r:
                return
            m=l+(r-l)//2
            mergeSort(ar,l,m)
            mergeSort(ar,m+1,r)
            merge(ar,l,m,r)

        mergeSort(nums,0,len(nums)-1)
        return nums
        

