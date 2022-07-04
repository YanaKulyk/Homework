package yana.kulyk.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddWords {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("роман");
        arrayList.add("лоза");
        arrayList.add("ролики");


        for (String s : arrayList) {
            System.out.println(s);
        }

        arrayList.listIterator();

    }
}
