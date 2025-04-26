import java.util.*;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int[] newNums = new int[nums.length];
        int setSize = 0;
        for(int i=0 ; i < nums.length; i++){
            if(!numSet.contains(nums[i])){
                
                numSet.add(nums[i]);
                newNums[setSize] = nums[i];
                setSize++;
            }
        }
       
     //  Integer[] numSetArr = numSet.toArray();
        Integer[] numSetArr = numSet.toArray(new Integer[numSet.size()]);
        for(int i = 0; i< setSize; i++ ){
            nums[i] = newNums[i];
        }
        
        return setSize;
    }
}
