public class Fibonacci {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                if (n < 0) {
                    System.err.println("Please enter a positive integer input.");
                    System.exit(1);
                }

                long result = calculateFibonacci(n);
                System.out.println("The " + n + "th Fibonacci number is: " + result);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("Please provide an integer as a command-line argument.");
            System.exit(1);
        }
    }

    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            long a = 0;
            long b = 1;
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}