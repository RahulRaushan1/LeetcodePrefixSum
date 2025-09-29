class NumArray {
    int [] arr;

    public NumArray(int[] nums) { // Constructor
       arr = nums; // shallow copy
        
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum +=arr[i];
        }
        return sum;
    }
}

