import java.util.Scanner;

public class FI_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial < 0) {
                System.out.println("Overflow occurred!");
                return;
            }
        }
        System.out.println(n + "! = " + factorial);
	}

}