import java.util.HashMap;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int index = 0;
        int count = 0;
        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                nums[index++] = key;
                nums[index++] = key;
                count += 2;
            }else{
                nums[index++] = key;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {-3,-1,0,0,0,3,3};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
