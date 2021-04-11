package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap <String, List<String>>  phoneBook = new HashMap <String, List<String>>();

    public PhoneBook () {

    }

    public void add (String name, String phone) {
        boolean nameFound = false;
        List<String> s = new ArrayList<String>();
        for (Map.Entry<String, List<String>> o : phoneBook.entrySet()) {
            if (o.getKey().equals(name)) {
                s = o.getValue();
                if (!s.equals(phone)) {
                    s.add(phone);
                    o.setValue(s);
                    nameFound = true;
                }
            }
        }
        if (!nameFound) {
            s.add(phone);
            phoneBook.put(name, s);
        }
    }

    public void get (String name) {
        System.out.println("Телефонные номера " + name + ":");
        for (Map.Entry<String, List<String>> o : phoneBook.entrySet()) {
            if (o.getKey().equals(name)) {
                for (String s : o.getValue()) {
                    System.out.println(s);
                }
            }
        }
    }
}
