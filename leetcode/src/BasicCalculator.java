import java.util.*;
public class BasicCalculator {
    public static int calculate(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int num = 0;
        char sign = '+';
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                StringBuilder sb = new StringBuilder();
                while(Character.isDigit(ch)){
                    sb.append(ch);
                    i++;
                    if(i < s.length()){
                        ch = s.charAt(i);
                    }else{
                        break;
                    }
                }
                i--;

                num = Integer.parseInt(sb.toString());
            }
            if((!Character.isDigit(ch) && ' ' != ch) || i == s.length() - 1 ){
                if(sign == '+'){
                    stack.push(num);
                }
                if(sign == '-'){
                    stack.push(-num);
                }
                if(sign == '*'){
                    stack.push(stack.pop() * num);
                }
                if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                sign = ch;
                num = 0;
            }
        }
        for(int i : stack){
            res += i;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(calculate("3+2*2"));
    }
}
