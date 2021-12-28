package find_prime_number;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazy = new Thread(lazyPrimeFactorization);
        Thread optimized = new Thread(optimizedPrimeFactorization);

        lazy.start();
        optimized.start();
    }
}
