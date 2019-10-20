package jobsheet10Tugas;
public class NewLinkedListTest {
    static NewLinkedList data = new NewLinkedList();
    static NewStack stack  = new NewStack();
    
    public static void main(String[] args)throws Exception{
        data.addFirst("denny", "11");
        data.addLast("dharma", "13");
        data.print();
    }
}
