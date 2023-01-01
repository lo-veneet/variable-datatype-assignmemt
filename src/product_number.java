import java.util.Scanner;
public class product_number {
    public static void main(String[] args) {
        System.out.println("enter value of x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter value of y:");

        Scanner gc = new Scanner(System.in);
        int y = gc.nextInt();

        System.out.println("product of x and y i s:"+ x*y);

    }
}
