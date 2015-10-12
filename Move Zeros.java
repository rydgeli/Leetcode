// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

// Note:
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.

public class Solution_1 {
    public void moveZeroes(int[] nums) {
        int p1=0;
        int p2=0;
        while(p2<=nums.length-1)
        {
            if(nums[p2]!=0)
            {
                nums[p1]=nums[p2];
                p1++;
            }
            p2++;
        }
        for(int i=p1;i<=nums.length-1;i++)
        {
            nums[i]=0;
        }
    }
}

public class Solution_2 {
    public void moveZeroes(int[] nums) {
        int p1=0;
        int p2=0;
        while(p2<=nums.length-1)
        {
            if(nums[p2]!=0)
            {
                if(p1!=p2)
                {
                    nums[p1]=nums[p2];
                    nums[p2]=0;
                    
                }
                p1++;
            }
            p2++;
        }
    }
}