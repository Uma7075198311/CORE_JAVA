package staticvariables;

public class Examp7 {
	static int StaticVar = 0;
    int nonStaticVar = 0;
    public void increment() {
        StaticVar++;
        nonStaticVar++;
        System.out.println("StaticVarible:"+StaticVar);
        System.out.println("NonStaticVarible:"+ nonStaticVar);
    }
    public static void main(String[] args) {
        Examp7 E1 = new Examp7();
        Examp7 E2 = new Examp7();
        E1.increment();
        E2.increment();
    }
}
	