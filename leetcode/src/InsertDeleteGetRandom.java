import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static HashMap<Integer, Integer> map;
    public static ArrayList<Integer> list;
    Random rand = new Random();
    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            int index = list.size();
            map.put(val, index);
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int loc = map.get(val);
            map.remove(val);
            list.remove(loc);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {

        return list.get(rand.nextInt(list.size()));
    }
    public static void main(String[] args){
        InsertDeleteGetRandom impl = new InsertDeleteGetRandom();
        impl.insert(3);
        impl.insert(-2);
        impl.remove(2);
        impl.insert(1);
        impl.insert(-3);
        impl.insert(-2);
        impl.remove(-2);
        impl.remove(-3);
    }
}
