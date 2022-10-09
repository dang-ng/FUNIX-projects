import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        List<String> abc = new ArrayList<>();
        abc.add("1");
        abc.add("2");
        abc.add("3");

        ListIterator<String> a = abc.listIterator();

//        for (ListIterator<String> i = abc.listIterator();i.hasNext();) System.out.print(i.next() + " ");

        a.add("27");

        for (ListIterator<String> i = abc.listIterator();i.hasNext();) System.out.print(i.next() + " ");
    }
}