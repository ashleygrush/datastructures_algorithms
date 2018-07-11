package datastructures.HashMapPractice;

/*
 *
 * When you complete the LinkedList - write a custom HashMap.
 * - the hashmap must have the following methods: add(), hash(), find(), remove(), resize(), list()
 * - the hashmap must elegantly handle conflicts using a LinkedList
 *
 */


//  hashmap example
//f_name = % (mod) array.length = index for f_name, value of age.
//
//can search for value by key "name"


import datastructures.LinkedListPractice.LinkedList;

// Hashmap class
class HashMap<K, V> {

    int size = 10;
    int counter;
    // size of map
    Pair<K, V>[] table;

    // constructor to call Hashmap
    public HashMap() {
        table = new Pair[size];
        counter = 0;
    }


    // HASH - index for key - builds the key
    public int hash(K key) {
        // key.hashCode creates code for key index
        int x = Math.abs(key.hashCode() % table.length);
        // return key(x)
        return x;
    }


    // ADD KEY/VALUE
    public void add(K key, V value) {

        // call method to get the key
        int hash = hash(key);


        // if no key currently exists; make new key/value
        if (table[hash] == null) {
            table[hash] = new Pair(key, value);
            // see value added
            System.out.println("value added.");
            // counter increases when new pair is added.
            counter++;
        } else {
            // otherwise create new key/value for the table
            // creating new key here...
            Pair<K, V> a = table[hash];


            // navigate to the end of the list
            while (a.next != null) {
                a = a.next;
            }

            // creates key/value at the end of the list
            a.next = new Pair(key, value);
            // counter increases when new pair is added.
            counter++;
            System.out.println("value added in index.");

        }

        // if not enough room; resize:
        if (counter > table.length * .70) {
            resize();

        }
    }


    public void resize() {
        Pair<K, V>[] old = table;
        table = new Pair[2 * table.length];
        for (Pair<K, V> pair : old) {
            // in case one array position is null, keep going over the array
            if (pair != null) {
                // copying the array head
                add(pair.getKey(), pair.getValue());
                // copying the linkedList of each position in the array
                while (pair.next != null) {
                    pair = pair.next;
                    add(pair.getKey(), pair.getValue());
                }
            } else {
                continue;
            }

        }
        System.out.println("resize has run");
    }


    // FIND KEY
    public V find(K key) {

        // declare hash/key
        int hash = hash(key);
        // see if key exists
        if (table[hash] == null) {
            // return null
            System.out.println("No key to find.");
            return null;
        }

        // declare value to move through list
        Pair<K, V> f = table[hash];

        // if key doesn't have a collision...
        while (f.getKey() != key) {

            // if no other links, return no links
            if (f.next == null) {
                return null;
            }
            // otherwise move to next link.
            f = f.next;
        }
        // return key value
        System.out.println(f);
        return f.getValue();
    }


    // REMOVE KEY/VALUE
    public void delete(K key) {

        // first see if key exists
        if (find(key) == null) {
            System.out.println("No key to remove.");
            return;
        }

        // create key
        int hash = hash(key);

        // assign value to move through the list
        Pair<K, V> m = table[hash];

        // check if there's a link to the value
        if (m.key == key) {

            // if no other values; key is removed
            if (m.key == null) {
                m = null;
                counter--;
                System.out.println("Removed key.");
            }
            // if other values, assign to next value
            else {
                m = m.next;

                // update table
                table[hash] = m;
                System.out.println("Key skipped.");
                return;
            }
        }

        //while key is not at the end of the list AND next one value is not the key; keep moving down the list.
        while (m.next != null && m.next.getKey() != key) {
            m = m.next;
        }
        // if key is found and not at the top of the list; skip to next key
        if (m.next.next != null) {
            m.next = m.next.next;
            System.out.println("Key is skipped.");
            return;
        }
        // if key is last in list, remove.
        if (m.next != null) {
            m.next = null;
        }
        m.next = null;
        System.out.println("Removed in index: " + m);
        counter--;
    }


    // LIST HASHMAP
    public LinkedList<K> list() {
        LinkedList<K> list = new LinkedList<K>();
        // for each to iterate through the table
        for (int i = 0; i < table.length; i++)
            if (table[i] != null) {
                // iterate through columns
                Pair<K, V> pair = table[i];
                System.out.println(pair);

                // loop through the list
                while (pair != null) {
                    pair = pair.next;
                    // if empty, return
//                    if (pair.next == null) {
//                        System.out.println("Nothing in list.");
//                        return null;
                }
            }
        return list;
    }


    public int getStorage() {
        System.out.println(" -- Storage -- ");
        return table.length;
    }

}


// TROUBLESHOOTING FOR RESIZING
//
//      while(Pair.next !=null)
//
//    {
//        Pair.next + Pair.m
//    }
//
// if statement to check if pair is NOT null