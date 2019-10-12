package BinarySearchTree;
import java.util.Scanner;
public class ProjectBTS {
    static BinarySearchTree b = new BinarySearchTree();
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
    public static void menu() {
        int pil, input;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ============= ");
        System.out.println("\tMenu");
        System.out.println("1. insert");
        System.out.println("2. delete");
        System.out.println("3. find");
        System.out.println("4. display");
        System.out.println("5. exit");
        System.out.print("pil : ");
        pil = sc.nextInt();
        System.out.println(" ============= ");
        switch(pil){
            case 1 : 
                System.out.print("input : ");
                input = sc.nextInt();
                b.insert(input);
                break;
            case 2 :
                System.out.print("input : ");
                input = sc.nextInt();
                b.delete(input);
                break;
            case 3 :
                System.out.print("input : ");
                input = sc.nextInt();
                System.out.println("Find "+input+" : ");
                b.find(input);
                break;
            case 4 :
                b.display(b.root);
                System.out.println();
                break;
            case 5 : 
                System.exit(0);
        }
    }
    
}
