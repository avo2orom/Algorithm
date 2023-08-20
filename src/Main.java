import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new Random().nextInt(20);
        }

    Print.print(array);
    HeapSort.HeapSort(array);
    Print.print(array);

    BinaryTree<Integer> tree = new BinaryTree<>();

    tree.add(6);
    tree.add(3);
    tree.add(2);
    tree.add(4);
    tree.add(5);
    tree.add(1);
    tree.add(9);
    tree.add(7);
    tree.add(11);
    tree.add(8);
    tree.add(12);
    tree.add(15);
    tree.add(10);

    tree.print();


    }
}
