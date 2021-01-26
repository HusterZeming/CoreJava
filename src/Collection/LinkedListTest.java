package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("jin");
        a.add("ze");
        a.add("ming");

        var b = new LinkedList<String>();
        b.add("xiaoming");
        b.add("xiaoli");
        b.add("xiaozhao");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext()){
            if(aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);
    }
}
