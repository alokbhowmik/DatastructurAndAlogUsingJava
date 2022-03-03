import java.util.List;
import java.util.Scanner;

/**
 * ChefAndString
 */
public class ChefAndString {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int b = sc.nextInt();
            String s = "FINE";
            for (int j = 0; j < k; j++) {
                String x = sc.next();
                String y = sc.next();
                if (x.equals("wrong") && !y.contains("0") && !s.equals("INVALID"))
                    s = "WEAK";
                else if (x.equals("correct") && y.contains("0"))
                    s = "INVALID";
            }
            System.out.println(s);
        }
    }
}
