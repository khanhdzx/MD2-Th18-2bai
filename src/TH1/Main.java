package TH1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDeme runnableDeme1 = new RunnableDeme("Thread-1-HR-Database");
        runnableDeme1.start();

        RunnableDeme runnableDeme2 = new RunnableDeme("Thread-2-HR-Database");
        runnableDeme2.start();

        System.out.println("Main thread stopped!! ");
    }
}
