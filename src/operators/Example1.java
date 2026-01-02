package operators;

public class Example1 {
	int x=5;
	int y=8;
public void calculate() {
	System.out.println("Addition:"+(x+y));//13
	System.out.println("Subtraction:"+(x-y));//-3
	System.out.println("Multiplication:"+(x*y));//40
	System.out.println("Division:"+(x/y));//0
	System.out.println("Modulo:"+(x%y));//5
	System.out.println("...........................");
	++x;
	y++;
	System.out.println("Addition:"+(x+y));//15
	System.out.println("Subtraction:"+(x-y));//-3
	System.out.println("Multiplication:"+(x*y));//54
	System.out.println("Division:"+(x/y));//0
	System.out.println("Modulo:"+(x%y));//6
}
	public static void main(String[] args) {
	Example1 obj=new Example1();
	obj.calculate();

	}

}
