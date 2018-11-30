import java.util.*;
public class BadKeyword {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String origin = in.nextLine();
        String origin = "abiiio";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // mark = true  means last time is input  ||  false means last time is delete
        boolean mark = true;
        char mem = ' ';
        for (int i = 0; i < origin.length(); i++) {
            char ch = origin.charAt(i);
            if (ch == 'i') {
                if (!stack.isEmpty()) {
                    mem = stack.pop();
                    mark = false;
                }
            } else if (ch == 'o') {
                if (mark) {
                    if (!stack.isEmpty()) {
                        mem = stack.pop();
                        mark = false;
                    }
                } else {
                    stack.push(mem);
                    mark = true;
                }
            } else {
                stack.push(ch);
                mark = true;
            }
        }
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        System.out.println(sb.toString());
    }
}
