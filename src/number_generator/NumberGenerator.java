package number_generator;

public class NumberGenerator implements Runnable {

    public NumberGenerator() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Số thứ " + i + " có hashCode là: " + hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
