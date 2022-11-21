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

}