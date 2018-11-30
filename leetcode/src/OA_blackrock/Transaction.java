package OA_blackrock;
import java.util.*;
public class Transaction {
    public static void main(String[] args){
        String input = "Vodafone,STOCK,10,50,0|Google,STOCK,15,50,0|Microsoft,BOND,15,100,0.05:Vodafone,STOCK,15,50,0|Google,STOCK,10,50,0|Microsoft,BOND,15,100,0.05";
        String[] market = input.split(":");
        HashMap<String, Integer> profolio = new HashMap<>();
        HashMap<String, Integer> benchmark = new HashMap<>();
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < market.length; i++){
            String[] para = market[i].split("\\|");
            for(int j = 0; j < para.length; j++){
                String[] para2 = para[j].split(",");
                String name = para2[0];
                int share = Integer.parseInt(para2[2]);
                if(i == 0){
                    profolio.put(name,share);

                }else{
                    benchmark.put(name, share);
                }
            }

        }
        for(String key: profolio.keySet()){
            int share_pro = profolio.get(key);
            int share_ben = benchmark.get(key);
            int transac = Math.abs(share_ben - share_pro);
            if(share_pro > share_ben){
                result.append("SELL," + key + "," + transac + "\n");
            } else if(share_ben > share_pro){
                result.append("BUY," + key + "," + transac + "\n");
            }
        }
        System.out.println(result.toString());
    }
}
