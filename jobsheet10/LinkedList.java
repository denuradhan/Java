package jobsheet10;
public class LinkedList {
    Node head;
    int size;
    
    public LinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        head = new Node(item, head);
        size++;
    }
    public void add(int item, int index) throws Exception{
        if (index<0 || index>size) throw new Exception("Nilai indeks di luar batas");
        
        if (isEmpty()||index==0){
            addFirst(item);
        }else{
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp=tmp.next;
            }
            Node next = (tmp==null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }
    public void addKey(int item){
        if (isEmpty()){
            addFirst(item);
        }else{
            Node tmp = head;
                for (int i = 1; i < size; i++) {
                    tmp=tmp.next;
                }
                Node next = (tmp==null) ? null : tmp.next;
                tmp.next = new Node(item, next);
                size++;
        }
    }
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next= new Node(item, null);
            size++;
        }
    }
    public int getFirst() throws Exception{
        if(isEmpty()) throw new Exception("LinkedList Kosong");
        return head.data;
    }
    public int getLast() throws Exception{
        if(isEmpty()) throw  new Exception("LinkedList Kosong");
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index) throws Exception {
        if(isEmpty()|| index>=size) throw new Exception("Nilai Index di luar batas");
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getKey(int item) throws Exception {
        if(isEmpty()) throw new Exception("Nilai Index di luar batas");
        int temp =0;
        for (int i = 0; i < size; i++) {
            if (get(i)==item) {
                temp = i;
            }
        }
        Node tmp = head;
        for (int i = 0; i < temp; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void remove(int index) throws Exception{
        if(isEmpty()||index>=size) throw new Exception("Nilai Index di luar batas");
        if(index == 0){
            removeFirst();
        }else{
            Node prev = head;
            Node cur = head.next;
            
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeKey(int item) throws Exception{
        if(isEmpty()) throw new Exception("Nilai Index di luar batas");
        int temp = 0;
        if (item == get(item)) {
            removeFirst();
        }else{
            for (int i = 1; i < size; i++) {
                if (item==get(i)) {
                    temp =i;
                }
            }
                Node prev = head;
                Node cur = head.next;

                for (int i = 1; i < temp; i++) {
                    prev = cur;
                    cur = prev.next;
                }
                prev.next = cur.next;
                size--;
        }
    }
    public void removeFirst() throws Exception {
        int tmp = getFirst();
        head = head.next;
        size--;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedList Kosong");
        }
    }
}