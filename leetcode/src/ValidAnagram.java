public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            num ^= (1 << (s.charAt(i) - 'a'));
        }
        for(int i = 0; i < t.length(); i++){
            num ^= (1 << (t.charAt(i) - 'a'));
        }
        return num == 0;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("aa", "bb"));
    }
}
