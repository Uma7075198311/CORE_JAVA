package staticvariables;

public class Examp10 {
	static int executionCount = 0;
    static void process() {
        executionCount++;
        System.out.println("Method called " + executionCount + " times");
    }
    public static void main(String[] args) {
        process();
        process();
        process();
    }
}