import java.util.Scanner;

public class NumbersCheck {
    static void numCheck(int num) {
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        }

        //simple_check
        boolean isSimple = true;
        if (num == 2) {
            System.out.println("The number is simple");
            isSimple = false;
        }
        if (num % 2 == 0 && num > 2) {
            System.out.println("The number is not simple");
            isSimple = false;

        } else if (num > 2) {
            for (int i = 3; i <= num / 2; i += 2) {
                if (num % i == 0) {
                    System.out.println("The number is not simple");
                    isSimple = false;
                    break;
                }

            }

        }
        if (isSimple == true && num > 2) {
            System.out.println("The number is simple");
        }

        if (!(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 6 == 0 || num % 9 == 0)) {
            System.out.println("The number is not divisible by 2, 5, 3, 6, 9 without rest");
        } else {
            System.out.println("The number is divisible by 2, 5, 3, 6, 9 without rest");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        numCheck(scan.nextInt());


    }
}
