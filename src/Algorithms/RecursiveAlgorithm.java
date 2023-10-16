package Algorithms;

public class RecursiveAlgorithm {

        public static int recursiveFactorial(int n) {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 1;
            } else {
                return n * recursiveFactorial(n - 1);
            }
        }

}
