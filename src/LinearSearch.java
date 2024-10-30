import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Isi array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + ": " + data[i]);
        }
        System.out.print("\nMasukkan elemen yang ingin dicari: ");
        int key = scanner.nextInt();
        int result = linearSearch(data, key);
        if (result != -1) {
            System.out.println("Elemen ditemukan di indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan.");
        }
        scanner.close();
    }
}