package staticvariables;

public class Examp6 {
	static String company = "Infosys";
    static void display() {
        System.out.println("Company: " + company);
    }
    public static void main(String[] args) {
       Examp6.company = "TCS";
        Examp6.display();
    }
}