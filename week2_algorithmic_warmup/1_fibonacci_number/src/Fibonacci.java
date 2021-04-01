import java.util.Scanner;

public class Fibonacci {

  public static long fibArray[] = new long[150];
  private static long calc_fib(long n) {
    long fibValue = 0;
    if (n <= 1) {
      return n;
    }
    else if (fibArray[(int)n]!=0) {
      return fibArray[(int)n];
    }
    else {
      fibValue = calc_fib(n-1) + calc_fib(n-2);
      fibArray[(int)n] = fibValue;
      return fibValue;
    }

  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
