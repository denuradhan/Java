package KUIS;
public class LinkedListMain {
        static LinkedList data = new LinkedList();
    public static void main(String[] args)throws Exception{
        data.addFirst("dharma", 12, 75);
        data.addLast("denny", 11, 90);
        data.addLast("yusril", 12, 85);
        data.print();
        data.sorting();
        data.print();
    }
}
