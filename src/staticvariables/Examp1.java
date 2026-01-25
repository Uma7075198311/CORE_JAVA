package staticvariables;

public class Examp1 {
	 static int count = 0;
	 Examp1(){
	 	count++;
	 }
 public static void main(String[] args) {
	 	        new Examp1();
	 	        new Examp1();
	 	        new Examp1();
	 	        new Examp1();
	 	        new Examp1();
	 	        System.out.println("Count:"+count);
	
		// TODO Auto-generated method stub

	}

}
