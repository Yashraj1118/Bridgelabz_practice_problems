import java.util.Scanner;
public class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) System.out.println(i);
        }
    }
}