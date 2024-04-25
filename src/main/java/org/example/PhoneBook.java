package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static Map<String, String> phoneBook = new HashMap<>();
    public static int add(String name, String phoneNumber) {
       phoneBook.put(name, phoneNumber);
       return phoneBook.size();
    }
}
