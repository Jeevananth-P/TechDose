class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
       //selection sort
       int l=nums.size();
       for(int i=0;i<l;i++){
           int minIdx=i;
           for(int j=i+1;j<l;j++){
               if(nums[j]<nums[minIdx]){
                   minIdx=j;
               }
           }
           swap(nums[i],nums[minIdx]);
       }
       return nums;
    }
};
