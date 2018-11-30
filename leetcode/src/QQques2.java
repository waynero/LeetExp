import java.util.*;
public class QQques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 2;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        String st = "11101111";
        for(int i = 0; i < st.length(); i++){
            list.add(st.charAt(i) - '0');
        }
        int left = 0;
        while(left < list.size()){
            for(int i = left; i < list.size(); i++){
                if(helper(list, left, i, k)){
                    count++;
                }
            }
            left++;
        }
        System.out.print(count);
    }
    private static boolean helper(List<Integer> list, int left, int right, int k){
        for(int i = left; i <= right; i++){
            if(list.get(i) == 1){
                k--;
            }
        }
        return k == 0;
    }
}
