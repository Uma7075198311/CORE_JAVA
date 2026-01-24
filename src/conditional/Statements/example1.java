package conditional.Statements;

public class example1 {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		example1 obj=new example1();
		if(	obj.isEven(10)) {
			System.out.println("Is 10 even?"+obj.isEven(10));
		}else {
			System.out.println("Odd Number");
		}
		
		}

}