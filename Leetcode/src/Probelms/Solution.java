package Probelms;

import java.util.HashMap;
import java.util.Map;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DummyProgram obj = new DummyProgram();
		obj.print();
		
		
		 HashMap<Integer, Integer> dict = new HashMap<>();
		 int nums[]= {2,2,3,4,4,4};
		 for(int i : nums){
	            if(dict.containsKey(i)) {
	            	continue;
	            }else {
	            	dict.put(i, Count(i,nums));
	            }
	        }
		 int max=0;
		int key =0;
		for(Map.Entry<Integer,Integer> temp : dict.entrySet()) {
			
			if(temp.getValue()> max) {
				max= temp.getValue();
				key = temp.getKey();
			}
		}
		System.out.println(key);
		 
}
	    public static int Count(int i, int[] nums){
	        int count=0;
	        for(int j: nums){
	            if(i == j){
	                count++;
	            }
	        }
	        return count;
	    }
}
