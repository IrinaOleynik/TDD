package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    static Map<String, String> phoneBook = new HashMap<>();
    public static int add(String name, String phoneNumber) {
       phoneBook.put(name, phoneNumber);
       return phoneBook.size();
    }
    public static String findByNumber(String phoneNumber) {
        if (phoneBook.containsValue(phoneNumber)) {
            for (Map.Entry<String, String> kv : phoneBook.entrySet()) {
                if (kv.getValue().equals(phoneNumber)) {
                    return kv.getKey();
                }
            }
        }
        return null;
    }
    public static String findByName(String name) {
        return phoneBook.get(name);
    }
    public static String printAllNames() {
        return phoneBook.keySet().stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining());
    }
}
