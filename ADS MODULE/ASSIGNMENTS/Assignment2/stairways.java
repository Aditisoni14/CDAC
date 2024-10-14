class stairways{
        static int way(int n)
        {
            if (n<=1) 
            return n;
            return way(n - 1) + way(n - 2); // it take 1 or 2 step
        }
        static int countWays(int s)   //no. of ways to reach sth stair uppr or lower 
        {
            return way(s + 1);
        }
    public static void main(String[] args )
    {
        int s = 3;
        System.out.println("Number of ways = " + countWays(s));
    }
}