import java.util.*;

public class PossibleOrigin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        List<Integer> set = new ArrayList<>();
        for(int each : list){
            set.add(each);
        }
        int[] res = new int[1];
        helper(list, new ArrayList<Integer>(), set, res);
        System.out.println(res[0]);
    }
    private static void helper(List<Integer> list, List<Integer> part, List<Integer> remain, int[] res){
        int index = part.size();
        if(index == list.size()){
            for(int i = 0; i < index; i++){
                if(part.get(i) != list.get(i)){
                    return;
                }
            }
            res[0]++;
            return;
        }
        for(int i = 0; i < remain.size(); i++){
            int addindex;
            int each = remain.get(i);
            if(index == 0 || each > part.get(index - 1)){
                part.add(each);
                addindex = index;
            }else{
                addindex = 0;
                part.add(0, each);
            }
            remain.remove(i);
            helper(list, part, remain, res);
            remain.add(i, each);
            part.remove(addindex);
        }
    }
}
