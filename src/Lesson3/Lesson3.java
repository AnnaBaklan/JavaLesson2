package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("Frodo");
        stringArray.add("Aragorn");
        stringArray.add("Legolas");
        stringArray.add("Gandalf");
        stringArray.add("Frodo");
        stringArray.add("Boromir");
        stringArray.add("Gimli");
        stringArray.add("Samwise");
        stringArray.add("Samwise");
        stringArray.add("Pippin");
        stringArray.add("Gandalf");
        stringArray.add("Frodo");
        stringArray.add("Boromir");
        stringArray.add("Merry");
        stringArray.add("Aragorn");
        stringArray.add("Arwen");
        stringArray.add("Elrond");
        stringArray.add("Pippin");
        stringArray.add("Gandalf");

        HashMap<String, Integer> countOfElement = getCountsOfEement(stringArray);
        printUniqElements(countOfElement);
        System.out.println();
        printCountOfElement(countOfElement);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Aragorn", "8-952-754-33-15");
        phoneBook.add("Arwen", "8-952-655-47-88");
        phoneBook.add("Arwen", "8-952-655-47-85");
        phoneBook.add("Boromir", "8-931-547-22-18");
        phoneBook.add("Gandalf", "8-921-854-76-98");
        phoneBook.add("Gandalf", "8-911-235-84-78");
        phoneBook.add("Frodo", "8-951-854-36-95");

        phoneBook.get("Aragorn");
        phoneBook.get("Arwen");
        phoneBook.get("Boromir");
        phoneBook.get("Gandalf");
        phoneBook.get("Frodo");


    }

    public static HashMap<String, Integer> getCountsOfEement (ArrayList <String> stringArray) {
        HashMap<String, Integer> countOfElement = new HashMap<String, Integer>();
        for (String element : stringArray) {
            if (countOfElement.containsKey(element)) {
               for (Map.Entry<String, Integer> o : countOfElement.entrySet()) {
                    if (o.getKey().equals(element)) {
                        o.setValue(o.getValue() + 1);
                    }
               }
            } else {
                countOfElement.put(element, 1);
            }
        }
        return countOfElement;
    }
    public static void printUniqElements (HashMap<String, Integer> countOfElement) {
        System.out.println("”никальные элементы:");
        for (Map.Entry<String, Integer> o : countOfElement.entrySet()) {
            if (o.getValue() == 1) {
                System.out.println(o.getKey());
            }
        }
    }
    public static void printCountOfElement (HashMap<String, Integer> countOfElement) {
        System.out.println("се эелементы:");
        for (Map.Entry<String, Integer> o : countOfElement.entrySet()) {
            System.out.println(o.getKey() + "\t" + o.getValue());
        }
    }
}
