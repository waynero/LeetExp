import java.util.*;
public class Rallyhealth {
    public void addOperator(String num, int target) {
        List<String> res = new ArrayList<>();
        if(num == null || num.length() == 0){
            return;
        }
        helper(num, target, res, 0, 0L, "", 0L);
        if(res.size() == 0){
            res.add("impossible");
        }
        for(String s : res){
            System.out.println(s);
        }
    }
    private void helper(String num, int target, List<String> res, int index, long val, String path, long pre){
        if(index == num.length()){
            if(target == val){
                res.add(path);
            }
            return;
        }
        for(int i = index; i < num.length(); i++){
            if(i != index && num.charAt(index) == '0') break;
            long cur = Long.parseLong(num.substring(index, i + 1));
            if(i == 0 || path == ""){
                helper(num, target, res, i + 1, val + cur, path + cur, cur);
            }else{
                helper(num, target, res, i + 1, val + cur, path + "+" + cur, cur);
                helper(num, target, res, i + 1, val - cur, path + "-" + cur, -cur);
                helper(num, target, res, i + 1, val - pre + cur * pre, path + "*" + cur, cur * pre);
            }

        }
    }
    public static void main(String[] args){
        Rallyhealth impl = new Rallyhealth();
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        while(scanner.hasNext()){
            impl.addOperator(scanner.next(), target);
            System.out.println("");
        }
    }
}
