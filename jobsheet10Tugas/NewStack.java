package jobsheet10Tugas;
public class NewStack {
    NewNode head;
    int size, i =0;
    Mahasiswa mhs;
    public NewStack(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nama, String nim){
        mhs = new Mahasiswa(nama, nim);
        head = new NewNode(mhs, head);
        size++;
    }
    public void add(String nama, String nim, int index)throws Exception{
        if (index<0 || index>size) throw new Exception("Nilai indeks diluar batas");
            if (isEmpty()||index==0) {
                addFirst(nama, nim);
            }
            else{
                NewNode tmp = head;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
                NewNode next = (tmp==null) ? null : tmp.next;
                mhs = new Mahasiswa(nama, nim);
                tmp.next = new NewNode(mhs, next);
                size++;
            }
            
    }
    public Mahasiswa getFirst() throws Exception{
        if(isEmpty()) throw new Exception("LinkedList Kosong");
        return head.data;
    }
    public void print(){
        
        if (!isEmpty()) {
            NewNode tmp = head;
            while (tmp != null){
                tmp.data.print();
                System.out.println();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkenList Kosong");
        }
        
    }
    public void removeFirst() throws Exception{
        Mahasiswa tmp = getFirst();
        head = head.next;
        size--;
    }
    public void push(String nama, String nim) throws Exception{
        add(nama, nim, size);
    }
    public void pop()throws Exception{
        System.out.println("==================");
        System.out.println("POP : ");
        getFirst().print();
        System.out.println("==================");
        System.out.println("ISI POP : ");
        removeFirst();
        print();
        System.out.println("==================");
    }
    
}
