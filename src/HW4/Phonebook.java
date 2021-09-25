package HW4;

import java.util.ArrayList;
import java.util.HashMap;
    public class Phonebook {
        private HashMap<String, ArrayList<String>> phoneBook = new Hashmap();

        public void add(String lastName, int phoneNumber) {
            ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
            phonesForLastName.add(String.valueOf(phoneNumber));
            phoneBook.put(lastName, phonesForLastName);
        }

        public ArrayList<String> get(String lastName) {
            return phoneBook.get(lastName);
        }

        public static void main(String[] args) {
            Phonebook phonebook = new Phonebook();
            phonebook.add("Поттер", 899900);
            phonebook.add("Уизли", 890975367);
            phonebook.add("Малфой", 6555778);
            phonebook.add("Грейнджер", 6789907);
            phonebook.add("Малфой", 7895438);

            System.out.println(phonebook.get("Малфой"));
        }
    }
