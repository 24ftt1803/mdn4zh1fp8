import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        // Eliminate duplicates by setting duplicates to 0
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) nums[j] = 0;
            }
        }

        Arrays.sort(nums);

        System.out.print("The distinct numbers are: ");
        for (int num : nums) {
            if (num != 0)
                System.out.print(num + " ");
        }
    }
}
