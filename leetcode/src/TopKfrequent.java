import java.util.*;

public class TopKfrequent {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if(k == 0){
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(7, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1 - o2;
            }
        });
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(entry.getValue());
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(pq.contains(entry.getValue())){
                res.add(entry.getKey());
            }
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(topKFrequent(new int[] {1,1,1,2,2,3}, 2));
    }
}
