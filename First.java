import java.util.Scanner;

public class First{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        do{
            System.out.println("Enter a number (0 to stop) : ");
            num = input.nextInt();
            sum += num;
        }
        while(num !=0);
        { 
            System.out.println("Program Existed The sum = " + sum);
        };

    input.close();
 
    };

};