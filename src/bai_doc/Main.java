package bai_doc;

public class Main extends Thread {
    public static void main(String[] args) {
        // Tạo thread
        Thread t = Thread.currentThread();
        System.out.println("Thread hiện tại: " + t.getName());

        // Đặt lại tên thread
        t.setName("Codegym");
        System.out.println("Sau khi đổi tên: " + t.getName());

        // Kiểm tra và cài đặt mức độ ưu tiên
        System.out.println("Độ ưu tiên mới của main thread: " + t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println("Độ ưu tiên mới của thread: " + t.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("bai_doc.Main thread");
        }

        // tạo 1 thread con
        ChildThread childThread = new ChildThread();
        System.out.println("Tên của thread con: " + childThread.getName());

        System.out.println("Độ ưu tiên của child thread: " + childThread.getPriority());
        childThread.setPriority(MIN_PRIORITY);
        System.out.println("Độ ưu tiên mới của thread: " + childThread.getPriority());


    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
}

