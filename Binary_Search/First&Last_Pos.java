//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int[] searchRange(int[] nums, int target) {
      int res[] = {-1,-1};
      int f = 0, l=nums.length-1;
    

      //first occurence of target (have to search only in left coz its a sorted array)
      while(f<=l)
      {  int m = f+(l-f)/2;
        if(nums[m] == target)
        {
        res[0] = m; //this would be last occurence and we search in left for first occurence
        l = m-1;
      }else if (target>nums[m])
       {
        f = m+1 ; // this would be like when we need to search in right now 
       }
       else{l=m-1;}}

        f = 0;
        l = nums.length - 1;

        // Find the last occurrence of the target
        while (f <= l) {
            int m = (f + l) / 2;
            if (nums[m] == target) {
                res[1] = m; // Update last occurrence
                f = m + 1; // Narrow search to the right
            } else if (nums[m] < target) {
                f = m + 1;
            } else {
                l = m - 1;
            }
        }

        return res;
    }
}
  
//Intution

//Seeing sorted array and also finding first (min) and last max() occurence helps us in understnading we can apply binary search here 
//we can search for first occurence in left half and last occurence in right half
//(my wrong thinking - if we find target at mid then fist and last occurence both would be mid only but thats totally wrong )
