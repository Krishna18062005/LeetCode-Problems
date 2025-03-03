class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        ls=[]
        for i in nums:
            if(i<pivot):
                ls.append(i)
        for i in nums:
            if(i==pivot):
                ls.append(i)
        for i in nums:
            if(i>pivot):
                ls.append(i)
        return ls

        