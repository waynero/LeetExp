public class ReverseWord {
    public static String reverseWords(String s) {
        String[] array = s.split(" ");
        if(array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i].length() != 0)
                sb.append(array[i]).append(" ");
        }
        int index = sb.length() - 1;
        sb = sb.deleteCharAt(index);
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(reverseWords(" 1") + 2 );
    }
}
