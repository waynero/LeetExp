import java.util.*;
public class QQques1 {
    public static void main(String[] args) {
        int n = 6;
        int res = 0;
        List<Integer> list = new ArrayList<>();
//        while(in.hasNextInt()){
//            list.add(in.nextInt());
//        }
        list.add(3);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(1);
        list.add(0);

        int left = 0;
        int right = 1;
        while(left < list.size()){
            for(int i = left; i < list.size(); i++){
                if(helper(list, left, i)){
                    res = Math.max(i - left + 1, res);
                }
            }
            left++;
        }
        System.out.println(res);
    }
    private static boolean helper(List<Integer> list, int left, int right){
        int max = 0;
        for(int i = left; i <= right; i++){
            max = Math.max(list.get(i), max);
        }
        int v = 2;
        int count = 0;
        while(v <= max){
            count = 0;
            for(int i = left; i <= right; i++){
                if(list.get(i) % v == 0){
                    count++;
                }
            }
            if(count > (right - left) / 2){
                return true;
            }
            v++;
        }
        return false;
    }
}
