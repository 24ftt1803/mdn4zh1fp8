import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are there? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of left shift: ");
        int shift = sc.nextInt();

        for (int s = 0; s < shift; s++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        System.out.print("The shifted arrangement is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
