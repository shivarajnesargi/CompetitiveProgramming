import java.util.HashMap;

/**
*Author:Shivraj
*Date :Feb 17, 2018
*Time :11:37:04 AM
*Place:Brooklyn,Newyork
*
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
       int[] result={-1,-1};
        
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       
       for(int i=0;i<nums.length;i++)
       {
           int pair=target-nums[i];
           if(map.containsKey(pair))
           {
               result[0]=map.get(pair);
               result[1]=i;
               if(result[0]!=result[1]) return result;
           }
           map.put(nums[i],i);
           
       }
       
        
        return result;
    }
}
