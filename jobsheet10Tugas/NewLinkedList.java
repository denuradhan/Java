package jobsheet10Tugas;
public class NewLinkedList {
    NewNode head;
    int size;
    Mahasiswa mhs;
    public NewLinkedList(){
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
            }else{
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
    public void addLast(String nama, String nim){
        if (isEmpty()) {
            addFirst(nama, nim);
        }else{
            NewNode tmp = head;
            while(tmp.next !=null){
                tmp = tmp.next;
            }
            mhs = new Mahasiswa(nama, nim);
            tmp.next= new NewNode(mhs, null);
            size++;
        }
    }
    public Mahasiswa getFirst() throws Exception{
        if(isEmpty()) throw new Exception("LinkedList Kosong");
        return head.data;
    }
    public Mahasiswa getLast() throws Exception{
        if(isEmpty()) throw new Exception("LinkedList Kosong");
        NewNode tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Mahasiswa get(int index) throws Exception{
        if(isEmpty()||index>=size) throw new Exception("Nilai Index di luar batas");
        NewNode tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void getKey(String item) throws Exception {
        if(isEmpty()) throw new Exception("Nilai Index di luar batas");
        int temp =-1;
        for (int i = 0; i < size; i++) {
            if (get(i).nama.equalsIgnoreCase(item)) {
                temp = i;
            }
        }
        if(temp == -1){
            System.out.println("Pencarian tidak ditemukan");
        }else{
            NewNode tmp = head;
            for (int i = 0; i < temp; i++) {
                tmp = tmp.next;
            }
            System.out.println("Search by (Nama / NIM) : ");
            tmp.data.print();
            System.out.println();
        }
    }
    public void removeFirst() throws Exception{
        Mahasiswa tmp = getFirst();
        head = head.next;
        size--;
    }
    public void remove(int index)throws Exception{
        if(isEmpty()||index>=size) throw new Exception("Nilai diluar Batas");
        if(index==0){
            removeFirst();
        }else{
            NewNode prev = head;
            NewNode cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    public void removeKey(String item) throws Exception{
        if(isEmpty()) throw new Exception("Nilai Indeks di luar batas");
        int temp =-1;
        if (get(0).nama.equalsIgnoreCase(item)||get(0).nim.equalsIgnoreCase(item)) {
            removeFirst();
        }else{
            for (int i = 1; i < size; i++) {
                if (item.equalsIgnoreCase(get(i).nama)||item.equalsIgnoreCase(get(i).nim)){
                    temp  = i;
                }
            }
            NewNode prev = head;
            NewNode cur = head.next;
            for (int i = 1; i < temp; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    public void print(){
        System.out.println("PRINT");
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
}