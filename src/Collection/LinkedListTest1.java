package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest1 {
    public static void main(String[] args) {
        var staff = new LinkedList<String>();
        staff.add("jin");
        staff.add("ze");
        staff.add("ming");
        Iterator<String> iter = staff.iterator();
        String first = iter.next();
        String second = iter.next();
        iter.remove();
        for (String name: staff)
            System.out.println(name);

        var stu = new LinkedList<String>();
        stu.add("jin");
        stu.add("ze");
        stu.add("ming");
        ListIterator<String> it = stu.listIterator();
        it.next();
        it.add("xiao");
        for (String name: stu)
            System.out.println(name);
    }
}
