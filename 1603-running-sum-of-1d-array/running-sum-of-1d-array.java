//                 using extra space -> 0(n)
//  class Solution {
//         public int[] runningSum(int[] nums) {
//           int n = nums.length;  
//           int [] arr = new int[n];
//           arr[0] = nums[0];
//           for(int i=1;i<n;i++){
//               arr[i] = nums[i] + arr[i-1];
//           }
//           return arr;
//         }
//     }


//   Method 2 without using extra space

class Solution{
    public int[] runningSum(int[] nums){
        for(int i=1;i<nums.length;i++) nums[i] += nums[i-1];
        return nums;
    }
}