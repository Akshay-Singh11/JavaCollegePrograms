import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int divident = scn.nextInt();
        int divisor = scn.nextInt();

        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;

        }
        System.out.println("HCF IS " + divisor);
    }
}
