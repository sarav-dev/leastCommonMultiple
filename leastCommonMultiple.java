import java.util.*;

class leastCommonMultiple {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        // System.out.println("Enter no. of test cases: ");
        // int T = sc.nextInt();
            System.out.println("Enter first integer: ");
            int A = sc.nextInt();
            System.out.println("Enter second integer: ");
            int B = sc.nextInt();
        System.out.println("LCM = " + solve(A, B));
        sc.close();
    }

    public static int solve(int A, int B) {
            int i;
            int C = (A > B)? A:B;;
            for (i=C; i<= A*B; i=i+C) {
                if (i%A == 0 && i%B == 0) break;
            }
        return i;
    }
}