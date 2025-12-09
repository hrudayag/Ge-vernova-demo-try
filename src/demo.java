public class demo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a value for N.");
            return;
        }
        int N = Integer.parseInt(args[0]);
        if (N < 0 || N >= 31) {
            System.out.println("N must be between 0 and 30.");
            return;
        }
        int powerOfTwo = 1;
        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + powerOfTwo);
            powerOfTwo = powerOfTwo * 2;
        }
    }
}
