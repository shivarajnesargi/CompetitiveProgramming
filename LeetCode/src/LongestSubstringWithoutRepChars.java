import java.util.HashMap;

/**
*Author:Shivraj
*Date :Feb 19, 2018
*Time :7:52:58 PM
*Place:Brooklyn,Newyork
*
*/


public class LongestSubstringWithoutRepChars {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        int res=0;
       for(int i=0,j=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               j = Math.max(j,map.get(s.charAt(i))+1);
           }
           map.put(s.charAt(i),i);
           res = Math.max(res,i-j+1);
       }
        return res;
    }
}

