/**
 * Java Core
 * Homework 4
 * autho - Zavarzina Elena
 * data - 31.05.2022
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListTaskOne {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("очки", "решетка", "Африка",
        "решетка", "грабли", "машина", "ягуар", "ягуар", "книга", "лампа", "одинадцатое слово", "жесть", "очки"));

        System.out.printf("Вся коллекция слов состоит из: %n" + words);


        Set<String> uniqWords = new LinkedHashSet<>(words);
        System.out.printf("%nУникальные слова это:%n " + uniqWords);


        HashMap<String, Integer> doubleWords = new HashMap<>();
        Integer doubleWord = null;
        for (String i : words) {
            doubleWord = doubleWords.get(i);
            doubleWords.put(i, doubleWord == null ? 1 : doubleWord + 1);
        }

         System.out.printf("%nКоличество слов в списке%n" + doubleWords);
    }
}
