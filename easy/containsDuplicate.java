
import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
    public static void main(String[] args){
        int[] nums1 = {1,1,1,3,3,4,3,2,4,2};
        solution(nums1);
    }

    
    public static boolean solution(int[] nums) {            
        //long startTime = System.nanoTime();
        
        Map<Object, Object> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){            
            map.put(nums[i], nums[i]);
        }                

        //long estimatedTime = System. nanoTime () - startTime;
        //double timeInMillis = estimatedTime / 1_000_000.0;
        //System.out.println("Solution 1:" + timeInMillis + " ms");

        return map.size() < nums.length;
    }
}


/*
# Contains Duplicate
**Link:** https://leetcode.com/problems/contains-duplicate/description/

## Problem
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if **every element is distinct**.

### Example 1
Input: nums = [1,2,3,1]  
Output: true  
Explanation: The element 1 occurs at indices 0 and 3.

### Example 2
Input: nums = [1,2,3,4]
Output: false  
Explanation: All elements are distinct.

### Example 3
Input: nums = [1,1,1,3,3,4,3,2,4,2]  
Output: true

## Constraints
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9



References:
- https://stackoverflow.com/questions/6895192/find-duplicate-values-in-java-map

*/