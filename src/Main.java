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
}