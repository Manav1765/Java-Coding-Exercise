class TablePrinter {
    synchronized void printTable(int number) {
        System.out.println("=== Table of " + number + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d%n", number, i, number * i);
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    TablePrinter printer;
    int          number;

    TableThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number  = number;
    }

    @Override
    public void run() {
        printer.printTable(number);
    }
}

public class Pr25 {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        Thread t1 = new TableThread(printer, 5);
        Thread t2 = new TableThread(printer, 7);
        t1.start();
        t2.start();
    }
}