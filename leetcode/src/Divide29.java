public class Divide29 {
    public static int divide(int dividend, int divisor) {
        int sign = 1;
        if(dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0){
            sign = -1;
        }

        long dend = Math.abs((long) dividend);
        long sor = Math.abs((long) divisor);

        long temp = dend;
        long div = sor;
        long count = 1;
        long result = 0;
        while(temp >= sor){
            if(temp > div){
                div += div;
                count += count;
            }
            if(temp < div){
                div = sor;
                count = 1;
            }
            temp -= div;
            result += count;
        }
        if(result == Integer.MAX_VALUE || result == Integer.MIN_VALUE){
            if(sign == 1) return Integer.MAX_VALUE;
            else return Integer.MAX_VALUE;
        }
        return (int)(sign * result);
    }
    public static void main(String[] args){
        int dividend = -2147483648;
//        System.out.println(Math.abs((long) end));
//        System.out.println(end == Integer.MIN_VALUE);
        int divisor = -1;
        int res = divide(dividend, divisor);
        System.out.println(res);
    }
}
