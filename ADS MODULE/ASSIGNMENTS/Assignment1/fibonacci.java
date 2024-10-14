 class fibonacci {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Fibonacci Series up to " + n + "");
        print(n);
    }
}