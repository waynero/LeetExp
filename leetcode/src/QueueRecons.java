import java.util.*;

public class QueueRecons {
    public int[][] reconstructQueue(int[][] people) {
        if(people == null || people.length == 0){
            return people;
        }
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        List<int[]> a = new ArrayList<>();
        for(int i = 0; i < people.length; i++){

        }
        a.contains(new int[2]);
        String b = "123";
        b.startsWith("");
        return people;

    }
}
