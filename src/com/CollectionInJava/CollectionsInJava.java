package com.CollectionInJava;

import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
//        CollectionDemo();
        /// list
        /*
        features:
         --> it allow the duplicate
         --> it allow the null
         --> Dynamic Array
         --> maintain order
         branches:
            -->ArrayList
            -->LinkedList
            -->Vector
                -->stack
         */
//        ArrayListDemo();
//        LinkedListExample();
//        exampleVector();
//        StackDemo();
        /// set
        /*
        Features :
            --> it allow unique only
            --> null not allowed
            --> Does not maintain insertion order by default.
            --> Fast search and retrieval
        branch:
            -->hashedSet
                -->LinkedHashSet
            -->sortedSet
                -->TreeSet
         */
//        hashSetDemo();
        LinkedHashSetDemo();
    }

    public static void CollectionDemo() {

        Collection<String> names = new ArrayList<>();
        // methods in collection which was same for all the child in the collection
        // like arraylist list etc...

        names.add("Arun");
        names.add("Vijay");
        names.add("Kumar");

        System.out.println(names);
    }

    private static void ArrayListDemo() {
///     List is a child interface of Collection.
        List<String> list = new ArrayList<>();

        // 1. add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicates allowed

        // 2. add(index, value)
        list.add(1, "React");

        // 3. get()
        System.out.println("Element at index 2: " + list.get(2));   //python

        // 4. set()
        list.set(2, "Spring");

        // 5. remove(index)
        list.remove(3);

        // 6. remove(object)
        list.remove("Java"); // removes first "Java"

        // 7. contains()
        System.out.println("Contains Python? " + list.contains("Python"));

        // 8. size()
        System.out.println("List size: " + list.size());

        // 9. indexOf() and lastIndexOf()
        list.add("React");
        System.out.println("First index of React: " + list.indexOf("React"));
        System.out.println("Last index of React: " + list.lastIndexOf("React"));

        // 10. subList()
        System.out.println("Sublist: " + list.subList(0, 2));

        // 11. clear()
        list.clear();

        // 12. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // Print list
        System.out.println(list);

    }

    public static void LinkedListExample() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.addFirst(5);
        list1.addLast(25);
        System.out.println(list1); // [5, 10, 20, 25]


        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list); // [A, B, C]

///methods
///  Adding methods
        // 1.add
        list.add("D");

        // 2. add by index wise
        list.add(1, "E");

        // 3.add in first1
        list.addFirst("Start");

        // 4.add in last
        list.addLast("End");

        /// Removing Elements

        // 5.removes first
        list.remove();

        // 6.removes  by index
        list.remove(2);

        // 7.removes  by element
        list.remove("B");

        // 8. removes in first
        list.removeFirst();

        //9. removes in last
        list.removeLast();

        // 10. removes all the elements
//        list.clear();

        ///  Accessing Elements

        // 11. get by index
        System.out.println(list.get(0));

        //12. get by first
        System.out.println(list.getFirst());

        //12. get by last
        System.out.println(list.getLast());

        //13. check is it there or not
        System.out.println(list.contains("C"));

        //14. check the size ot length
        System.out.println(list.size());

        // 15. check is it empty
        System.out.println(list.isEmpty());

        /// Iterating LinkedList

        // For-each loop
        for (String item : list) {
            System.out.println(item);
        }

// Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

// Java 8 forEach
        list.forEach(System.out::println);

    }

    /*
           ✅ Why Use Vector?

           1.Thread Safety:
               If multiple threads are accessing a list concurrently, Vector ensures safe operations.

           Dynamic Array:
               Like ArrayList, it resizes automatically when capacity is exceeded.

           Legacy Support:
                Vector is a legacy class, but still supported for older codebases.
           */

    public static void exampleVector() {
        Vector<String> vector = new Vector<>();
//        Default capacity = 10 ✅

        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("A"); // duplicate allowed

        System.out.println("Vector: " + vector); // [A, B, C, A]

        vector.add(1, "D"); // Insert at index 1
        System.out.println("After insert at index 1: " + vector); // [A, D, B, C, A]

        vector.remove("B"); // Remove element B
        System.out.println("After removing B: " + vector); // [A, D, C, A]

        System.out.println("Element at index 2: " + vector.get(2)); // C


    }


    public static void  StackDemo() {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack); // [A, B, C]

        //1. Peek top element
        System.out.println("Peek: " + stack.peek()); // C

        // 2.Pop element
        System.out.println("Pop: " + stack.pop()); // C
        System.out.println("Stack after pop: " + stack); // [A, B]

        // 3.Check empty
        System.out.println("Is empty? " + stack.isEmpty()); // false

        // 4.Search element
        System.out.println("Position of 'A': " + stack.search("A")); // 2 (from top)
    }

    /*
        hashset:
            limitation:
                --> HashSet does not allow insertion at a specific position
                    (like “middle” or by index)
           Features :
                --> No duplicates
                --> No order
                --> No index-based insertion
     */
    public static  void  hashSetDemo() {
        Set<String> set = new HashSet<>();

        // add elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // duplicate ignored
        System.out.println("Set: " + set); // [A, B, C]

        // contains
        System.out.println("Contains B? " + set.contains("B")); // true

        // remove
        set.remove("B");
        System.out.println("After remove: " + set); // [A, C]

        // size & isEmpty
        System.out.println("Size: " + set.size()); // 2
        System.out.println("Is empty? " + set.isEmpty()); // false

        // iterator
        System.out.print("Iterating: ");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " "); // A C
        }

        // addAll, removeAll, retainAll
        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("D");
        set.addAll(set2); // [A, C, D]
        System.out.println("\nAfter addAll: " + set);

        set.retainAll(set2); // keeps only elements in set2 -> [C, D]
        System.out.println("After retainAll: " + set);

        set.removeAll(set2); // removes all elements in set2 -> []
        System.out.println("After removeAll: " + set);
    }

    /*
     LinkedHashedSet:

     purpose :
        -->Maintain insertion order
        -->Store unique elements
        -->Faster than TreeSet
        -->Use in scenarios where order matters
     */
    public static void LinkedHashSetDemo() {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add elements
        set.add("A");
        set.add("B");
        set.add("D");
        set.add("A"); // duplicate ignored
        System.out.println("Set: " + set); // [A, B, C]

        // contains
        System.out.println("Contains B? " + set.contains("B")); // true

        // remove
//        set.remove("B");
        System.out.println("After remove: " + set); // [A, C]

        // size & isEmpty
        System.out.println("Size: " + set.size()); // 2
        System.out.println("Is empty? " + set.isEmpty()); // false

        // iterator
        System.out.print("Iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // A C
        }

        // addAll
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("C");
        set.addAll(set2); // [A, C, D]
        System.out.println("\nAfter addAll: " + set);

        // retainAll
        set.retainAll(set2); // keeps only [C, D]
        System.out.println("After retainAll: " + set);

        // removeAll
        set.removeAll(set2); // []
        System.out.println("After removeAll: " + set);
    }


}
//HashSet vs LinkedHashSet vs TreeSet with methods, real-time examples, pros/cons, and interview tips.