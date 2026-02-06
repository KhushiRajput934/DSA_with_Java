import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        // int num = 7;
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}