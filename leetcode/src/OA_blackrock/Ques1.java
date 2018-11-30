package OA_blackrock;
import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double PP = scanner.nextDouble();
        double CH = scanner.nextDouble();
        StringBuffer result = new StringBuffer();
        double change = CH - PP;

        if(PP > CH) System.out.println("ERROR");
        else if(PP == CH) System.out.println("ZERO");
        else{
            while(change - 0 > 0.00000001){
                HashMap<String, Double> map = new HashMap<>();
                if(change / 100 >= 1){
                    result.append("ONE HUNDRED,");
                    change %= 100;
                }
                else if(change / 50 >= 1){
                    result.append("FIFTY,");
                    change %= 50;
                }
                else if(change / 20 >= 1){
                    result.append("TWENTY,");
                    change %= 20;
                }
                else if(change / 10 >= 1){
                    result.append("TEN,");
                    change %= 10;
                }
                else if(change / 5 >= 1){
                    result.append("FIVE,");
                    change %= 5;
                }
                else if(change / 2 >= 1){
                    result.append("TWO,");
                    change %= 2;
                }
                else if(change / 1 >= 1){
                    result.append("ONE,");
                    change %= 1;
                }
                else if(change / 0.5 >= 1){
                    result.append("HALF DOLLAR,");
                    change %= 0.5;
                }
                else if(change / 0.25 >= 1){
                    result.append("QUARTER,");
                    change %= 0.25;
                }
                else if(change / 0.1 >= 1){
                    result.append("DIME,");
                    change %= 0.1;
                }
                else if(change / 0.05 >= 1){
                    result.append("NICKEL,");
                    change %= 0.05;
                }
                else if(change >= 0.01 ){
                    result.append("PENNY,");
                    change %= 0.01;
                }
                else{
                    break;
                }
            }
        }
//        System.out.println(change);
//        System.out.println(change % 0.05 / 0.01 );
        result.deleteCharAt(result.length() - 1);
        System.out.println(result.toString());
    }

}
