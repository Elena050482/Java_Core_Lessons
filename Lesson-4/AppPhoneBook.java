/**
 * Java Core
 * Homework 4
 * autho - Zavarzina Elena
 * data - 31.05.2022
 */


import java.util.HashMap;
import java.util.HashSet;


public class AppPhoneBook {
    
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Zavarzina", 33885577);
        phoneBook.add("Sokolov", 495445688);
        phoneBook.add("Sokolov", 892736963);
        phoneBook.add("Ivanov", 56789012);
        phoneBook.add("Sidorov", 335889615);
        phoneBook.add("Sidorov", 892737322);

        phoneBook.get("Sokolov");
        phoneBook.get("Zavarzina");
        phoneBook.get("Ivanov");
        phoneBook.get("Sidorov");
    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1 = new HashMap<>();
    
    public void add(String surname, int num) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(surname, new HashSet<>());
        phoneBook.add(num);
        phoneBook1.put(surname, phoneBook);
    }

    public void get(String surname) {

        System.out.printf("%nКонтакт "+surname+": "+ phoneBook1.getOrDefault(surname, new HashSet<>()));
    }
}



