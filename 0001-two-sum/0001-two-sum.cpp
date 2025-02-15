class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i,j;
        int k=0;
        vector<int>a;
       for(i=0;i<nums.size()&&k==0;i++){
           for(j=i+1;j<nums.size();j++){
               if(nums[i]+nums[j]==target){
                   k=1;
                   break;
               }
           }
       } 
       a.push_back(i-1);
       a.push_back(j);
       return a;
    }
};
