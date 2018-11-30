import java.util.*;
public class LongestsubstringII {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, int[]> map = new HashMap<>();
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0, j = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)[0] > 1){
                    j = Math.max(j, map.get(ch)[1] + 1);
                    map.get(ch)[1] = i;
                }else{
                    map.get(ch)[0]++;
                }

            }else{
                map.put(ch, new int[]{1, i});
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("bcaabb"));
    }
}
