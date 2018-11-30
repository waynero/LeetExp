

import java.util.*;

public class Test {
    private String name;
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zhen", 1);
        map.put("wei", 2);
//        int[] arr = {1,2};
//        for(int each : arr){
//            System.out.println(each);
//        }
//        for(Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        for(String key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}

class Thread1 extends Thread{
    private String s;
    public Thread1(String a){
        s = a;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.print(s + " saying: ");
            if(s.equals("lwy")){
                System.out.println("okay");
            }else{
                System.out.println("love you!!!");
            }
            try{
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

