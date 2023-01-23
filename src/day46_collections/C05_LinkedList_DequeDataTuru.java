package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {

    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesud");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4); // [Cavidan, Mesud, Selim, Tevfik]
        System.out.println(ll4.pop());
    }
}
