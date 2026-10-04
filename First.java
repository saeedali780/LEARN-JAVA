import java.util.Scanner;

class CheckEvenOdd {
    Scanner sc = new Scanner(System.in);
    int num;

    CheckEvenOdd() {
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    void checker(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}

public class First {
    public static void main(String[] args) {
        CheckEvenOdd obj = new CheckEvenOdd();
        obj.checker(obj.num);
    }
}
