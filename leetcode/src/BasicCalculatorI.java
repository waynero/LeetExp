import java.util.*;

public class BasicCalculatorI {
    public static int calculate(String s) {
        int sign = 1;
        int num = 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                int temp = ch - '0';
                num += num * 10 + temp;
            }
            else if(s.charAt(i) == '+'){
                result += sign * num;
                num = 0;
                sign = 1;
            }else if(s.charAt(i) == '-'){
                result += sign * num;
                sign = -1;
                num = 0;
            }else if(s.charAt(i) == '('){
                result += sign * num;

                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            }else if(s.charAt(i) == ')'){
                result += sign * num;
                result *= stack.pop();
                result += stack.pop();
                num = 0;
            }

        }
        if(num != 0) result += num * sign;
        return result;
    }
    public static void main(String[] args){
//        System.out.println(calculate("2147483647"));
        System.out.println('1' - '0');
    }
}
