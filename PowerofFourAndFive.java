import java.util.Scanner;

public class PowerofFourAndFive {
    public static void main(String[] args) {
        int no;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number:  ");
        no = input.nextInt();

        int total = 1;

        for (int i = 1; i <= no;  i*=4 ){
            System.out.println("Result (Power of number 4th): "+ i);
        }

        System.out.println("-------------------");

        for (int x = 1; x <= no; x *= 5){
            System.out.println("Result (Power of number 5th): "+ x);
        }
    }
}
