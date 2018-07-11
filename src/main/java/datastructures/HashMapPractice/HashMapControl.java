package datastructures.HashMapPractice;

public class HashMapControl {
    public static void main(String[] args) {

        HashMap<String, Number> hashMapPractice = new HashMap();

        // add data
        System.out.println(" ---- Added -----");
        hashMapPractice.add("Max", 31);
        hashMapPractice.add("Ashley", 30);
        hashMapPractice.add("Ryan", 36);
        System.out.println();

        // find data
        System.out.println(" --- finding ---");
        System.out.println(hashMapPractice.find("Max"));
        System.out.println();


        // remove data
        System.out.println(" ---- Deleted ----");
        hashMapPractice.delete("Ashley");
        hashMapPractice.delete("Max");
        System.out.println();


        // see current list
        System.out.println("-- Printing list --");
//        System.out.println(hashMapPractice.list());
        hashMapPractice.list();
        System.out.println();

        System.out.println("Storage size: " +hashMapPractice.getStorage());
    }
}
