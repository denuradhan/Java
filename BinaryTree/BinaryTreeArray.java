package BinaryTree;
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    int max;
    public BinaryTreeArray(){
        data = new int[idxLast];
    }
    void populateData(int data[], int idxLast, int max){
        this.data = data;
        this.idxLast = idxLast;
        this.max = max;
    }
    void add(int data[], int input){
        if (idxLast>=max) {
            System.out.println("array penuh");
        }else{
            data[idxLast]=input;
            idxLast++;
        }
    }
    void traverseInOrder(int idxStart){
        if (idxStart<idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void traversePreOrder(int idxStart){
        if (idxStart<idxLast) {
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
            
        }
    }
    void traversePostOrder(int idxStart){
        if (idxStart<idxLast) {
            System.out.print(data[idxStart]+" ");
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
        }
    }
    void GetParent(int value){
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]==value) {
                index = i;
            }
        }
        if (index%2!=0) {
            System.out.println("parent dari "+value+ " : "+data[index/2-1]);
        }else{
            System.out.println("parent dari "+value+ " : "+data[index/2-1]);
        }
    }
    void GetChild(int value){
        for (int i = 0; i < data.length; i++) {
            if(data[i]==value){
                System.out.println("child dari "+value+ " : "+data[i*2+1]);
                System.out.println("child dari "+value+ " : "+data[i*2+2]);
            }
        }
    }
    void GetSibling(int value){
        for (int i = 0; i < data.length; i++) {
            if (data[i]==value) {
                if(i%2==0){
                    System.out.println("sibling dari "+value+ " : "+data[i-1]);
                }else{
                    System.out.println("sibling dari "+value+ " : "+data[i+1]);
                }
            }
        }
    }
}