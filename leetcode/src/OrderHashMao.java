import java.util.*;

public class OrderHashMao {
    public static void order(HashMap<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o1.getValue() - o2.getValue();
            }
        });

    }
}
