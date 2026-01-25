package staticvariables;

public class Examp4 {
	 static double interestRate = 5.0;
	    double balance;

	    Examp4(double balance) {
	        this.balance = balance;
	    }
	    static void changeInterestRate(double rate) {
	        interestRate = rate;
	    }
	   public  void display() {
	        System.out.println("Balance: " + balance); 
	        		System.out.println("Interest Rate: " + interestRate);
	    }
	    public static void main(String[] args) {
	        Examp4 e1 = new Examp4(10000);
	        Examp4 e2 = new Examp4(20000);
	        Examp4.changeInterestRate(6.5);
	        e1.display();
	        e2.display();
	    }
	}
	