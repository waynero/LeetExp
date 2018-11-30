import java.util.Scanner;

public class CamelTransform {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int j = 0; j < n; j++){
            String a = in.next();
            StringBuilder sb = new StringBuilder();
            StringBuilder res = new StringBuilder();
            boolean mark = false;
            for(int i = 0; i < a.length(); i++){
                char ch = a.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    sb.append(ch);
                    mark = false;
                }else{
                    if(mark && (i == a.length() - 1 || a.charAt(i + 1) <= 'Z')){

                        sb.append((char) (ch + 32));
                    }else{
                        if(res.length() == 0){
                            res.append(sb);
                        }else{
                            res.append("_").append(sb);
                        }
                        sb = new StringBuilder();
                        char c = (char) (ch + 32);
                        sb.append(c);
                    }
                    mark = true;
                }
            }
            if(sb.length() != 0){
                if(res.length() == 0){
                    res.append(sb);
                }else{
                    res.append("_").append(sb);
                }

            }
            System.out.println(res.toString());
        }
    }
}
