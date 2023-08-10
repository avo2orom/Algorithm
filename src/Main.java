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
    }
}
