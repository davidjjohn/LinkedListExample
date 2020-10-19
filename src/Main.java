// Simple example to illustrate a Java LinkedList
//
// David John
// October, 2020

import java.util.LinkedList;
import java.util.ListIterator;


public class Main {

    // declaration of LinkedList
    private static LinkedList<fruit> mylist;

    public static void main(String[] args) {

        // mylist is the empty linked list
        mylist = new LinkedList<fruit>();

        String special = "Pear";

        // add various fruit objects in various ways
        mylist.add(new fruit("Apple", "yellow", 5));
        mylist.add(new fruit("Grape", "red", 1));
        mylist.add(1,new fruit("Tangerine", "orange", 4));
        mylist.add(new fruit("Pear", "Green", 5));
        mylist.add(new fruit( "Watermellon", "Zebra", 10));
        mylist.add(new fruit("Pear", "Golden", 6));
        mylist.add(new fruit( "Cantalope", "LightOrange",7));

        // set up a ListIterator to traverse the LinkedList
        ListIterator<fruit> current = mylist.listIterator();
        System.out.println("Traversing the entire linked list (front to back)");
        while(current.hasNext()){
            System.out.print("  "+current.nextIndex() + ": ");
            System.out.println(current.next());
        }

        // use the iterator to traverse the list and to find all the special
        // fruits
        System.out.println();
        System.out.println("The nodes containing " + special + " are: ");

        // initialize ListIterator
        current = mylist.listIterator();
        while (current.hasNext()){
            fruit XXX = current.next();
            if (XXX.fruitmatch("Pear")){
                System.out.println(XXX);
            }
        }

    }
}
