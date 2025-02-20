package codewithfreddy;



public class Main {

    public static void main(String[] args) {

        DymanicArray dymanicArray = new DymanicArray();
        dymanicArray.add("A");
        dymanicArray.add("b");
        dymanicArray.add("c");
        dymanicArray.add("d");
        dymanicArray.add("X");


//        dymanicArray.insert(0,"freddy");
//        dymanicArray.delete("c");
//        System.out.println(dymanicArray.search("d"));

        System.out.println(dymanicArray);
        System.out.println("size: " + dymanicArray.size);
        System.out.println("capacity: " + dymanicArray.capacity);
        System.out.println("empty: " + dymanicArray.isEmpty());


    }
}
