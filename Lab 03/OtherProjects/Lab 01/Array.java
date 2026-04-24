import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        double avg = (double) sum / n;

        System.out.println("Tong = " + sum);
        System.out.println("Trung binh = " + avg);

        sc.close();
    }
}