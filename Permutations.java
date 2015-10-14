// Given a collection of numbers, return all possible permutations.

// For example,
// [1,2,3] have the following permutations:
// [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null || nums.length==0)
            return null;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<Integer>();
		getPermutations(result,list,nums);
		return result;
    }
    
    public void getPermutations(List<List<Integer>> result, List<Integer> list, int[] nums){
		if(list.size()==nums.length)
		{
			result.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i=0; i<nums.length; i++)
		{
			if(list.contains(nums[i]))
				continue;
			list.add(nums[i]);
			getPermutations(result,list,nums);
			list.remove(list.size()-1);
		}
	}
}