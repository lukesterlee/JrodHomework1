package nyc.c4q.lukesterlee;

public class X62 {

    public static long pow2(long a, long b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

        if (b%2 == 0)
            return pow2(a*a, b/2);
        else
            return pow2(a*a, b/2) * a;
    }

    public static void main(String[] args) {

        /*
         * Solution#1
         * Log2(62) = 5.954...
         *
         * Solution#2
         * Time complexity of pow2(long a, long n) is O(logN)
         * E.g : pow2(X,62)
         *         ->pow2(X^2,31)
         *              ->pow2(X^4,15)*X^2
         *                  ->pow2(X^8,7)*X^4
         *                      ->pow2(X^16,3)*X^8
         *                          ->pow2(X^32,1)*X^16
         *                              ->X^32
         *  Therefore, X^62 = X^32*X^16*X^8*X^4*X^2.
         *  Why only 5 multiplications??? Now I'm confused.
         */


    }
}
