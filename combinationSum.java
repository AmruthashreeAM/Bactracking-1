package Backtracking1;
//Time Complexity : O(n*2^n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Nope

public class combinationSum {
	class Solution {
	    List<List<Integer>> result;
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        result = new ArrayList<>();
	        
	        if(candidates == null || candidates.length == 0) return result;
	        backtrack(candidates, target, new ArrayList<>(), 0);
	        return result;  
	    }
	    
	    private void backtrack(int[] candidates, int target, List<Integer> path, int index){
	        //base
	        if(target == 0) {
	            result.add(new ArrayList<>(path));
	            return;
	        }
	        
	        if(target < 0 ) return;
	        
	        //logic

	        //notchoose
	        for(int i=index; i< candidates.length; i++){
	           path.add(candidates[i]);
	           backtrack(candidates, target-candidates[i], path, i);   
	           path.remove(path.size() - 1); 
	        }             
	    }
	}
}