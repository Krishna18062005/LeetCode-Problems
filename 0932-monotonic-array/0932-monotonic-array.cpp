class Solution {
    private:
    bool isIncreasing(vector<int>&u)
    {
        for(int i =0;i+1<u.size();i++)
        {
            if(u[i]<=u[i+1])
            {
               continue;
              
            }
            else{
                return false;
                break;
            }
        
        }
        return true;
    }
    bool isDecreasing(vector<int>&v)
    {
        for(int i =0;i+1<v.size();i++)
        {
            if(v[i]>=v[i+1])
            {
                
              continue;
            }
            else{
                return false;
                break;
            }
        }
        return true;
    }

public:
    bool isMonotonic(vector<int>& nums) {
        return isDecreasing(nums)||isIncreasing(nums);
      
  }

    
       
};