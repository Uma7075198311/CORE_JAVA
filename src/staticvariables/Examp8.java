package staticvariables;

public class Examp8 {
	   static int staticCount = 0;
	    int instanceCount = 0;
public  void increment() {
	        staticCount++;
	        instanceCount++;
	    }
public void display() {
	        System.out.println("Static:" + staticCount );
	        System.out.println("Instance:" + instanceCount);
	    }
	    public static void main(String[] args) {
	        Examp8 c1 = new Examp8();
	        Examp8 c2 = new Examp8();

	        c1.increment();
	        c1.increment();
	        c2.increment();

	        c1.display();
	        c2.display();
	    }
	}
	