package conditional.Statements;

public class Example5 {
public boolean isDivisibleBy5(int num) {
	if(num%5==0) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		Example5 obj=new Example5();
		System.out.println("Is 15 divisible by 5?"+obj.isDivisibleBy5(15));

	}

}
