package find_prime_number;

public class OptimizedPrimeFactorization implements Runnable {

    public OptimizedPrimeFactorization() {
    }

    @Override
    public void run() {
        for (int i = 2; i < 10000; i++) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check == true) {
                System.out.println("Optimized: " + i + " là số nguyên tố");
            }
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
