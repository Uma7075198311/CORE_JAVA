package variables;

public class Task9 {
	 int instanceVar = 10;
	    static int staticVar = 20;
	    void display() {
	    int localVar = 30;
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Task9 obj1 = new 	Task9();
	        obj1.display();
	        obj1.instanceVar = 50;
	        Task9.staticVar = 100;
	        System.out.println("After modification:");
	        obj1.display();
	       Task9 obj2 = new Task9();
	        System.out.println("Using second object:");
	        obj2.display();
	}

}
