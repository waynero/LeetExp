import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ComparatorSort {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        ListIterator<Integer> iterator = list1.listIterator();
    }
    private static String deleteX (String st, int index){
        if(index == st.length()){
            return st;
        }
//        if(st.charAt(index) == 'X'){
//
//        }
//        try{
//            File file = new File("1");
//            BufferedReader buf = new BufferedReader(new Re);
//        }catch (FileNotFoundException e){
//            System.out.println();
//        }
        return null;
    }
}

class Student implements Comparable<Student>{
    String name;
    int score;
    public Student (String name, int score){
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student other) {

        return this.name.compareTo(other.name);
    }
}

class ComparatorStu implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        return b.score == a.score ? a.name.compareTo(b.name) : b.score - a.score;
    }
}