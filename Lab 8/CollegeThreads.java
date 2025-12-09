// Thread to display "BMS College of Engineering" every 10 seconds
class BMSThread extends Thread {
    public void run() {
        while (true) { // Infinite loop
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // Sleep for 10,000 milliseconds (10 seconds)
            } catch (InterruptedException e) {
                System.out.println("BMS Thread interrupted");
            }
        }
    }
}

// Thread to display "CSE" every 2 seconds
class CSEThread extends Thread {
    public void run() {
        while (true) { // Infinite loop
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // Sleep for 2,000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                System.out.println("CSE Thread interrupted");
            }
        }
    }
}

public class CollegeThreads {
    public static void main(String[] args) {
        BMSThread bmsThread = new BMSThread();
        CSEThread cseThread = new CSEThread();

        bmsThread.start(); // Start BMS thread
        cseThread.start(); // Start CSE thread
    }
}

