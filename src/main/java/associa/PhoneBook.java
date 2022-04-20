package associa;

import java.util.*;
import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private Map<String, List<String>> phonebook;

//    public Map<String, List<String>> getPhonebook() {
//        return phonebook;
//    }

    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = map;
    }

    public PhoneBook() {
        phonebook = new HashMap<>();
        //initalizng a variable to a new hashmap
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phonebook.put(name, numbers);


    }

    public void addAll(String name, String... phoneNumbers) {
        // Create List
        List<String> numbers = new ArrayList<>();

        // Loop through the array phoneNumbers
        //numbers.addAll(Arrays.asList(phoneNumbers));


            numbers.addAll(Arrays.asList(phoneNumbers));

        // add too the list


        phonebook.put(name, numbers);
    }

    public void remove(String name) {
        phonebook.remove(name);

    }

    public Boolean hasEntry(String name) {
        boolean haveIt = false;
        if (phonebook.containsKey(name)) {
            haveIt = true;
        }
//        return phonebook.containsKey(name);
        return haveIt;
    }

    public List<String> lookup(String name) {
//        List<String> numbers = new ArrayList<>();
        List<String> numbers;
        numbers = phonebook.get(name);
        return numbers;

    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {

        List<String> contactNames = new ArrayList<>();
        for (String name : phonebook.keySet()) {
            contactNames.add(name);
        }
        return contactNames;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
