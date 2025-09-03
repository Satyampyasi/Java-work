package Array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

//class StringLengthComparator1 implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//    }
//}
//
//class MyComparator1 implements Comparator<Integer> {
//    @Override
//    public int compare(Integer i1, Integer i2) {
//        return i2 - i1; // Sorts in descending order
//    }
//}

public class Comparatorex2 {  // Changed to avoid conflict with java.util.Comparator
    public static void main(String[] args) {
        // Sorting Integers in descending order
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.sort((a,b)->b-a);
        System.out.println(list); // [3, 2, 1]

        // Sorting Strings by length
        List<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "date"));
        words.sort((a,b)-> b.length()-a.length());
        System.out.println(words); // ["date", "apple", "banana"]
    }
}