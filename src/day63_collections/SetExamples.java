package day63_collections;

import apple.laf.JRSUIUtils;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // list -> ArrayList

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");

        System.out.println(words);

        for (String word: words){

        }

        //convert Set to a List
        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);
        System.out.println(wordsList.get(1));


        //LinkedHashSet

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("#!");
        linkedHashSet.add("52");
        linkedHashSet.add("apple");
        linkedHashSet.add("java");
        linkedHashSet.add("52");
        linkedHashSet.add("cucumber");
        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("#!");
        treeSet.add("52");
        treeSet.add("apple");
        treeSet.add("java");
        treeSet.add("52");
        treeSet.add("Cucumber");
        System.out.println(treeSet);




    }
}
