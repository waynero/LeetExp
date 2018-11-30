package OA_blackrock;
import java.text.DecimalFormat;
import java.util.*;
public class MonthlyPayment {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        String first = scanner.nextLine();
        String first = "5000~5~6~0";
        String[] array = first.split("~");
        double loan = Double.parseDouble(array[0]);
        double month = Double.parseDouble(array[1]) * 12;
        double monrate = Double.parseDouble(array[2]) / 1200;
        double firstpay = Double.parseDouble(array[3]);

//        double mys = 116 * (1 - Math.pow(1 + monrate, -month)) / loan;
        double monthpay = (monrate * (loan - firstpay)) / (1 - Math.pow(1 + monrate, -month));
        DecimalFormat deci = new DecimalFormat("0.00");
        deci.format(monthpay);
        System.out.println(deci.format(monthpay));
//        System.out.println(mys);
        int interest = (int) Math.round(monthpay * month - loan);
        System.out.println(interest );
    }

}
