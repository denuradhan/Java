package BinaryTree;
import java.util.Scanner;
public class BinaryTreeArrayMain {
    static Scanner sc = new Scanner(System.in);
    static BinaryTreeArray bta = new BinaryTreeArray();   
    static int max = 7, idxLast=0;
    static int[] data;
    public static void main(String[] args) {
//        System.out.print("jumlah isi max array : ");
//        max = sc.nextInt();
        data = new int[max];
        bta.populateData(data, idxLast, max);
        bta.add(data, 25);
        bta.add(data, 20);
        bta.add(data, 36);
        bta.add(data, 10);
        bta.add(data, 22);
        bta.add(data, 30);
        bta.add(data, 40);
        bta.GetParent(22);
        bta.GetChild(25);
        bta.GetSibling(20);
//        while(true){
//            menu();
//        }
    }
    public static void menu() {
        System.out.println("   Menu");
        System.out.println("============");
        System.out.println("1. add");
        System.out.println("2. print");
        System.out.println("3. exit");
        System.out.println("============");
        int pil, input;
        System.out.print(">>");
        pil = sc.nextInt();
        System.out.println("============");
        
        switch(pil){
            case 1 :
                System.out.print("input array index ke "+idxLast+" : ");
                input = sc.nextInt();
                bta.add(data, input);
                break;
            case 2 :
                System.out.println("Print");
                System.out.println("======================");
//                bta.traversePreOrder(0);
                System.out.println();
                bta.traverseInOrder(0);
                System.out.println();
//                bta.traversePostOrder(0);
//                System.out.println();
                System.out.println("======================");
                break;
            case 3 :
                System.exit(0);
                break;
            default :
                System.out.println("input salah");
                System.out.println("============");
        }
    }
}