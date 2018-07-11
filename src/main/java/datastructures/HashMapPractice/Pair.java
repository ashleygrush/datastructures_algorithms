package datastructures.HashMapPractice;

public class Pair <K,V> {

    K key;
    V value;
    Pair next;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "key = " + key +
                ", value = " + value +
                '}';
    }
}
