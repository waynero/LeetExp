public class NextPermutation {
    public static String next(String s){
        StringBuilder sb = new StringBuilder();
        helper(s, 0, sb);
        return sb.toString();
    }
    private static void helper(String s, int i, StringBuilder sb){
        if(i >= s.length() - 1){
            sb.append(s.charAt(i));
            return;
        }
        int index = 0;
        char ch = 'a';
        for(int j = i; j < s.length(); j++){
            if(s.charAt(j) > ch){
                index = j;
                ch = s.charAt(j);
            }
        }
        sb.append(ch);
        helper(s, index, sb);
    }
    public static void main(String[] args){
        System.out.println(next("1"));
    }
}
