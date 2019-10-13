package BinaryTree;
import java.util.Scanner;
public class BinaryTreeMain {
    static Scanner sc = new Scanner(System.in);
    static BinaryTree bt = new BinaryTree();
    public static void main(String[] args) {
        bt.addR(6);
        bt.addR(4);
        bt.addR(8);
        bt.addR(3);
        bt.addR(5);
        bt.addR(7);
        bt.addR(9);
        bt.addR(10);
        bt.addR(15);
        while (true) {            
            menu();
        }
    }
    public static void menu() {
        System.out.println("Menu");
        System.out.println("==============");
        System.out.println("1. add");
        System.out.println("2. delete");
        System.out.println("3. find");
        System.out.println("4. traverse inOrder");
        System.out.println("5. traverse preOrder");
        System.out.println("6. traverse postOrder");
        System.out.println("7. keluar");
        System.out.println("==============");
        System.out.print(">>");
        int pil = sc.nextInt();
        int input;
        switch(pil){
            case 1 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.addR(input);
                break;
            case 2 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.delete(input);
                break;
            case 3 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.find(input);
                break;
            case 4 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.traverseInOrder(bt.root);
                System.out.println();
                break;
            case 5 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.traversePreOrder(bt.root);
                System.out.println();
                break;
            case 6 :
                System.out.println("==============");
                System.out.print(">>");
                input = sc.nextInt();
                bt.traversePostOrder(bt.root);
                System.out.println();
                break;
            case 7 :
                System.exit(0);
                break;
            default :
                System.out.println("Input salah");
                break;
        }
    }
}
