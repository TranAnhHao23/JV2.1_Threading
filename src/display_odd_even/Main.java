package display_odd_even;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread odd = new Thread(oddThread);
        Thread even = new Thread(evenThread);

        odd.start();
        odd.join(); // check if odd run end them even runs
        even.start();
    }
}
class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Odd number = " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println("Even number = " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
