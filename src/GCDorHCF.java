public class GCDorHCF {
    public static void main(String[] args) {
        gcd(36,60);
    }
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
///
}

