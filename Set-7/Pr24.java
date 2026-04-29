class NumberPrinter extends Thread {
    int start, end;

    NumberPrinter(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end   = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Pr24 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new NumberPrinter("T1",   1, 100);
        Thread t2 = new NumberPrinter("T2", 101, 200);
        Thread t3 = new NumberPrinter("T3", 201, 300);

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("All threads completed.");
    }
}