package KUIS;
public class LinkedList {
    Node head;
    int size;
    Mahasiswa mhs;
    public LinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nama, int nim, int nilai){
        mhs = new Mahasiswa(nama, nim, nilai);
        head = new Node(mhs, head);
        size++;
    }
    public void add(String nama, int nim, int nilai, int index)throws Exception{
       if(index<0||index>size) throw new Exception("Nilai index diluar batar");
        if (isEmpty()||index==0) {
            addFirst(nama, nim, nilai);
        }else{
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp==null) ? null : tmp.next;
            mhs = new Mahasiswa(nama, nim, nilai);
            tmp.next = new Node(mhs, next);
            size++;
        }    
    }
    public void addLast(String nama, int nim, int nilai){
        if(isEmpty()){
            addFirst(nama, nim, nilai);
        }else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            mhs = new Mahasiswa(nama, nim, nilai);
            tmp.next = new Node(mhs, null);
            size++;
        }
    }
    public Mahasiswa getFirst()throws Exception{
        if(isEmpty())throw new Exception("Linked List Kosong");
        return head.data;
    }
    public Mahasiswa getLast() throws Exception{
        if(isEmpty()) throw new Exception("LinkedList Kosong");
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Mahasiswa get(int index) throws Exception{
        if(isEmpty()||index>=size) throw new Exception("Nilai Index di luar batas");
        Node tmp = head;
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
            Node tmp = head;
            for (int i = 0; i < temp; i++) {
                tmp = tmp.next;
            }
            System.out.println("+=======================+");
            System.out.println("+Search by (Nama / NIM) +");
            System.out.println("+=======================+");
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
            Node prev = head;
            Node cur = head.next;
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
        if (get(0).nama.equalsIgnoreCase(item)) {
            removeFirst();
        }else{
            for (int i = 1; i < size; i++) {
                if (item.equalsIgnoreCase(get(i).nama)){
                    temp  = i;
                }
            }
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < temp; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    public void print(){
        System.out.println("+=======================+");
        System.out.println("|\t  PRINT\t\t|");
        System.out.println("+=======================+");
        
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkenList Kosong");
        }
        System.out.println();
    }
    public void sorting() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node curr;
        Node sorted = null;
        boolean swapped;
        if (head == null) {
            return;
        }
        do{
            swapped =false;
            curr=head;
            while(curr.next!=sorted){
                if (curr.data.nilai>curr.next.data.nilai) {
                    Mahasiswa temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr=curr.next;
            }
            sorted=curr;
        }while(swapped);
    }
}