
import java.util.*;

public class Wordladder {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new LinkedList<>();
        List<String> temp = new LinkedList<>();
        HashSet<String> set = new HashSet<>(wordList);
        temp.add(beginWord);
        if(set.contains(endWord)){
            helper(beginWord, endWord, set, temp, result);
        }
        return result;
    }
    private void helper(String beginWord, String endWord, HashSet set, List<String> temp, List<List<String>> result){
        if(beginWord.equals(endWord)){
            List<String> list = new LinkedList<>(temp);
            if(result.isEmpty()){
                result.add(list);
            }else{
                List<String> prev = result.get(0);
                if(prev.size() == list.size()){
                    result.add(list);
                }else if(prev.size() > list.size()){
                    result.clear();
                    result.add(list);
                }
            }
            return ;
        }
        for(int i = 0; i < beginWord.length(); i++){
            char[] array = beginWord.toCharArray();
            for(char ch = 'a'; ch <= 'z'; ch++){
                array[i] = ch;
                String word = new String(array);
                if(set.contains(word)){
                    set.remove(word);
                    temp.add(word);
                    helper(word, endWord, set, temp, result);
                    set.add(word);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
    public static void main(String[] args){
        Wordladder impl = new Wordladder();
        String begin = "hit";
        String end = "cog";
        String[] array = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(impl.findLadders(begin, end, Arrays.asList(array)));
    }
}
