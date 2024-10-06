class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>nums;
        for(int i=0;i<nums2.size();i++){
            nums.push_back(nums2[i]);
        }
        for(int i=0;i<nums1.size();i++){
            nums.push_back(nums1[i]);
        }
        double d;
        int k=nums.size();
        sort(nums.begin(),nums.end());
        if(k%2==1){
            d= nums[k/2];
        }
        else{
            d=0.5*(nums[k/2-1]+nums[k/2]);
        }
        return d;
    }
};