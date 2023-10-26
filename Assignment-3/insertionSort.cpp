class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
      int n=nums.size();
      for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && nums[j]<nums[j-1]){
                     swap(nums[j],nums[j-1]);
                      j--;
            }
      }
       return nums;
    }
};
