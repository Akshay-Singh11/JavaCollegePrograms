import java.util.Scanner;

public class SumofnNaturalnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= n) {

            sum = sum + counter;
            counter += 1;
        }
        System.out.println(sum);
    }
}
