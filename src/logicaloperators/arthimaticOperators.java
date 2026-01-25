package logicaloperators;

public class arthimaticOperators {

	int x=5;
	int y=3;
	public void methodCalculate() {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y);
		System.out.println("*********************");
		++x;
		y++;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y);
	}
	public static void main(String[] args) {
		arthimaticOperators obj=new arthimaticOperators();
		obj.methodCalculate();
	}
}