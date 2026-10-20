import java.util.Scanner;


public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is a multiple of both 3 and 5.");
        } else if (num % 3 == 0) {
            System.out.println(num + " is a multiple of 3.");
        } else if (num % 5 == 0) {
            System.out.println(num + " is a multiple of 5.");
        } else {
            System.out.println(num + " is not a multiple of either 3 or 5.");
        }
        sc.close();
    }
}
