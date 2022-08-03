package dev.andreamartz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// cannot rely on order in a set
    // but there are some set "flavors" where you can rely on the order - Nelson mentions LinkedHashSet and TreeSet as being among them
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> charactersSet = new HashSet<>();
        charactersSet.add('A');
        charactersSet.add('A');  // duplicates are not allowed in sets
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('D');

        Iterator<Character> iterator = charactersSet.iterator();

        while (iterator.hasNext()) {
            Character character = iterator.next();
            System.out.println(character);
        }

//        for (char character : charactersSet) {
//            System.out.println(character);
//        }
    }
}
