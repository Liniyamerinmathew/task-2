import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your option : 1. LargestOf_3 \n 2. SmallestOf_3 \n 3. Prime \n 4. EvenOrOdd\n 5. Reverse \n 6. Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                LargestOf_3();
                break;
            case 2:
                SmallestOf_3();
                break;
            case 3:
                Prime();
                break;
            case 4:
                EvenOrOdd();
                break;
            case 5:
                Reverse();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    public static void LargestOf_3() {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The largest number is: " + largest);
    }
    public static void SmallestOf_3() {
        int a, b, c, smallest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        temp = a > b ? b : a;
        smallest = c > temp ? temp : c;
        System.out.println("The smallest number is: " + smallest);
    }
    public static void Prime() {
        int i, n = 0, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number to check:");
        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }
    }
    public static void EvenOrOdd() {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }


}