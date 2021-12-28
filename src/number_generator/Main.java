package number_generator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator nuumber1 = new NumberGenerator();
        NumberGenerator nuumber2 = new NumberGenerator();

        Thread thread1 = new Thread(nuumber1);
        Thread thread2 = new Thread(nuumber2);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        System.out.println("Thread 1 có priority là: "+thread1.getPriority());
        System.out.println("Thread 2 có priority là: "+thread2.getPriority());
    }
}
