import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyBeautifulList<Integer> mylist = new MyBeautifulList<>();
        mylist.add(1);
        mylist.add(8);
        mylist.add(4);
        mylist.add(4);
        mylist.add(14);
        mylist.add(34);
        mylist.add(10);
        for (int i = 0; i < mylist.getSize(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("---------------");
        mylist.remove(1);
        for (int i = 0; i < mylist.getSize(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println("-----------------");
        System.out.println(mylist);
        System.out.println("-----------------");
        /// find index with element name
        mylist.findIndex(1);
        System.out.println("------------------");
        System.out.println(mylist.getLastElement());
        System.out.println("------------------");
        System.out.println(mylist.getFirstElement());
        System.out.println("------------------");
        System.out.println(mylist.contains(34));
        System.out.println("------------------");
        mylist.clear();
        System.out.println(mylist.toString());
        System.out.println("------------------");
        mylist.add(4);
        mylist.add(8);
        mylist.add(4);
        mylist.add(4);
        mylist.add(14);
        mylist.add(9);
        mylist.add(34);
        mylist.add(10);
        List<Integer> ls = new ArrayList<>();

    }
}