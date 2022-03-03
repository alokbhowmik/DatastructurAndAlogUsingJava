import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MightyFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int data[] = new int[n];
            Integer mo[], lo[], mosize;

            if (n % 2 == 0) {
                mosize = n / 2 ;
                mo = new Integer[mosize];
            } else {
                mosize = n / 2 +1;
                mo = new Integer[mosize];
            }
            lo = new Integer[n - mosize];

            for (int i = 0; i < n; i++) {
                data[i] = sc.nextInt();
            }

            separate(data, mo, lo);
            Arrays.sort(mo, Collections.reverseOrder());
            Arrays.sort(lo);

            exchangeValues(mo, lo, k);
            int totalOfMo = sum(mo);
            int totalOfLo = sum(lo);

            if(totalOfLo > totalOfMo){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static int sum(Integer[] lo) {
        int total = 0;
        for (Integer data : lo) {
            total+= data;       
        }
        return total;
    }

    private static void exchangeValues(Integer[] mo, Integer[] lo, int k) {
        for (int i = 0; i < k; i++) {
            if (mo.length > i && lo.length > i)
                if (mo[i] > lo[i]) {
                    Integer temp = mo[i];
                    mo[i] = lo[i];
                    lo[i] = temp;

                }
        }
    }

    private static void separate(int[] data, Integer[] mo, Integer[] lo) {
        int k = 0, l = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                mo[k++] = data[i];
            } else {
                lo[l++] = data[i];
            }
        }
    }
}
